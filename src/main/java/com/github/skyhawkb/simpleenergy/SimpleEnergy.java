package com.github.skyhawkb.simpleenergy;

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
    public class RegistrationHandler {
        @SubscribeEvent
        public void registerBlocks(RegistryEvent<Block> e) {

        }
        @SubscribeEvent
        public void registerItems(RegistryEvent<Item> e) {

        }
        @SubscribeEvent
        public void registerModels(ModelRegistryEvent e) {

        }
    }
}
