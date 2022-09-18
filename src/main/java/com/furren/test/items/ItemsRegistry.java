package com.furren.test.items;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

import com.furren.test.init.ItemInit;

import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ObjectHolder("test")
@Mod.EventBusSubscriber
public class ItemsRegistry {
	
	@SubscribeEvent
    public static void onRegistryItem(RegistryEvent.Register<Item> e) {	
		e.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
    }
	
	@SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void onRegistryModel(ModelRegistryEvent e) {
		for(Item item : ItemInit.ITEMS) {
			registryModel(item);
		}
    }
	
	@SideOnly(Side.CLIENT)
	private static void registryModel(Item item) {
	    final ResourceLocation regName = item.getRegistryName();
	    final ModelResourceLocation mrl = new ModelResourceLocation(regName, "inventory");
	    ModelBakery.registerItemVariants(item, mrl);
	    ModelLoader.setCustomModelResourceLocation(item, 0, mrl);
	}
	
}
