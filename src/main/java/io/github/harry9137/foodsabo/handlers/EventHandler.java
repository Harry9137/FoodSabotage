package io.github.harry9137.foodsabo.handlers;

import io.github.harry9137.foodsabo.FoodEffect;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.HashMap;

public class EventHandler {
    HashMap<String, ItemStack> lastFoodUsed = new HashMap<String, ItemStack>();

    @SubscribeEvent
    public void useHandle(LivingEntityUseItemEvent.Start event){
        if(event.getEntity().getEntityWorld().isRemote) {
            if (event.getItem().getItem() instanceof ItemFood) {
                //System.out.println("Item started to use " + event.getEntityLiving().getName() + " : " + event.getItem().getItem().getRegistryName().toString());
                lastFoodUsed.put(event.getEntityLiving().getName(), event.getItem());
            }
        }
    }

    @SubscribeEvent
    public void eatEndHandle(LivingEntityUseItemEvent.Finish event) {
        if (event.getEntity().getEntityWorld().isRemote) {
            EntityLivingBase living = event.getEntityLiving();
            ItemStack item = lastFoodUsed.get(living.getName());
            System.out.println("Result Stack: " + event.getResultStack().getItem().getRegistryName().toString());
            System.out.println("Used Item");
            if (item.getItem() instanceof ItemFood) {
                System.out.println("Item instanceof Food");
                if (item.hasTagCompound()) {
                    System.out.println("Item has Tags");
                    if (item.getTagCompound().hasKey("effect")) {
                        System.out.println("Item has Effect Tag");
                        FoodEffect foodEffect = FoodEffect.valueOf(item.getTagCompound().getString("effect"));
                        foodEffect.apply(living);
                    }
                }
            } else {
                System.out.println("Item used of type: " + item.getItem().getRegistryName().toString());
            }

        }
    }
}
