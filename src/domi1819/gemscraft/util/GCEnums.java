package domi1819.gemscraft.util;

import net.minecraft.block.Block;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import domi1819.gemscraft.GCBlocks;
import domi1819.gemscraft.GCItems;

public class GCEnums 
{
    public static EnumToolMaterial toolAMETHYST = EnumHelper.addToolMaterial("AMETHYST", 3, 600, 7F, 3, 9);
    public static EnumToolMaterial toolRUBY = EnumHelper.addToolMaterial("RUBY", 3, 750, 8F, 3, 12);
    public static EnumToolMaterial toolSAPPHIRE = EnumHelper.addToolMaterial("SAPPHIRE", 3, 650, 7F, 3, 10);
    public static EnumToolMaterial toolEMERALD = EnumHelper.addToolMaterial("EMERALD", 3, 700, 7F, 3, 10);
    public static EnumToolMaterial toolTOPAZ = EnumHelper.addToolMaterial("TOPAZ", 2, 550, 7F, 3, 8);
    public static EnumToolMaterial toolPYRITE = EnumHelper.addToolMaterial("PYRITE", 1, 100, 12F, 4, 20);
    public static EnumToolMaterial toolBLACKDIAMOND = EnumHelper.addToolMaterial("BLACKDIAMOND", 3, 2125, 9F, 7, 25);

    public static EnumArmorMaterial armorAMETHYST = EnumHelper.addArmorMaterial("AMETHYST", 22, new int[] {2, 6, 5, 2}, 9);
    public static EnumArmorMaterial armorRUBY = EnumHelper.addArmorMaterial("RUBY", 25, new int[] {3, 8, 7, 3}, 10);
    public static EnumArmorMaterial armorSAPPHIRE = EnumHelper.addArmorMaterial("SAPPHIRE", 23, new int[] {3, 7, 6, 2}, 9);
    public static EnumArmorMaterial armorEMERALD = EnumHelper.addArmorMaterial("EMERALD", 24, new int[] {3, 8, 7, 3}, 10);
    public static EnumArmorMaterial armorTOPAZ = EnumHelper.addArmorMaterial("TOPAZ", 21, new int[] {2, 6, 5, 2}, 9);
    public static EnumArmorMaterial armorBLACKDIAMOND = EnumHelper.addArmorMaterial("BLACKDIAMOND", 40, new int[] {4, 10, 8, 4}, 13);
    
    public static void setHarvestLevels()
    {
        MinecraftForge.setBlockHarvestLevel(GCBlocks.blockGem, 0, "pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(GCBlocks.blockGem, 1, "pickaxe", 3);
        MinecraftForge.setBlockHarvestLevel(GCBlocks.blockGem, 2, "pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(GCBlocks.blockGem, 3, "pickaxe", 3);
        MinecraftForge.setBlockHarvestLevel(GCBlocks.blockGem, 4, "pickaxe", 1);
        MinecraftForge.setBlockHarvestLevel(GCBlocks.blockGem, 5, "pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(GCBlocks.blockGem, 6, "pickaxe", 3);
        MinecraftForge.setBlockHarvestLevel(GCBlocks.blockGemOre, 0, "pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(GCBlocks.blockGemOre, 1, "pickaxe", 3);
        MinecraftForge.setBlockHarvestLevel(GCBlocks.blockGemOre, 2, "pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(GCBlocks.blockGemOre, 3, "pickaxe", 3);
        MinecraftForge.setBlockHarvestLevel(GCBlocks.blockGemOre, 4, "pickaxe", 1);
        MinecraftForge.setBlockHarvestLevel(GCBlocks.blockGemOre, 5, "pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(GCBlocks.blockGemOre, 6, "pickaxe", 3);
        
        MinecraftForge.setToolClass(GCItems.atpickaxe, "pickaxe", 3);
        MinecraftForge.setToolClass(GCItems.atshovel, "shovel", 2);
        MinecraftForge.setToolClass(GCItems.ataxe, "axe", 3);
        MinecraftForge.setToolClass(GCItems.rtpickaxe, "pickaxe", 3);
        MinecraftForge.setToolClass(GCItems.rtshovel, "shovel", 2);
        MinecraftForge.setToolClass(GCItems.rtaxe, "axe", 2);
        MinecraftForge.setToolClass(GCItems.stpickaxe, "pickaxe", 3);
        MinecraftForge.setToolClass(GCItems.stshovel, "shovel", 2);
        MinecraftForge.setToolClass(GCItems.staxe, "axe", 2);
        MinecraftForge.setToolClass(GCItems.etpickaxe, "pickaxe", 3);
        MinecraftForge.setToolClass(GCItems.etshovel, "shovel", 2);
        MinecraftForge.setToolClass(GCItems.etaxe, "axe", 2);
        MinecraftForge.setToolClass(GCItems.ttpickaxe, "pickaxe", 2);
        MinecraftForge.setToolClass(GCItems.ttshovel, "shovel", 2);
        MinecraftForge.setToolClass(GCItems.ttaxe, "axe", 2);
        MinecraftForge.setToolClass(GCItems.ptpickaxe, "pickaxe", 2);
        MinecraftForge.setToolClass(GCItems.ptshovel, "shovel", 2);
        MinecraftForge.setToolClass(GCItems.ptaxe, "axe", 2);
        MinecraftForge.setToolClass(GCItems.bdpickaxe, "pickaxe", 3);
        MinecraftForge.setToolClass(GCItems.bdshovel, "shovel", 3);
        MinecraftForge.setToolClass(GCItems.bdaxe, "axe", 3);
        
        if (GCProperties.increaseDiamondOreHarvestLvl) MinecraftForge.setBlockHarvestLevel(Block.oreDiamond, "pickaxe", 3);
    }
}
