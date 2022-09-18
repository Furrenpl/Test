package com.furren.test.items;

import com.furren.test.init.ItemInit;
import com.furren.test.main.Main;

import net.minecraft.item.ItemPickaxe;

public class ItemToolPickaxe extends ItemPickaxe {
    public ItemToolPickaxe(String name, ToolMaterial material) {
        super(material);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        
        this.setCreativeTab(Main.CTAB);
        ItemInit.ITEMS.add(this);
    }
}