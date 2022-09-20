package com.furren.test.handlers;

import java.lang.reflect.Field;

import akka.routing.Pool;
import net.minecraft.client.audio.Sound;
import net.minecraft.client.audio.SoundHandler;
import net.minecraft.client.audio.SoundList;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.storage.loot.LootPool;
import net.minecraft.world.storage.loot.LootTable;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraftforge.client.event.sound.SoundEvent;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class EventHandler {
    @SubscribeEvent
    public void onJoin(EntityJoinWorldEvent e) {
        if (e.getEntity() instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer) e.getEntity();
            player.sendMessage(new TextComponentString("Hello, %p!".replace("%p", player.getName())));
            player.playSound(Sounds.GIGA_COAL_SOUND, 1.0F, 1.0F);
            //world.playSound(blockPos, Sounds.test, SoundCategory.PLAYERS, 1.0F, 1.0F, false)
        }
    }

    
    /*public void onLoot(LootTableLoadEvent e) {
        if (LootTableList.CHESTS_SPAWN_BONUS_CHEST.equals(e.getName())) {
            final ResourceLocation loc = new ResourceLocation("test", "chests/test_spawn_chest");
            final LootTable customLootTable = e.getLootTableManager().getLootTableFromLocation(loc);
            e.setTable(customLootTable);
        }
    }*/
    
    @SubscribeEvent
    public void onLoot(LootTableLoadEvent event) {
    	if(LootTableList.CHESTS_SPAWN_BONUS_CHEST.equals(event.getName()) |
    			LootTableList.CHESTS_DESERT_PYRAMID.equals(event.getName()) |
    			LootTableList.CHESTS_SIMPLE_DUNGEON.equals(event.getName()) |
    			LootTableList.CHESTS_VILLAGE_BLACKSMITH.equals(event.getName()) |
    			LootTableList.CHESTS_STRONGHOLD_LIBRARY.equals(event.getName()) |
    			LootTableList.CHESTS_NETHER_BRIDGE.equals(event.getName()) ) {
	    	final ResourceLocation loc = new ResourceLocation("test", "chests/test_spawn_chest");
	    	LootTable customLootTable = event.getLootTableManager().getLootTableFromLocation(loc);
	    	//System.out.print(customLootTable.getPool("chest_1"));
	    	event.getTable().addPool(customLootTable.getPool("chest_1"));
    	}
    }
}