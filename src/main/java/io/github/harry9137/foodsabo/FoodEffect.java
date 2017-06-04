package io.github.harry9137.foodsabo;

import io.github.harry9137.foodsabo.item.ItemCyanidePowder;
import io.github.harry9137.foodsabo.item.ItemPoisonSac;
import io.github.harry9137.foodsabo.item.PoisonItem;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public enum FoodEffect {
    CYANIDE (new ItemCyanidePowder().getRegistryName().toString(), new PotionEffect(Potion.getPotionById(20), Reference.FOOD_DURATION, 2), new PotionEffect(Potion.getPotionById(9), Reference.FOOD_DURATION, 1), new PotionEffect(Potion.getPotionById(17), Reference.FOOD_DURATION)),
    PUFFERFISH (new ItemPoisonSac().getRegistryName().toString(), new PotionEffect(Potion.getPotionById(18), Reference.FOOD_DURATION, 2), new PotionEffect(Potion.getPotionById(9), Reference.FOOD_DURATION, 1), new PotionEffect(Potion.getPotionById(17), Reference.FOOD_DURATION, 1), new PotionEffect(Potion.getPotionById(20), Reference.FOOD_DURATION, 3));

    private PotionEffect[] effects;

    private String affectedItem;

    FoodEffect(String relatedItem, PotionEffect... effects){
        this.affectedItem = relatedItem;
        this.effects = effects;
    }

    public void apply(EntityLivingBase living){
        for(PotionEffect effect : effects){
            living.addPotionEffect(effect);
        }
    }

    public static FoodEffect getFromItem(PoisonItem item){
        for(FoodEffect effect : FoodEffect.values())
            if(effect.affectedItem.equalsIgnoreCase(item.getRegistryName().toString()))
                return effect;

        return null;
    }

    public String getAffectedItem() {
        return affectedItem;
    }
}
