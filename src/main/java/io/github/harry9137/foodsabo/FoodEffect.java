package io.github.harry9137.foodsabo;

import io.github.harry9137.foodsabo.item.ItemCyanidePowder;
import io.github.harry9137.foodsabo.item.ItemPoisonSac;
import io.github.harry9137.foodsabo.item.PoisonItem;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public enum FoodEffect {
    CYANIDE ("foodsabo:cyanide_powder", makeEffect(20, 2), makeEffect(9, 1), makeEffect(17, 1)),
    PUFFERFISH ("foodsabo:poison_sac", makeEffect(18, 2), makeEffect(9, 1), makeEffect(17, 1), makeEffect(20, 3));

    private PotionEffect[] effects;

    private String affectedItem;

    FoodEffect(String relatedItem, PotionEffect... effects){
        this.affectedItem = relatedItem;
        this.effects = effects;
    }

    public void apply(EntityLivingBase living){
        for(int i = 0; i < effects.length; i++){
            living.addPotionEffect(effects[i]);
        }
    }

    public void apply(EntityPlayer player){
        for(int i = 0; i < effects.length; i++){
            player.addPotionEffect(effects[i]);
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

    private static PotionEffect makeEffect(int id, int strength){
        return new PotionEffect(Potion.getPotionById(id), Reference.FOOD_DURATION, strength, false, true);
    }
}
