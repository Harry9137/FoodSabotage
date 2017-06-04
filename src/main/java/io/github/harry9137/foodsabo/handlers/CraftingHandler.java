package io.github.harry9137.foodsabo.handlers;

import io.github.harry9137.foodsabo.FoodEffect;
import io.github.harry9137.foodsabo.item.PoisonItem;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.NonNullList;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeHooks;

public class CraftingHandler implements IRecipe {
    @Override
    public boolean matches(InventoryCrafting inv, World worldIn) {
        //System.out.println("Tried to match food in central slot");
        if(!(inv.getStackInSlot(4).getItem() instanceof ItemFood) && !inv.getStackInSlot(4).hasTagCompound()) {
            //System.out.println("Err: Item " + inv.getStackInSlot(4).getItem().getRegistryName().toString() + " in slot 4 was not an instance of ItemFood");
            return false;
        }
        if(!(inv.getStackInSlot(1).getItem() instanceof PoisonItem)){
            //System.out.println("Err: Item " + inv.getStackInSlot(1).getItem().getRegistryName().toString() + " in slot 1 was not an instance of PoisonItem");
            return false;
        }
        if(!(inv.getStackInSlot(3).getItem() instanceof PoisonItem)){
            //System.out.println("Err: Item " + inv.getStackInSlot(3).getItem().getRegistryName().toString() + " in slot 3 was not an instance of PoisonItem");
            return false;
        }
        if(!(inv.getStackInSlot(5).getItem() instanceof PoisonItem)){
            //System.out.println("Err: Item " + inv.getStackInSlot(5).getItem().getRegistryName().toString() + " in slot 5 was not an instance of PoisonItem");
            return false;
        }
        if(!(inv.getStackInSlot(7).getItem() instanceof PoisonItem)){
            //System.out.println("Err: Item " + inv.getStackInSlot(7).getItem().getRegistryName().toString() + " in slot 7 was not an instance of PoisonItem");
            return false;
        }

        return true;
    }

    @Override
    public ItemStack getCraftingResult(InventoryCrafting inv) {
        ItemStack itemStack = new ItemStack(inv.getStackInSlot(4).getItem());
        itemStack.setTagCompound(new NBTTagCompound());
        itemStack.getTagCompound().setString("effect", FoodEffect.getFromItem((PoisonItem) inv.getStackInSlot(1).getItem()).name());
        return itemStack;
    }

    @Override
    public int getRecipeSize() {
        return 9;
    }

    @Override
    public ItemStack getRecipeOutput() {
        return new ItemStack(new ItemFood(1, false));
    }

    @Override
    public NonNullList<ItemStack> getRemainingItems(InventoryCrafting inv) {
        return ForgeHooks.defaultRecipeGetRemainingItems(inv);
    }
}
