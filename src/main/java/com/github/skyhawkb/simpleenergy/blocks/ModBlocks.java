package com.github.skyhawkb.simpleenergy.blocks;

import com.github.skyhawkb.simpleenergy.SimpleEnergy;
import com.github.skyhawkb.simpleenergy.blocks.tile.TileEntityCapacitor;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {
    public static final BlockCapacitor SMALL_CAPACITOR = new BlockCapacitor(1_000_000, "small");
    public static final BlockCapacitor MEDIUM_CAPACITOR = new BlockCapacitor(500_000_000, "medium");
    public static final BlockCapacitor LARGE_CAPACITOR = new BlockCapacitor(1_000_000_000, "large");

    public static void register(IForgeRegistry<Block> registry) {
        registry.registerAll(
            SMALL_CAPACITOR,
            MEDIUM_CAPACITOR,
            LARGE_CAPACITOR
        );

        GameRegistry.registerTileEntity(TileEntityCapacitor.class, SimpleEnergy.MODID + "_capacitor");
    }

    public static void registerItems(IForgeRegistry<Item> registry) {
        registry.registerAll(
            SMALL_CAPACITOR.getItemBlock(),
            MEDIUM_CAPACITOR.getItemBlock(),
            LARGE_CAPACITOR.getItemBlock()
        );
    }

    public static void registerModels() {
        SMALL_CAPACITOR.registerItemModel();
        MEDIUM_CAPACITOR.registerItemModel();
        LARGE_CAPACITOR.registerItemModel();
    }
}