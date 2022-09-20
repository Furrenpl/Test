package com.furren.test.init;

import java.util.ArrayList;
import java.util.List;

import com.furren.test.items.FoodDiamondApple;
import com.furren.test.items.ItemBase;
import com.furren.test.items.ItemFuel;
import com.furren.test.items.ItemModArmor;
import com.furren.test.items.ItemMonsterEnergy;
import com.furren.test.items.ItemToolAxe;
import com.furren.test.items.ItemToolPickaxe;
import com.furren.test.items.ItemToolHoe;
import com.furren.test.items.ItemToolSpade;
import com.furren.test.items.ItemToolSword;
import com.furren.test.main.Main;
import com.furren.test.items.ItemModArmor;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit {
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//items
	public static final Item IRON_ROD = new ItemBase("iron_rod");
	public static final Item STEEL_INGOT = new ItemBase("steel_ingot");
	public static final Item DIAMOND_APPLE = new FoodDiamondApple("diamond_apple", 20, 10, false);
	public static final Item MONSTER_ENERGY_BLACK = new ItemMonsterEnergy("monster_energy_black", 16);
	public static final Item MONSTER_ENERGY_WHITE = new ItemMonsterEnergy("monster_energy_white", 16);
	public static final Item MONSTER_ENERGY_YELLOW = new ItemMonsterEnergy("monster_energy_yellow", 16);
	public static final Item GIGA_COAL = new ItemFuel("giga_coal", 150000, 1);
	
	
	
	//materials
	public static final Item.ToolMaterial STEEL_MATERIAL = EnumHelper.addToolMaterial("test:steel", 3, 900, 7.0F, 2.5F, 12).setRepairItem(new ItemStack(STEEL_INGOT));
	public static final ItemArmor.ArmorMaterial STEEL_ARMOR_MATERIAL = EnumHelper.addArmorMaterial(
			"test:steelarmor", //material name
			"test:steelarmor", //texture name
			10, //durability
			new int[] {2, 5, 3, 1}, //durability damage 
			8, //enchantment
			SoundEvents.ITEM_ARMOR_EQUIP_IRON, //sound on equip
			1.0F).setRepairItem(new ItemStack(STEEL_INGOT)); //toughness
	
	//tools
	public static final Item STEEL_AXE = new ItemToolAxe("steel_axe", STEEL_MATERIAL); 
	public static final Item STEEL_PICKAXE = new ItemToolPickaxe("steel_pickaxe", STEEL_MATERIAL); 
	public static final Item STEEL_HOE = new ItemToolHoe("steel_hoe", STEEL_MATERIAL);
	public static final Item STEEL_SPADE = new ItemToolSpade("steel_spade", STEEL_MATERIAL);
	public static final Item STEEL_SWORD = new ItemToolSword("steel_sword", STEEL_MATERIAL);
	
	//armor
	public static final Item
	STEEL_HELMET = new ItemModArmor("steel_helmet", STEEL_ARMOR_MATERIAL, 1, EntityEquipmentSlot.HEAD),
	STEEL_CHESTPLATE = new ItemModArmor("steel_chestplate", STEEL_ARMOR_MATERIAL, 1, EntityEquipmentSlot.CHEST),
	STEEL_LEGGINGS = new ItemModArmor("steel_leggings", STEEL_ARMOR_MATERIAL, 2, EntityEquipmentSlot.LEGS),
	STEEL_BOOTS = new ItemModArmor("steel_boots", STEEL_ARMOR_MATERIAL, 1, EntityEquipmentSlot.FEET);
			
	
	
}
