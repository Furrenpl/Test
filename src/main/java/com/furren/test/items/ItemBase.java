package com.furren.test.items;

import com.furren.test.init.ItemInit;
import com.furren.test.main.Main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item {

	public ItemBase(String name, int StackSize) {
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setCreativeTab(Main.CTAB);
        this.setMaxStackSize(StackSize);
        
        ItemInit.ITEMS.add(this);
    }
	public ItemBase(String name) {
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setCreativeTab(Main.CTAB);
        
        ItemInit.ITEMS.add(this);
    }
}