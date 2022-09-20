package com.furren.test.proxy;

import com.furren.test.handlers.EventHandler;
import com.furren.test.handlers.Sounds;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {
	
	public void preInit(FMLPreInitializationEvent event){
		MinecraftForge.EVENT_BUS.register(new EventHandler());
		MinecraftForge.EVENT_BUS.register(new Sounds());
		ResourceLocation location = new ResourceLocation("test", "giga_coal_sound");
		SoundEvent e = new SoundEvent(location);
		e.setRegistryName("giga_coal_sound");
		//GameRegistry.register(e, new ResourceLocation("test" + ":" + "giga_coal_sound"));
		MinecraftForge.EVENT_BUS.register(e);
		
    }

    public void init(FMLInitializationEvent event){

    }
    
    public void postInit(FMLPostInitializationEvent event) {

    }
}
