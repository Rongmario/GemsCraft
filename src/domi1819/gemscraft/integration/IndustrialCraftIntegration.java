package domi1819.gemscraft.integration;

import domi1819.gemscraft.GCItems;
import domi1819.gemscraft.util.GCProperties;
import domi1819.gemscraft.util.MultiLanguageRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class IndustrialCraftIntegration
{
    public static Item topazDust, amethystDust;
    public static boolean pluginLoaded;
    
    public static void initPlugin()
    {
        try 
        {
            Class.forName("ic2.core.item.ItemScrapbox").getMethod("addDrop", ItemStack.class, float.class).invoke(null, new ItemStack(GCItems.blackDiamond, 1, 0), 0.1F);
            pluginLoaded = true;
        }
        catch(Exception e) { pluginLoaded = false; }
        
        if (pluginLoaded) postInit();
        
    }
    
    public static void postInit()
    {
        System.out.println("[GemsCraft] IndustrialCraft module loaded!");
        
        topazDust = new ItemGemDust(GCProperties.dustTopazID - 256).setUnlocalizedName("topazDust");
        amethystDust = new ItemGemDust(GCProperties.dustAmethystID - 256).setUnlocalizedName("amethystDust");
        MultiLanguageRegistry.addObjectNames(topazDust, "Topaz Dust", "Topasstaub");
        MultiLanguageRegistry.addObjectNames(amethystDust, "Amethyst Dust", "Amethyststaub");
        
        try
        {
            Class.forName("ic2.api.Ic2Recipes").getMethod("addMaceratorRecipe", ItemStack.class, ItemStack.class).invoke(null, new ItemStack(GCProperties.itemAmethystID, 1, 0), new ItemStack(GCProperties.dustAmethystID, 1, 0));
            Class.forName("ic2.api.Ic2Recipes").getMethod("addMaceratorRecipe", ItemStack.class, ItemStack.class).invoke(null, new ItemStack(GCProperties.itemTopazID, 1, 0), new ItemStack(GCProperties.dustTopazID, 1, 0));

            Class.forName("ic2.api.Ic2Recipes").getMethod("addMatterAmplifier", ItemStack.class, int.class).invoke(null, new ItemStack(GCProperties.itemTopazID, 1, 0), 10000);
            Class.forName("ic2.api.Ic2Recipes").getMethod("addMatterAmplifier", ItemStack.class, int.class).invoke(null, new ItemStack(GCProperties.itemAmethystID, 1, 0), 15000);
            Class.forName("ic2.api.Ic2Recipes").getMethod("addMatterAmplifier", ItemStack.class, int.class).invoke(null, new ItemStack(GCProperties.itemSapphireID, 1, 0), 20000);
            Class.forName("ic2.api.Ic2Recipes").getMethod("addMatterAmplifier", ItemStack.class, int.class).invoke(null, new ItemStack(GCProperties.itemEmeraldID, 1, 0), 30000);
            Class.forName("ic2.api.Ic2Recipes").getMethod("addMatterAmplifier", ItemStack.class, int.class).invoke(null, new ItemStack(GCProperties.itemRubyID, 1, 0), 40000);
        }
        catch(Exception e) {}
    }
}
