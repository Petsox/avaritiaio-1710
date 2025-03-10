package com.tfar.avaritiaio.util;

import cpw.mods.fml.common.event.FMLInterModComms;

public class IMCHandler {
    public static void sendIMCs() {

        FMLInterModComms.sendMessage("enderio", "recipe:xml",
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?><recipes>"
                        + "<grindingball name=\"Infinity Ball\" grinding=\"5.00\" chance=\"5.00\" power=\"0.01\" durability=\"2000000000\" >"
                        + "<item name=\"oredict:ballInfinity\"/>"
                        + "</grindingball>"
                        + "<grindingball name=\"Neutronium Ball\" grinding=\"1.00\" chance=\"5.00\" power=\"0.10\" durability=\"2000000\" >"
                        + "<item name=\"oredict:ballNeutronium\"/>"
                        + "</grindingball></recipes>");
        FMLInterModComms.sendMessage("enderio", "recipe:xml",
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?><recipes>"
                        + "<recipe name=\"Sagmill: Infinity Powder\" required=\"true\">"
                        + "<sagmilling energy=\"999999\" bonus=\"chance_only\">"
                        + "<input name=\"minecraft:bedrock\"/>"
                        + "<output name=\"minecraft:bedrock\" />"
                        + "<output name=\"dustBedrock\" chance=\"1.0\" />"
                        + "</sagmilling></recipe></recipes>");
    }
}
