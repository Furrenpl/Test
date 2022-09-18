package com.furren.test.items;

import com.furren.test.init.ItemInit;
import com.furren.test.main.Main;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.asm.transformers.PotionEffectTransformer;

public class FoodDiamondApple extends ItemFood {
	public FoodDiamondApple(String name, int amount, float saturation, boolean isWolfFood) {
        super(amount, saturation, isWolfFood);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setAlwaysEdible();
        this.setCreativeTab(Main.CTAB);
        
        ItemInit.ITEMS.add(this);
    }
	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
	    super.onFoodEaten(stack, worldIn, player);
	    //if (player.getFoodStats().getFoodLevel() > 2)
	    player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 3000, 3));
	    player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 3000, 3));
	    player.addPotionEffect(new PotionEffect(MobEffects.ABSORPTION, 3000, 3));
	    player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 3000, 3));
	    player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 3000, 3));
	    player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 3000, 3));
	    player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 3000, 3));
	}
}
