package com.tfar.avaritiaio;

import com.tfar.avaritiaio.capacitor.ItemInfinityCapacitor;
import com.tfar.avaritiaio.util.IMCHandler;
import com.tfar.avaritiaio.util.Vars;
import cpw.mods.fml.common.*;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.oredict.OreDictionary;

import java.util.ArrayList;
import java.util.List;

@Mod(modid = Vars.MOD_ID, name = Vars.NAME, version = Vars.VERSION,
        dependencies = Vars.DEPENDENCIES, acceptedMinecraftVersions = Vars.MC_VERSION)
public class AvaritiaIO {

  public static final List<Item> ITEMS = new ArrayList<>();

  @Mod.EventHandler
  public void preInit(final FMLPreInitializationEvent event) {
    IMCHandler.sendIMCs();
  }
  @Mod.EventHandler
  public static void init(final FMLInitializationEvent event) {
    OreDictionary.registerOre("ballInfinity", ModItems.GRINDINGBALLINFINITY);
    OreDictionary.registerOre("ballNeutronium", ModItems.GRINDINGBALLNEUTRONIUM);

    registerItem(new Item(),"grindingballneutronium");
    registerItem(new Item(),"grindingballinfinity");
    registerItem(new ItemInfinityCapacitor(),"infinitecapacitor");
  }

  public static void registerItem(Item item, String name) {
    GameRegistry.registerItem(item,name);
    ITEMS.add(item);
  }

  @GameRegistry.ObjectHolder(Vars.MOD_ID)
  public static class ModItems {
    public static final Item GRINDINGBALLNEUTRONIUM = null;
    public static final Item GRINDINGBALLINFINITY = null;
  }
}
