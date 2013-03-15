package domi1819.gemscraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import domi1819.gemscraft.items.*;
import domi1819.gemscraft.util.BaseItem;
import domi1819.gemscraft.util.GCEnums;
import domi1819.gemscraft.util.GCProperties;

public class GCItems
{
    public static Item gemAmethyst, gemRuby, gemSapphire, gemEmerald, gemTopaz, itemPyrite, blackDiamond, diamondStick;
    public static Item atshovel, atpickaxe, ataxe, atsword, athoe, aahelmet, aaplate, aaleggings, aaboots;
    public static Item rtshovel, rtpickaxe, rtaxe, rtsword, rthoe, rahelmet, raplate, raleggings, raboots;
    public static Item stshovel, stpickaxe, staxe, stsword, sthoe, sahelmet, saplate, saleggings, saboots;
    public static Item etshovel, etpickaxe, etaxe, etsword, ethoe, eahelmet, eaplate, ealeggings, eaboots;
    public static Item ttshovel, ttpickaxe, ttaxe, ttsword, tthoe, tahelmet, taplate, taleggings, taboots;
    public static Item ptshovel, ptpickaxe, ptaxe, ptsword, pthoe; 
    public static Item bdshovel, bdpickaxe, bdaxe, bdsword, bdhoe, bdhelmet, bdplate, bdleggings, bdboots;
    
    public static void initItems()
    {
        gemAmethyst = new BaseItem(GCProperties.itemAmethystID - 256).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("gc_itemAmethyst");
        gemRuby = new BaseItem(GCProperties.itemRubyID - 256).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("gc_itemRuby");
        gemSapphire = new BaseItem(GCProperties.itemSapphireID - 256).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("gc_itemSapphire");
        gemEmerald = new BaseItem(GCProperties.itemEmeraldID - 256).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("gc_itemEmerald");
        gemTopaz = new BaseItem(GCProperties.itemTopazID - 256).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("gc_itemTopaz");
        itemPyrite = new BaseItem(GCProperties.itemPyriteID - 256).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("gc_itemPyrite");
        blackDiamond = new BaseItem(GCProperties.itemBlackDiamondID - 256).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("gc_itemBlackDiamond");
        diamondStick = new BaseItem(GCProperties.itemDiamondStickID - 256).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("gc_itemDiamondStick");
        atshovel = new ItemGemShovel(GCProperties.amethystToolsBaseID - 256, GCEnums.toolAMETHYST).setUnlocalizedName("gc_shovelAmethyst");
        atpickaxe = new ItemGemPickaxe(GCProperties.amethystToolsBaseID - 255, GCEnums.toolAMETHYST).setUnlocalizedName("gc_pickaxeAmethyst");
        ataxe = new ItemGemAxe(GCProperties.amethystToolsBaseID - 254, GCEnums.toolAMETHYST).setUnlocalizedName("gc_axeAmethyst");
        atsword = new ItemGemSword(GCProperties.amethystToolsBaseID - 253, GCEnums.toolAMETHYST).setUnlocalizedName("gc_swordAmethyst");
        athoe = new ItemGemHoe(GCProperties.amethystToolsBaseID - 252, GCEnums.toolAMETHYST).setUnlocalizedName("gc_hoeAmethyst");
        rtshovel = new ItemGemShovel(GCProperties.rubyToolsBaseID - 256, GCEnums.toolRUBY).setUnlocalizedName("gc_shovelRuby");
        rtpickaxe = new ItemGemPickaxe(GCProperties.rubyToolsBaseID - 255, GCEnums.toolRUBY).setUnlocalizedName("gc_pickaxeRuby");
        rtaxe = new ItemGemAxe(GCProperties.rubyToolsBaseID - 254, GCEnums.toolRUBY).setUnlocalizedName("gc_axeRuby");
        rtsword = new ItemGemSword(GCProperties.rubyToolsBaseID - 253, GCEnums.toolRUBY).setUnlocalizedName("gc_swordRuby");
        rthoe = new ItemGemHoe(GCProperties.rubyToolsBaseID - 252, GCEnums.toolRUBY).setUnlocalizedName("gc_hoeRuby");
        stshovel = new ItemGemShovel(GCProperties.sapphireToolsBaseID - 256, GCEnums.toolSAPPHIRE).setUnlocalizedName("gc_shovelSapphire");
        stpickaxe = new ItemGemPickaxe(GCProperties.sapphireToolsBaseID - 255, GCEnums.toolSAPPHIRE).setUnlocalizedName("gc_pickaxeSapphire");
        staxe = new ItemGemAxe(GCProperties.sapphireToolsBaseID - 254, GCEnums.toolSAPPHIRE).setUnlocalizedName("gc_axeSapphire");
        stsword = new ItemGemSword(GCProperties.sapphireToolsBaseID - 253, GCEnums.toolSAPPHIRE).setUnlocalizedName("gc_swordSapphire");
        sthoe = new ItemGemHoe(GCProperties.sapphireToolsBaseID - 252, GCEnums.toolSAPPHIRE).setUnlocalizedName("gc_hoeSapphire");
        etshovel = new ItemGemShovel(GCProperties.emeraldToolsBaseID - 256, GCEnums.toolEMERALD).setUnlocalizedName("gc_shovelEmerald");
        etpickaxe = new ItemGemPickaxe(GCProperties.emeraldToolsBaseID - 255, GCEnums.toolEMERALD).setUnlocalizedName("gc_pickaxeEmerald");
        etaxe = new ItemGemAxe(GCProperties.emeraldToolsBaseID - 254, GCEnums.toolEMERALD).setUnlocalizedName("gc_axeEmerald");
        etsword = new ItemGemSword(GCProperties.emeraldToolsBaseID - 253, GCEnums.toolEMERALD).setUnlocalizedName("gc_swordEmerald");
        ethoe = new ItemGemHoe(GCProperties.emeraldToolsBaseID - 252, GCEnums.toolEMERALD).setUnlocalizedName("gc_hoeEmerald");
        ttshovel = new ItemGemShovel(GCProperties.topazToolsBaseID - 256, GCEnums.toolTOPAZ).setUnlocalizedName("gc_shovelTopaz");
        ttpickaxe = new ItemGemPickaxe(GCProperties.topazToolsBaseID - 255, GCEnums.toolTOPAZ).setUnlocalizedName("gc_pickaxeTopaz");
        ttaxe = new ItemGemAxe(GCProperties.topazToolsBaseID - 254, GCEnums.toolTOPAZ).setUnlocalizedName("gc_axeTopaz");
        ttsword = new ItemGemSword(GCProperties.topazToolsBaseID - 253, GCEnums.toolTOPAZ).setUnlocalizedName("gc_swordTopaz");
        tthoe = new ItemGemHoe(GCProperties.topazToolsBaseID - 252, GCEnums.toolTOPAZ).setUnlocalizedName("gc_hoeTopaz");
        ptshovel = new ItemGemShovel(GCProperties.pyriteToolsBaseID - 256, GCEnums.toolPYRITE).setUnlocalizedName("gc_shovelPyrite");
        ptpickaxe = new ItemGemPickaxe(GCProperties.pyriteToolsBaseID - 255, GCEnums.toolPYRITE).setUnlocalizedName("gc_pickaxePyrite");
        ptaxe = new ItemGemAxe(GCProperties.pyriteToolsBaseID - 254, GCEnums.toolPYRITE).setUnlocalizedName("gc_axePyrite");
        ptsword = new ItemGemSword(GCProperties.pyriteToolsBaseID - 253, GCEnums.toolPYRITE).setUnlocalizedName("gc_swordPyrite");
        pthoe = new ItemGemHoe(GCProperties.pyriteToolsBaseID - 252, GCEnums.toolPYRITE).setUnlocalizedName("gc_hoePyrite");
        bdshovel = new ItemGemShovel(GCProperties.blackDiamondToolsBaseID - 256, GCEnums.toolBLACKDIAMOND).setUnlocalizedName("gc_shovelBlackDiamond");
        bdpickaxe = new ItemGemPickaxe(GCProperties.blackDiamondToolsBaseID - 255, GCEnums.toolBLACKDIAMOND).setUnlocalizedName("gc_pickaxeBlackDiamond");
        bdaxe = new ItemGemAxe(GCProperties.blackDiamondToolsBaseID - 254, GCEnums.toolBLACKDIAMOND).setUnlocalizedName("gc_axeBlackDiamond");
        bdsword = new ItemGemSword(GCProperties.blackDiamondToolsBaseID - 253, GCEnums.toolBLACKDIAMOND).setUnlocalizedName("gc_swordBlackDiamond");
        bdhoe = new ItemGemHoe(GCProperties.blackDiamondToolsBaseID - 252, GCEnums.toolBLACKDIAMOND).setUnlocalizedName("gc_hoeBlackDiamond");
        aahelmet = new ItemGemArmor(GCProperties.amethystArmorBaseID - 256, GCEnums.armorAMETHYST, 3, 0).setUnlocalizedName("gc_helmetAmethyst");
        aaplate = new ItemGemArmor(GCProperties.amethystArmorBaseID - 255, GCEnums.armorAMETHYST, 3, 1).setUnlocalizedName("gc_chestAmethyst");
        aaleggings = new ItemGemArmor(GCProperties.amethystArmorBaseID - 254, GCEnums.armorAMETHYST, 3, 2).setUnlocalizedName("gc_legsAmethyst");
        aaboots = new ItemGemArmor(GCProperties.amethystArmorBaseID - 253, GCEnums.armorAMETHYST, 3, 3).setUnlocalizedName("gc_bootsAmethyst");
        rahelmet = new ItemGemArmor(GCProperties.rubyArmorBaseID - 256, GCEnums.armorRUBY, 3, 0).setUnlocalizedName("gc_helmetRuby");
        raplate = new ItemGemArmor(GCProperties.rubyArmorBaseID - 255, GCEnums.armorRUBY, 3, 1).setUnlocalizedName("gc_chestRuby");
        raleggings = new ItemGemArmor(GCProperties.rubyArmorBaseID - 254, GCEnums.armorRUBY, 3, 2).setUnlocalizedName("gc_legsRuby");
        raboots = new ItemGemArmor(GCProperties.rubyArmorBaseID - 253, GCEnums.armorRUBY, 3, 3).setUnlocalizedName("gc_bootsRuby");
        sahelmet = new ItemGemArmor(GCProperties.sapphireArmorBaseID - 256, GCEnums.armorSAPPHIRE, 3, 0).setUnlocalizedName("gc_helmetSapphire");
        saplate = new ItemGemArmor(GCProperties.sapphireArmorBaseID - 255, GCEnums.armorSAPPHIRE, 3, 1).setUnlocalizedName("gc_chestSapphire");
        saleggings = new ItemGemArmor(GCProperties.sapphireArmorBaseID - 254, GCEnums.armorSAPPHIRE, 3, 2).setUnlocalizedName("gc_legsSapphire");
        saboots = new ItemGemArmor(GCProperties.sapphireArmorBaseID - 253, GCEnums.armorSAPPHIRE, 3, 3).setUnlocalizedName("gc_bootsSapphire");
        eahelmet = new ItemGemArmor(GCProperties.emeraldArmorBaseID - 256, GCEnums.armorEMERALD, 3, 0).setUnlocalizedName("gc_helmetEmerald");
        eaplate = new ItemGemArmor(GCProperties.emeraldArmorBaseID - 255, GCEnums.armorEMERALD, 3, 1).setUnlocalizedName("gc_chestEmerald");
        ealeggings = new ItemGemArmor(GCProperties.emeraldArmorBaseID - 254, GCEnums.armorEMERALD, 3, 2).setUnlocalizedName("gc_legsEmerald");
        eaboots = new ItemGemArmor(GCProperties.emeraldArmorBaseID - 253, GCEnums.armorEMERALD, 3, 3).setUnlocalizedName("gc_bootsEmerald");
        tahelmet = new ItemGemArmor(GCProperties.topazArmorBaseID - 256, GCEnums.armorTOPAZ, 3, 0).setUnlocalizedName("gc_helmetTopaz");
        taplate = new ItemGemArmor(GCProperties.topazArmorBaseID - 255, GCEnums.armorTOPAZ, 3, 1).setUnlocalizedName("gc_chestTopaz");
        taleggings = new ItemGemArmor(GCProperties.topazArmorBaseID - 254, GCEnums.armorTOPAZ, 3, 2).setUnlocalizedName("gc_legsTopaz");
        taboots = new ItemGemArmor(GCProperties.topazArmorBaseID - 253, GCEnums.armorTOPAZ, 3, 3).setUnlocalizedName("gc_bootsTopaz");
        bdhelmet = new ItemGemArmor(GCProperties.blackDiamondArmorBaseID - 256, GCEnums.armorBLACKDIAMOND, 3, 0).setUnlocalizedName("gc_helmetBlackDiamond");
        bdplate = new ItemGemArmor(GCProperties.blackDiamondArmorBaseID - 255, GCEnums.armorBLACKDIAMOND, 3, 1).setUnlocalizedName("gc_chestBlackDiamond");
        bdleggings = new ItemGemArmor(GCProperties.blackDiamondArmorBaseID - 254, GCEnums.armorBLACKDIAMOND, 3, 2).setUnlocalizedName("gc_legsBlackDiamond");
        bdboots = new ItemGemArmor(GCProperties.blackDiamondArmorBaseID - 253, GCEnums.armorBLACKDIAMOND, 3, 3).setUnlocalizedName("gc_bootsBlackDiamond");
    }
}