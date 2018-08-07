package com.github.skyhawkb.simpleenergy.blocks;

import com.github.skyhawkb.simpleenergy.blocks.tile.TileEntityCapacitor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockCapacitor extends TileEntityBase {
    private int maxEnergy;

    BlockCapacitor(int maxEnergy, String size) {
        super(Material.IRON, "capacitor_bank_" + size);
        this.maxEnergy = maxEnergy;
    }

    public TileEntity createTileEntity(World world, IBlockState state) {
        return new TileEntityCapacitor(this.maxEnergy);
    }
}
