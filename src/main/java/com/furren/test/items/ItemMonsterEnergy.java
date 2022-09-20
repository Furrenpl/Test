package com.furren.test.items;

import com.furren.test.init.ItemInit;
import com.furren.test.main.Main;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.NonNullList;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;

public class ItemMonsterEnergy extends ItemFood{
	public ItemMonsterEnergy(String name, int StackSize) {
		super(4, 4, false);
        this.setRegistryName(name);     
        this.setUnlocalizedName(name);
        this.setMaxStackSize(StackSize);
        this.setAlwaysEdible();
        
        this.setCreativeTab(Main.CTAB);
        ItemInit.ITEMS.add(this);
    }
	
	@Override
    public EnumAction getItemUseAction(ItemStack stack) {
        return EnumAction.DRINK;
    }
	
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
	    super.onFoodEaten(stack, worldIn, player);
	    player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 666, 6));
	    player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 666, 6));
	    player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 666, 6));
	}
}

