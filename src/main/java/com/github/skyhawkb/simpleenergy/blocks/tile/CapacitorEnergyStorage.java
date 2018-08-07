package com.github.skyhawkb.simpleenergy.blocks.tile;

import net.minecraftforge.energy.EnergyStorage;

public class CapacitorEnergyStorage extends EnergyStorage {
    public CapacitorEnergyStorage(int capacity, int maxTransfer) {
        super(capacity, maxTransfer);
    }

    public void setEnergy(int newEnergy) {
        this.energy = newEnergy;
    }
}
