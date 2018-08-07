package com.github.skyhawkb.simpleenergy;

import com.github.skyhawkb.simpleenergy.blocks.ModBlocks;
import com.github.skyhawkb.simpleenergy.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = SimpleEnergy.MODID, name = SimpleEnergy.NAME, version = SimpleEnergy.VERSION)
public class SimpleEnergy {
    public static final String MODID = "simpleenergy";
    public static final String NAME = "SimpleEnergy";
    public static final String VERSION = "1.0.0";

    @Mod.Instance
    public static SimpleEnergy instance;

    @SidedProxy(clientSide = "com.github.skyhawkb.simpleenergy.ClientProxy", serverSide = "com.github.skyhawkb.simpleenergy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) {
    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {

    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {

    }

    @Mod.EventBusSubscriber
    public static class RegistrationHandler {
        @SubscribeEvent
        public static void registerBlocks(RegistryEvent.Register<Block> e) {
            ModBlocks.register(e.getRegistry());
        }
        @SubscribeEvent
        public static void registerItems(RegistryEvent.Register<Item> e) {
            ModBlocks.registerItems(e.getRegistry());
            ModItems.register(e.getRegistry());
        }
        @SubscribeEvent
        public static void registerModels(ModelRegistryEvent e) {
            ModBlocks.registerModels();
            ModItems.registerModels();
        }
    }
}
