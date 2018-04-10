package com.github.skyhawkb.simpleenergy.items;

import com.github.skyhawkb.prismatic.items.itemclasses.*;
import com.github.skyhawkb.prismatic.items.itemclasses.armor.*;
import com.github.skyhawkb.prismatic.items.itemclasses.tools.*;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {
    public static final ItemRainbowDust RAINBOW_DUST = new ItemRainbowDust();
    public static final ItemPureIngot PURE_INGOT = new ItemPureIngot();

    public static final ArmorPureHelmet PURE_HELMET = new ArmorPureHelmet();
    public static final ArmorPureChestplate PURE_CHESTPLATE = new ArmorPureChestplate();
    public static final ArmorPureLeggings PURE_LEGGINGS = new ArmorPureLeggings();
    public static final ArmorPureBoots PURE_BOOTS = new ArmorPureBoots();

    public static final ToolPureSword PURE_SWORD = new ToolPureSword();
    public static final ToolPureAxe PURE_AXE = new ToolPureAxe();
    public static final ToolPureHoe PURE_HOE = new ToolPureHoe();
    public static final ToolPurePickaxe PURE_PICKAXE = new ToolPurePickaxe();
    public static final ToolPureShovel PURE_SHOVEL = new ToolPureShovel();

    public static void register(IForgeRegistry<Item> registry) {
        registry.registerAll(
                RAINBOW_DUST,
                PURE_INGOT,
                PURE_HELMET,
                PURE_CHESTPLATE,
                PURE_LEGGINGS,
                PURE_BOOTS,
                PURE_SWORD,
                PURE_AXE,
                PURE_HOE,
                PURE_PICKAXE,
                PURE_SHOVEL
        );
    }

    public static void registerModels() {
        RAINBOW_DUST.registerItemModel();
        PURE_INGOT.registerItemModel();

        PURE_HELMET.registerItemModel();
        PURE_CHESTPLATE.registerItemModel();
        PURE_LEGGINGS.registerItemModel();
        PURE_BOOTS.registerItemModel();

        PURE_SWORD.registerItemModel();
        PURE_AXE.registerItemModel();
        PURE_HOE.registerItemModel();
        PURE_PICKAXE.registerItemModel();
        PURE_SHOVEL.registerItemModel();
    }

}
