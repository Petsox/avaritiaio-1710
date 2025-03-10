package com.tfar.avaritiaio.capacitor;

import com.tfar.avaritiaio.AvaritiaIO;

import crazypants.enderio.power.BasicCapacitor;
import crazypants.enderio.power.ICapacitor;
import net.minecraft.item.ItemStack;

public enum Capacitor {
  INFINITY_CAPACITOR(new BasicCapacitor(400, 500000, 100), "enderCapacitor");

  public final ICapacitor capacitor;
  public final String unlocalisedName;
  public final String iconKey;

  Capacitor(BasicCapacitor capacitor, String unlocalisedName) {
    this.capacitor = capacitor;
    this.unlocalisedName = "avaritiaio." + unlocalisedName;
    this.iconKey = "avaritiaio:" + unlocalisedName;
  }

  public ItemStack getItemStack() {
    return new ItemStack(AvaritiaIO.ITEMS.get(2), 1, this.ordinal());
  }
}