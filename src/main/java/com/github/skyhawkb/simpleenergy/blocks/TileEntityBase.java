package com.github.skyhawkb.simpleenergy.blocks;

import jline.internal.Nullable;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

@SuppressWarnings("unchecked")
public abstract class TileEntityBase<TE extends TileEntity> extends BlockBase {
    TileEntityBase(Material material, String name) {
        super(material, name);
    }

    @Override
    public boolean hasTileEntity(IBlockState state) {
        return true;
    }
    public TE getTileEntity(IBlockAccess world, BlockPos pos) {
        return (TE) world.getTileEntity(pos);
    }

    @Nullable
    @Override
    public abstract TE createTileEntity(World world, IBlockState state);
}
