package com.github.skyhawkb.simpleenergy.items;

import com.github.skyhawkb.simpleenergy.SimpleEnergy;
import net.minecraft.item.Item;

public class ItemBase extends Item {
    private String name;

    public ItemBase(String name) {
        this.name = name;
        setUnlocalizedName(SimpleEnergy.MODID + "." + name);
        setRegistryName(name);
    }

    public void registerItemModel() {
        SimpleEnergy.proxy.registerItemRenderer(this, 0, name);
    }
}
