//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.tfar.avaritiaio.capacitor;

import com.enderio.core.client.handlers.SpecialTooltipHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import crazypants.enderio.EnderIO;
import crazypants.enderio.power.ICapacitor;
import crazypants.enderio.power.ICapacitorItem;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

public class ItemInfinityCapacitor extends Item implements ICapacitorItem {

  public ItemInfinityCapacitor() {
  }

  public ICapacitor getCapacitor(ItemStack stack) {
    int damage = MathHelper.clamp_int(stack.getItemDamage(), 0, Capacitor.values().length - 1);
    return Capacitor.values()[damage].capacitor;
  }

  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    if (par1ItemStack != null && par1ItemStack.getItemDamage() > 0) {
      par3List.add(EnderIO.lang.localize("machine.tooltip.upgrade"));
      if (SpecialTooltipHandler.showAdvancedTooltips()) {
        SpecialTooltipHandler.addDetailedTooltipFromResources(par3List, "enderio.machine.tooltip.upgrade");
      } else {
        SpecialTooltipHandler.addShowDetailsTooltip(par3List);
      }
    }

  }
}
