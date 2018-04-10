package com.github.skyhawkb.simpleenergy.blocks;

import com.github.skyhawkb.simpleenergy.SimpleEnergy;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block {
    private String name;

    public BlockBase(Material material, String name) {
        super(material);
        this.name = name;

        setUnlocalizedName(SimpleEnergy.MODID + "." + name);
        setRegistryName(name);
    }

    public void registerItemModel() {
        SimpleEnergy.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, name);
    }

    public Item createItemBlock() {
        return new ItemBlock(this).setRegistryName(getRegistryName());
    }
}
