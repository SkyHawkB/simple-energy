package com.github.skyhawkb.simpleenergy.blocks.tile;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.energy.CapabilityEnergy;
import net.minecraftforge.energy.IEnergyStorage;

import javax.annotation.Nullable;

public class TileEntityCapacitor extends TileEntity implements ITickable {
    private CapacitorEnergyStorage energyStorage;

    public TileEntityCapacitor(int maxEnergy) {
        this.energyStorage = new CapacitorEnergyStorage(maxEnergy, maxEnergy / 1000);
    }

    @Override
    public void update() {
        if(energyStorage.getEnergyStored() > 0) {
            outputEnergy();
        }
    }

    private void outputEnergy() {
        int[][] poss = {
            {0, 0, 1},
            {0, 0, -1},
            {0, 1, 0},
            {0, -1, 0},
            {1, 0, 0},
            {-1, 0, 0}
        };

        for(int[] posDiff : poss) {
            BlockPos pos = getPos().add(posDiff[0], posDiff[1], posDiff[2]);
            if(world.isBlockLoaded(pos)) {
                TileEntity tile = world.getTileEntity(pos);
                if(tile != null) {
                    if(tile.hasCapability(CapabilityEnergy.ENERGY, EnumFacing.UP)) {
                        IEnergyStorage storage = tile.getCapability(CapabilityEnergy.ENERGY, EnumFacing.UP);
                        if (storage != null) {
                            int power = energyStorage.extractEnergy(Integer.MAX_VALUE, true);
                            int drained = storage.receiveEnergy(power, false);
                            energyStorage.extractEnergy(drained, false);
                        }
                    }
                }
            }
        }
    }

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound compound) {
        compound.setInteger("energyStored", energyStorage.getEnergyStored());
        return super.writeToNBT(compound);
    }
    @Override
    public void readFromNBT(NBTTagCompound compound) {
        energyStorage.setEnergy(compound.getInteger("energyStored"));
        super.readFromNBT(compound);
    }

    @Override
    public boolean hasCapability(Capability<?> capability, @Nullable EnumFacing facing) {
        if(capability == CapabilityEnergy.ENERGY) return true;
        return super.hasCapability(capability, facing);
    }
    @Override
    @Nullable
    @SuppressWarnings("unchecked")
    public <T> T getCapability(Capability<T> capability, @Nullable EnumFacing facing) {
        if(capability == CapabilityEnergy.ENERGY) return (T) energyStorage;
        return super.getCapability(capability, facing);
    }
}
