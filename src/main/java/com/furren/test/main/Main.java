package com.furren.test.main;

import com.furren.test.init.ItemInit;
import com.furren.test.items.ItemsRegistry;
import com.furren.test.proxy.CommonProxy;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(	modid = Main.MODID,
		version = Main.VERSION,
		acceptedMinecraftVersions = Main.ACCEPTED_MINECRAFT_VERSIONS)

public class Main {
	
	public static final String MODID = "test";
    public static final String VERSION = "1.0.1";
    public static final String ACCEPTED_MINECRAFT_VERSIONS = "1.12.2, 1.12.1";
	
	@SidedProxy(clientSide = "com.furren.test.proxy.ClientProxy", serverSide = "com.furren.test.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	public static final CreativeTabs CTAB = new CreativeTabs("test") {
	    @Override
	    public ItemStack getTabIconItem() {
	        return new ItemStack(ItemInit.DIAMOND_APPLE);
	    }
	};
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}
	
}
