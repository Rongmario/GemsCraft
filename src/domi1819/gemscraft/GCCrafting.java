package domi1819.gemscraft;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class GCCrafting 
{
    public static void addCraftingRecipes()
    {
        GameRegistry.addRecipe(new ItemStack(GCBlocks.blockGem, 1, 0), new Object[] { "AAA", "AAA", "AAA", 'A', GCItems.gemAmethyst });
        GameRegistry.addRecipe(new ItemStack(GCBlocks.blockGem, 1, 1), new Object[] { "RRR", "RRR", "RRR", 'R', GCItems.gemRuby });
        GameRegistry.addRecipe(new ItemStack(GCBlocks.blockGem, 1, 2), new Object[] { "SSS", "SSS", "SSS", 'S', GCItems.gemSapphire });
        GameRegistry.addRecipe(new ItemStack(GCBlocks.blockGem, 1, 3), new Object[] { "EEE", "EEE", "EEE", 'E', GCItems.gemEmerald });
        GameRegistry.addRecipe(new ItemStack(GCBlocks.blockGem, 1, 4), new Object[] { "TTT", "TTT", "TTT", 'T', GCItems.gemTopaz });
        GameRegistry.addRecipe(new ItemStack(GCBlocks.blockGem, 1, 5), new Object[] { "PP", "PP", 'P', GCItems.itemPyrite });
        GameRegistry.addRecipe(new ItemStack(GCBlocks.blockGem, 1, 6), new Object[] { "BBB", "BBB", "BBB", 'B', GCItems.blackDiamond });
        GameRegistry.addRecipe(new ItemStack(GCItems.gemAmethyst, 9), new Object[] { "A", 'A', (new ItemStack(GCBlocks.blockGem, 1, 0)) });
        GameRegistry.addRecipe(new ItemStack(GCItems.gemRuby, 9), new Object[] { "R", 'R', (new ItemStack(GCBlocks.blockGem, 1, 1)) });
        GameRegistry.addRecipe(new ItemStack(GCItems.gemSapphire, 9), new Object[] { "S", 'S', (new ItemStack(GCBlocks.blockGem, 1, 2)) });
        GameRegistry.addRecipe(new ItemStack(GCItems.gemEmerald, 9), new Object[] { "E", 'E', (new ItemStack(GCBlocks.blockGem, 1, 3)) });
        GameRegistry.addRecipe(new ItemStack(GCItems.gemTopaz, 9), new Object[] { "T", 'T', (new ItemStack(GCBlocks.blockGem, 1, 4)) });
        GameRegistry.addRecipe(new ItemStack(GCItems.itemPyrite, 4), new Object[] { "P", 'P', (new ItemStack(GCBlocks.blockGem, 1, 5)) });
        GameRegistry.addRecipe(new ItemStack(GCItems.blackDiamond, 9), new Object[] { "B", 'B', (new ItemStack(GCBlocks.blockGem, 1, 6)) });
        GameRegistry.addRecipe(new ItemStack(GCItems.diamondStick, 4), new Object[] { "D", "D", 'D', Item.diamond });
        GameRegistry.addRecipe(new ItemStack(GCItems.atshovel, 1), new Object[] { "A", "S", "S", 'A', GCItems.gemAmethyst, 'S', Item.stick });
        GameRegistry.addRecipe(new ItemStack(GCItems.atpickaxe, 1), new Object[] { "AAA", " S ", " S ", 'A', GCItems.gemAmethyst, 'S', Item.stick });
        GameRegistry.addRecipe(new ItemStack(GCItems.ataxe, 1), new Object[] { "AA", "AS", " S", 'A', GCItems.gemAmethyst, 'S', Item.stick });
        GameRegistry.addRecipe(new ItemStack(GCItems.atsword, 1), new Object[] { "A", "A", "S", 'A', GCItems.gemAmethyst, 'S', Item.stick });
        GameRegistry.addRecipe(new ItemStack(GCItems.athoe, 1), new Object[] { "AA", " S", " S", 'A', GCItems.gemAmethyst, 'S', Item.stick });
        GameRegistry.addRecipe(new ItemStack(GCItems.rtshovel, 1), new Object[] { "R", "S", "S", 'R', GCItems.gemRuby, 'S', Item.stick });
        GameRegistry.addRecipe(new ItemStack(GCItems.rtpickaxe, 1), new Object[] { "RRR", " S ", " S ", 'R', GCItems.gemRuby, 'S', Item.stick });
        GameRegistry.addRecipe(new ItemStack(GCItems.rtaxe, 1), new Object[] { "RR", "RS", " S", 'R', GCItems.gemRuby, 'S', Item.stick });
        GameRegistry.addRecipe(new ItemStack(GCItems.rtsword, 1), new Object[] { "R", "R", "S", 'R', GCItems.gemRuby, 'S', Item.stick });
        GameRegistry.addRecipe(new ItemStack(GCItems.rthoe, 1), new Object[] { "RR", " S", " S", 'R', GCItems.gemRuby, 'S', Item.stick });
        GameRegistry.addRecipe(new ItemStack(GCItems.stshovel, 1), new Object[] { "A", "S", "S", 'A', GCItems.gemSapphire, 'S', Item.stick });
        GameRegistry.addRecipe(new ItemStack(GCItems.stpickaxe, 1), new Object[] { "AAA", " S ", " S ", 'A', GCItems.gemSapphire, 'S', Item.stick });
        GameRegistry.addRecipe(new ItemStack(GCItems.staxe, 1), new Object[] { "AA", "AS", " S", 'A', GCItems.gemSapphire, 'S', Item.stick });
        GameRegistry.addRecipe(new ItemStack(GCItems.stsword, 1), new Object[] { "A", "A", "S", 'A', GCItems.gemSapphire, 'S', Item.stick });
        GameRegistry.addRecipe(new ItemStack(GCItems.sthoe, 1), new Object[] { "AA", " S", " S", 'A', GCItems.gemSapphire, 'S', Item.stick });
        GameRegistry.addRecipe(new ItemStack(GCItems.etshovel, 1), new Object[] { "E", "S", "S", 'E', GCItems.gemEmerald, 'S', Item.stick });
        GameRegistry.addRecipe(new ItemStack(GCItems.etpickaxe, 1), new Object[] { "EEE", " S ", " S ", 'E', GCItems.gemEmerald, 'S', Item.stick });
        GameRegistry.addRecipe(new ItemStack(GCItems.etaxe, 1), new Object[] { "EE", "ES", " S", 'E', GCItems.gemEmerald, 'S', Item.stick });
        GameRegistry.addRecipe(new ItemStack(GCItems.etsword, 1), new Object[] { "E", "E", "S", 'E', GCItems.gemEmerald, 'S', Item.stick });
        GameRegistry.addRecipe(new ItemStack(GCItems.ethoe, 1), new Object[] { "EE", " S", " S", 'E', GCItems.gemEmerald, 'S', Item.stick });
        GameRegistry.addRecipe(new ItemStack(GCItems.ttshovel, 1), new Object[] { "T", "S", "S", 'T', GCItems.gemTopaz, 'S', Item.stick });
        GameRegistry.addRecipe(new ItemStack(GCItems.ttpickaxe, 1), new Object[] { "TTT", " S ", " S ", 'T', GCItems.gemTopaz, 'S', Item.stick });
        GameRegistry.addRecipe(new ItemStack(GCItems.ttaxe, 1), new Object[] { "TT", "TS", " S", 'T', GCItems.gemTopaz, 'S', Item.stick });
        GameRegistry.addRecipe(new ItemStack(GCItems.ttsword, 1), new Object[] { "T", "T", "S", 'T', GCItems.gemTopaz, 'S', Item.stick });
        GameRegistry.addRecipe(new ItemStack(GCItems.tthoe, 1), new Object[] { "TT", " S", " S", 'T', GCItems.gemTopaz, 'S', Item.stick });
        GameRegistry.addRecipe(new ItemStack(GCItems.ptshovel, 1), new Object[] { "T", "S", "S", 'T', (new ItemStack(GCBlocks.blockGem, 1, 5)), 'S', Item.stick });
        GameRegistry.addRecipe(new ItemStack(GCItems.ptpickaxe, 1), new Object[] { "TTT", " S ", " S ", 'T', (new ItemStack(GCBlocks.blockGem, 1, 5)), 'S', Item.stick });
        GameRegistry.addRecipe(new ItemStack(GCItems.ptaxe, 1), new Object[] { "TT", "TS", " S", 'T', (new ItemStack(GCBlocks.blockGem, 1, 5)), 'S', Item.stick });
        GameRegistry.addRecipe(new ItemStack(GCItems.ptsword, 1), new Object[] { "T", "T", "S", 'T', (new ItemStack(GCBlocks.blockGem, 1, 5)), 'S', Item.stick });
        GameRegistry.addRecipe(new ItemStack(GCItems.pthoe, 1), new Object[] { "TT", " S", " S", 'T', (new ItemStack(GCBlocks.blockGem, 1, 5)), 'S', Item.stick });
        GameRegistry.addRecipe(new ItemStack(GCItems.bdshovel, 1), new Object[] { "T", "S", "S", 'T', GCItems.blackDiamond, 'S', GCItems.diamondStick });
        GameRegistry.addRecipe(new ItemStack(GCItems.bdpickaxe, 1), new Object[] { "TTT", " S ", " S ", 'T', GCItems.blackDiamond, 'S', GCItems.diamondStick });
        GameRegistry.addRecipe(new ItemStack(GCItems.bdaxe, 1), new Object[] { "TT", "TS", " S", 'T', GCItems.blackDiamond, 'S', GCItems.diamondStick });
        GameRegistry.addRecipe(new ItemStack(GCItems.bdsword, 1), new Object[] { "T", "T", "S", 'T', GCItems.blackDiamond, 'S', GCItems.diamondStick });
        GameRegistry.addRecipe(new ItemStack(GCItems.bdhoe, 1), new Object[] { "TT", " S", " S", 'T', GCItems.blackDiamond, 'S', GCItems.diamondStick });
        GameRegistry.addRecipe(new ItemStack(GCItems.aahelmet, 1), new Object[] { "AAA", "A A", 'A', GCItems.gemAmethyst });
        GameRegistry.addRecipe(new ItemStack(GCItems.aaplate, 1), new Object[] { "A A", "AAA", "AAA", 'A', GCItems.gemAmethyst });
        GameRegistry.addRecipe(new ItemStack(GCItems.aaleggings, 1), new Object[] { "AAA", "A A", "A A", 'A', GCItems.gemAmethyst });
        GameRegistry.addRecipe(new ItemStack(GCItems.aaboots, 1), new Object[] { "A A", "A A", 'A', GCItems.gemAmethyst });
        GameRegistry.addRecipe(new ItemStack(GCItems.rahelmet, 1), new Object[] { "RRR", "R R", 'R', GCItems.gemRuby });
        GameRegistry.addRecipe(new ItemStack(GCItems.raplate, 1), new Object[] { "R R", "RRR", "RRR", 'R', GCItems.gemRuby });
        GameRegistry.addRecipe(new ItemStack(GCItems.raleggings, 1), new Object[] { "RRR", "R R", "R R", 'R', GCItems.gemRuby });
        GameRegistry.addRecipe(new ItemStack(GCItems.raboots, 1), new Object[] { "R R", "R R", 'R', GCItems.gemRuby });
        GameRegistry.addRecipe(new ItemStack(GCItems.sahelmet, 1), new Object[] { "SSS", "S S", 'S', GCItems.gemSapphire });
        GameRegistry.addRecipe(new ItemStack(GCItems.saplate, 1), new Object[] { "S S", "SSS", "SSS", 'S', GCItems.gemSapphire });
        GameRegistry.addRecipe(new ItemStack(GCItems.saleggings, 1), new Object[] { "SSS", "S S", "S S", 'S', GCItems.gemSapphire });
        GameRegistry.addRecipe(new ItemStack(GCItems.saboots, 1), new Object[] { "S S", "S S", 'S', GCItems.gemSapphire });
        GameRegistry.addRecipe(new ItemStack(GCItems.eahelmet, 1), new Object[] { "EEE", "E E", 'E', GCItems.gemEmerald });
        GameRegistry.addRecipe(new ItemStack(GCItems.eaplate, 1), new Object[] { "E E", "EEE", "EEE", 'E', GCItems.gemEmerald });
        GameRegistry.addRecipe(new ItemStack(GCItems.ealeggings, 1), new Object[] { "EEE", "E E", "E E", 'E', GCItems.gemEmerald });
        GameRegistry.addRecipe(new ItemStack(GCItems.eaboots, 1), new Object[] { "E E", "E E", 'E', GCItems.gemEmerald });
        GameRegistry.addRecipe(new ItemStack(GCItems.tahelmet, 1), new Object[] { "TTT", "T T", 'T', GCItems.gemTopaz });
        GameRegistry.addRecipe(new ItemStack(GCItems.taplate, 1), new Object[] { "T T", "TTT", "TTT", 'T', GCItems.gemTopaz });
        GameRegistry.addRecipe(new ItemStack(GCItems.taleggings, 1), new Object[] { "TTT", "T T", "T T", 'T', GCItems.gemTopaz });
        GameRegistry.addRecipe(new ItemStack(GCItems.taboots, 1), new Object[] { "T T", "T T", 'T', GCItems.gemTopaz });
        GameRegistry.addRecipe(new ItemStack(GCItems.bdhelmet, 1), new Object[] { "BDB", "B B", 'B', GCItems.blackDiamond, 'D', Item.diamond });
        GameRegistry.addRecipe(new ItemStack(GCItems.bdplate, 1), new Object[] { "B B", "BDB", "BBB", 'B', GCItems.blackDiamond, 'D', Item.diamond });
        GameRegistry.addRecipe(new ItemStack(GCItems.bdleggings, 1), new Object[] { "BDB", "B B", "B B", 'B', GCItems.blackDiamond, 'D', Item.diamond });
        GameRegistry.addRecipe(new ItemStack(GCItems.bdboots, 1), new Object[] { "D D", "B B", 'B', GCItems.blackDiamond, 'D', Item.diamond });
    }

    public static void addOreDictEntries()
    {
        OreDictionary.registerOre("gemAmethyst", GCItems.gemAmethyst);
        OreDictionary.registerOre("gemRuby", GCItems.gemRuby);
        OreDictionary.registerOre("gemSapphire", GCItems.gemSapphire);
        OreDictionary.registerOre("gemEmerald", GCItems.gemEmerald);
        OreDictionary.registerOre("gemTopaz", GCItems.gemTopaz);
        OreDictionary.registerOre("gemBlackDiamond", GCItems.blackDiamond);
        OreDictionary.registerOre("gemPyrite", GCItems.itemPyrite);
        OreDictionary.registerOre("itemPyrite", GCItems.itemPyrite);
    }
}