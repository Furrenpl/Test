package com.furren.test.items;

import com.furren.test.init.ItemInit;
import com.furren.test.main.Main;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public class ItemModArmor extends ItemArmor{
	public ItemModArmor(String name, ArmorMaterial material, int renderIndex, EntityEquipmentSlot eqSlot) {
		super(material, renderIndex, eqSlot);
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
		
		this.setCreativeTab(Main.CTAB);
        ItemInit.ITEMS.add(this);
	}

}
