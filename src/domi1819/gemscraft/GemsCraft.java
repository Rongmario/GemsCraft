package domi1819.gemscraft;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.*;
import domi1819.gemscraft.integration.GregTechIntegration;
import domi1819.gemscraft.integration.IndustrialCraftIntegration;
import domi1819.gemscraft.util.GCEnums;
import domi1819.gemscraft.util.GCProperties;
import domi1819.gemscraft.util.GCWorldGenerator;

@Mod(modid = "GemsCraft", name = "GemsCraft", version = "2.8")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class GemsCraft
{
    @PreInit
    public void preLoad(FMLPreInitializationEvent event)
    {        
        GCProperties.loadConfig(new Configuration(event.getSuggestedConfigurationFile()));
    }
    
    @Init
    public void load(FMLInitializationEvent event)
    {
        GCItems.initItems();
        GCBlocks.initBlocks();
        GCLocalization.addNames();
        GCCrafting.addCraftingRecipes();
        GCCrafting.addOreDictEntries();
        GCEnums.setHarvestLevels();
        
        GameRegistry.registerWorldGenerator(new GCWorldGenerator());
    }
    
    @PostInit
    public void postInit(FMLPostInitializationEvent event)
    {
        IndustrialCraftIntegration.initPlugin();
        GregTechIntegration.initPlugin();
    }
}