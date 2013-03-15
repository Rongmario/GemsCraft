package domi1819.gemscraft;

import cpw.mods.fml.common.registry.LanguageRegistry;
import domi1819.gemscraft.util.MultiLanguageRegistry;

public class GCLocalization
{
    public static void addNames()
    {
        MultiLanguageRegistry.addStringNames("tile.gc_blockAmethyst.amethyst.name", "Amethyst Block", "Amethystblock");
        MultiLanguageRegistry.addStringNames("tile.gc_blockAmethyst.ruby.name", "Ruby Block", "Rubinblock");
        MultiLanguageRegistry.addStringNames("tile.gc_blockAmethyst.emerald.name", "Emerald Block", "Smaragdblock");
        MultiLanguageRegistry.addStringNames("tile.gc_blockAmethyst.sapphire.name", "Sapphire Block", "Saphirblock");
        MultiLanguageRegistry.addStringNames("tile.gc_blockAmethyst.topaz.name", "Topaz Block", "Topasblock");
        MultiLanguageRegistry.addStringNames("tile.gc_blockAmethyst.pyrite.name", "Pyrite Block", "Pyritblock");
        MultiLanguageRegistry.addStringNames("tile.gc_blockAmethyst.blackdiamond.name", "\247CBlack Diamond Block", "\247CSchwarzer Diamant-Block");

        MultiLanguageRegistry.addStringNames("tile.gc_blockAmethystOre.amethyst.name", "Amethyst Ore", "Amethysterz");
        MultiLanguageRegistry.addStringNames("tile.gc_blockAmethystOre.ruby.name", "Ruby Ore", "Rubinerz");
        MultiLanguageRegistry.addStringNames("tile.gc_blockAmethystOre.emerald.name", "Emerald Ore", "Smaragderz");
        MultiLanguageRegistry.addStringNames("tile.gc_blockAmethystOre.sapphire.name", "Sapphire Ore", "Saphirerz");
        MultiLanguageRegistry.addStringNames("tile.gc_blockAmethystOre.topaz.name", "Topaz Ore", "Topaserz");
        MultiLanguageRegistry.addStringNames("tile.gc_blockAmethystOre.pyrite.name", "Pyrite Ore", "Pyriterz");
        MultiLanguageRegistry.addStringNames("tile.gc_blockAmethystOre.blackdiamond.name", "\247CBlack Diamond Ore", "\247CSchwarzer Diamant-Erz");

        MultiLanguageRegistry.addObjectNames(GCItems.gemAmethyst, "Amethyst", "Amethyst");
        MultiLanguageRegistry.addObjectNames(GCItems.gemRuby, "Ruby", "Rubin");
        MultiLanguageRegistry.addObjectNames(GCItems.gemEmerald, "Emerald", "Smaragd");
        MultiLanguageRegistry.addObjectNames(GCItems.gemSapphire, "Sapphire", "Saphir");
        MultiLanguageRegistry.addObjectNames(GCItems.gemTopaz, "Topaz", "Topas");
        MultiLanguageRegistry.addObjectNames(GCItems.itemPyrite, "Pyrite Cube", "Pyritw\u00fcrfel");
        MultiLanguageRegistry.addObjectNames(GCItems.blackDiamond, "\247CBlack Diamond", "\247CSchwarzer Diamant");
        MultiLanguageRegistry.addObjectNames(GCItems.diamondStick, "Diamond Stick", "Diamantstab");

        MultiLanguageRegistry.addObjectNames(GCItems.atshovel, "Amethyst Shovel", "Amethystschaufel");
        MultiLanguageRegistry.addObjectNames(GCItems.atpickaxe, "Amethyst Pickaxe", "Amethystspitzhacke");
        MultiLanguageRegistry.addObjectNames(GCItems.ataxe, "Amethyst Axe", "Amethystaxt");
        MultiLanguageRegistry.addObjectNames(GCItems.atsword, "Amethyst Sword", "Amethystschwert");
        MultiLanguageRegistry.addObjectNames(GCItems.athoe, "Amethyst Hoe", "Amethystfeldhacke");
        MultiLanguageRegistry.addObjectNames(GCItems.rtshovel, "Ruby Shovel", "Rubinschaufel");
        MultiLanguageRegistry.addObjectNames(GCItems.rtpickaxe, "Ruby Pickaxe", "Rubinspitzhacke");
        MultiLanguageRegistry.addObjectNames(GCItems.rtaxe, "Ruby Axe", "Rubinaxt");
        MultiLanguageRegistry.addObjectNames(GCItems.rtsword, "Ruby Sword", "Rubinschwert");
        MultiLanguageRegistry.addObjectNames(GCItems.rthoe, "Ruby Hoe", "Rubinfeldhacke");
        MultiLanguageRegistry.addObjectNames(GCItems.etshovel, "Emerald Shovel", "Smaragdschaufel");
        MultiLanguageRegistry.addObjectNames(GCItems.etpickaxe, "Emerald Pickaxe", "Smaragdspitzhacke");
        MultiLanguageRegistry.addObjectNames(GCItems.etaxe, "Emerald Axe", "Smaragdaxt");
        MultiLanguageRegistry.addObjectNames(GCItems.etsword, "Emerald Sword", "Smaragdschwert");
        MultiLanguageRegistry.addObjectNames(GCItems.ethoe, "Emerald Hoe", "Smaragdfeldhacke");
        MultiLanguageRegistry.addObjectNames(GCItems.stshovel, "Sapphire Shovel", "Saphirschaufel");
        MultiLanguageRegistry.addObjectNames(GCItems.stpickaxe, "Sapphire Pickaxe", "Saphirspitzhacke");
        MultiLanguageRegistry.addObjectNames(GCItems.staxe, "Sapphire Axe", "Saphiraxt");
        MultiLanguageRegistry.addObjectNames(GCItems.stsword, "Sapphire Sword", "Saphirschwert");
        MultiLanguageRegistry.addObjectNames(GCItems.sthoe, "Sapphire Hoe", "Saphirfeldhacke");
        MultiLanguageRegistry.addObjectNames(GCItems.ttshovel, "Topaz Shovel", "Topasschaufel");
        MultiLanguageRegistry.addObjectNames(GCItems.ttpickaxe, "Topaz Pickaxe", "Topasspitzhacke");
        MultiLanguageRegistry.addObjectNames(GCItems.ttaxe, "Topaz Axe", "Topasaxt");
        MultiLanguageRegistry.addObjectNames(GCItems.ttsword, "Topaz Sword", "Topasschwert");
        MultiLanguageRegistry.addObjectNames(GCItems.tthoe, "Topaz Hoe", "Topasfeldhacke");
        MultiLanguageRegistry.addObjectNames(GCItems.ptshovel, "Pyrite Shovel", "Pyritschaufel");
        MultiLanguageRegistry.addObjectNames(GCItems.ptpickaxe, "Pyrite Pickaxe", "Pyritspitzhacke");
        MultiLanguageRegistry.addObjectNames(GCItems.ptaxe, "Pyrite Axe", "Pyritaxt");
        MultiLanguageRegistry.addObjectNames(GCItems.ptsword, "Pyrite Sword", "Pyritschwert");
        MultiLanguageRegistry.addObjectNames(GCItems.pthoe, "Pyrite Hoe", "Pyritfeldhacke");
        MultiLanguageRegistry.addObjectNames(GCItems.bdshovel, "Black Diamond Shovel", "\247CSchwarzer Diamant-Schaufel");
        MultiLanguageRegistry.addObjectNames(GCItems.bdpickaxe, "Black Diamond Pickaxe", "\247CSchwarzer Diamant-Spitzhacke");
        MultiLanguageRegistry.addObjectNames(GCItems.bdaxe, "Black Diamond Axe", "\247CSchwarzer Diamant-Axt");
        MultiLanguageRegistry.addObjectNames(GCItems.bdsword, "Black Diamond Sword", "\247CSchwarzer Diamant-Schwert");
        MultiLanguageRegistry.addObjectNames(GCItems.bdhoe, "Black Diamond Hoe", "\247CSchwarzer Diamant-Feldhacke");

        MultiLanguageRegistry.addObjectNames(GCItems.aahelmet, "Amethyst Helmet", "Amethysthelm");
        MultiLanguageRegistry.addObjectNames(GCItems.aaplate, "Amethyst Chestplate", "Amethystbrustpanzer");
        MultiLanguageRegistry.addObjectNames(GCItems.aaleggings, "Amethyst Leggings", "Amethysthose");
        MultiLanguageRegistry.addObjectNames(GCItems.aaboots, "Amethyst Boots", "Amethyststiefel");
        MultiLanguageRegistry.addObjectNames(GCItems.rahelmet, "Ruby Helmet", "Rubinhelm");
        MultiLanguageRegistry.addObjectNames(GCItems.raplate, "Ruby Chestplate", "Rubinbrustpanzer");
        MultiLanguageRegistry.addObjectNames(GCItems.raleggings, "Ruby Leggings", "Rubinhose");
        MultiLanguageRegistry.addObjectNames(GCItems.raboots, "Ruby Boots", "Rubinstiefel");
        MultiLanguageRegistry.addObjectNames(GCItems.sahelmet, "Sapphire Helmet", "Saphirhelm");
        MultiLanguageRegistry.addObjectNames(GCItems.saplate, "Sapphire Chestplate", "Saphirbrustpanzer");
        MultiLanguageRegistry.addObjectNames(GCItems.saleggings, "Sapphire Leggings", "Saphirhose");
        MultiLanguageRegistry.addObjectNames(GCItems.saboots, "Sapphire Boots", "Saphirstiefel");
        MultiLanguageRegistry.addObjectNames(GCItems.eahelmet, "Emerald Helmet", "Smaragdhelm");
        MultiLanguageRegistry.addObjectNames(GCItems.eaplate, "Emerald Chestplate", "Smaragdbrustpanzer");
        MultiLanguageRegistry.addObjectNames(GCItems.ealeggings, "Emerald Leggings", "Smaragdhose");
        MultiLanguageRegistry.addObjectNames(GCItems.eaboots, "Emerald Boots", "Smaragdstiefel");
        MultiLanguageRegistry.addObjectNames(GCItems.tahelmet, "Topaz Helmet", "Topashelm");
        MultiLanguageRegistry.addObjectNames(GCItems.taplate, "Topaz Chestplate", "Topasbrustpanzer");
        MultiLanguageRegistry.addObjectNames(GCItems.taleggings, "Topaz Leggings", "Topashose");
        MultiLanguageRegistry.addObjectNames(GCItems.taboots, "Topaz Boots", "Topasstiefel");
        MultiLanguageRegistry.addObjectNames(GCItems.bdhelmet, "\247CBlack Diamond Helmet", "\247CSchwarzer Diamant-Helm");
        MultiLanguageRegistry.addObjectNames(GCItems.bdplate, "\247CBlack Diamond Chestplate", "\247CSchwarzer Diamant-Brustpanzer");
        MultiLanguageRegistry.addObjectNames(GCItems.bdleggings, "\247CBlack Diamond Leggings", "\247CSchwarzer Diamant-Hose");
        MultiLanguageRegistry.addObjectNames(GCItems.bdboots, "\247CBlack Diamond Boots", "\247CSchwarzer Diamant-Stiefel");
    }
}