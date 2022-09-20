package com.furren.test.items;

import javax.swing.text.html.parser.Entity;

import com.furren.test.handlers.Sounds;
import com.furren.test.init.ItemInit;
import com.furren.test.main.Main;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class ItemFuel extends Item{
	private int BurnTime;
	public ItemFuel(String name, int BTime, int SSize) {
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setMaxStackSize(SSize);
        this.setCreativeTab(Main.CTAB);
        BurnTime = BTime;
        ItemInit.ITEMS.add(this);
    }
	
	@Override
	public int getItemBurnTime(ItemStack itemStack) {
	    return BurnTime;
	}
	
}
