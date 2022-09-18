package com.furren.test.items;

import com.furren.test.init.ItemInit;
import com.furren.test.main.Main;

import net.minecraft.item.ItemAxe;

public class ItemToolAxe extends ItemAxe {
    public ItemToolAxe(String name, ToolMaterial material) {
    	super(material, material.getAttackDamage() + 5.5F, -3);

    	this.setRegistryName(name);
        this.setUnlocalizedName(name);
        
        this.setCreativeTab(Main.CTAB);
        ItemInit.ITEMS.add(this);
    }
}
