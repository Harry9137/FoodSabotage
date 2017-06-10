package io.github.harry9137.foodsabo.item.poison;

import io.github.harry9137.foodsabo.Reference;
import io.github.harry9137.foodsabo.item.FoodSaboItem;
import io.github.harry9137.foodsabo.item.IPoisonItem;

public class ItemCyanidePowder extends FoodSaboItem implements IPoisonItem {
    public ItemCyanidePowder(){
        super();
        this.setRegistryName(Reference.MODID, "cyanide_powder");
        this.setUnlocalizedName(this.getRegistryName().toString());
    }
}
