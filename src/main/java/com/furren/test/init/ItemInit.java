package com.furren.test.init;

import java.util.ArrayList;
import java.util.List;

import com.furren.test.items.FoodDiamondApple;
import com.furren.test.items.ItemBase;
import com.furren.test.items.ItemToolAxe;
import com.furren.test.items.ItemToolPickaxe;
import com.furren.test.items.ItemToolHoe;
import com.furren.test.items.ItemToolSpade;
import com.furren.test.items.ItemToolSword;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit {
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//materials
	public static final Item.ToolMaterial STEEL_MATERIAL = EnumHelper.addToolMaterial("test:steel", 3, 900, 7.0F, 2.5F, 12);
	
	//tools
	public static final Item STEEL_AXE = new ItemToolAxe("steel_axe", STEEL_MATERIAL); 
	public static final Item STEEL_PICKAXE = new ItemToolPickaxe("steel_pickaxe", STEEL_MATERIAL); 
	public static final Item STEEL_HOE = new ItemToolHoe("steel_hoe", STEEL_MATERIAL);
	public static final Item STEEL_SPADE = new ItemToolSpade("steel_spade", STEEL_MATERIAL);
	public static final Item STEEL_SWORD = new ItemToolSword("steel_sword", STEEL_MATERIAL);
	
	//items
	public static final Item IRON_ROD = new ItemBase("iron_rod");
	public static final Item STEEL_INGOT = new ItemBase("steel_ingot");
	public static final Item DIAMOND_APPLE = new FoodDiamondApple("diamond_apple", 20, 10, false);
}
