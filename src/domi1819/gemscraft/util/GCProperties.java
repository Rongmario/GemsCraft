package domi1819.gemscraft.util;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import net.minecraftforge.common.Configuration;

public class GCProperties 
{
    public static int blockGemID, blockGemOreID;
    public static int itemAmethystID, itemRubyID, itemSapphireID, itemEmeraldID, itemTopazID, itemPyriteID, itemBlackDiamondID, itemDiamondStickID;
    public static int amethystToolsBaseID, rubyToolsBaseID, sapphireToolsBaseID, emeraldToolsBaseID, topazToolsBaseID, pyriteToolsBaseID, blackDiamondToolsBaseID;
    public static int amethystArmorBaseID, rubyArmorBaseID, sapphireArmorBaseID, emeraldArmorBaseID, topazArmorBaseID, blackDiamondArmorBaseID;
    public static boolean generateAmethyst, generateRuby, generateSapphire, generateEmerald, generateTopaz, generatePyrite, generateBlackDiamond;
    public static boolean increaseDiamondOreHarvestLvl, generateInOtherDimensions;
    public static int amethystVeinCount, rubyVeinCount, sapphireVeinCount, emeraldVeinCount, topazVeinCount, pyriteVeinCount, bdVeinCount;
    public static int amethystOreHeight, rubyOreHeight, sapphireOreHeight, emeraldOreHeight, topazOreHeight, pyriteOreHeight, bdOreHeight;
    
    public static int dustTopazID, dustAmethystID;
    
    public static boolean isClient;
    
    public static void loadConfig(Configuration config)
    {
    	isClient = FMLCommonHandler.instance().getSide() == Side.CLIENT;
    	
        config.load();
        
        blockGemID = config.get("block", "Gem Block ID", 3600).getInt();
        blockGemOreID = config.get("block", "Gem Ore ID", 3601).getInt();
        
        itemAmethystID = config.get("item", "Amethyst ID", 3656).getInt();
        itemRubyID = config.get("item", "Ruby ID", 3657).getInt();
        itemSapphireID = config.get("item", "Sapphire ID", 3658).getInt();
        itemEmeraldID = config.get("item", "Emerald ID", 3659).getInt();
        itemTopazID = config.get("item", "Topaz ID", 3660).getInt();
        itemPyriteID = config.get("item", "Pyrite ID", 3661).getInt();
        itemBlackDiamondID = config.get("item", "Black Diamond ID", 3662).getInt();
        itemDiamondStickID = config.get("item", "Diamond Stick ID", 3655).getInt();
        dustTopazID = config.get("item", "Topaz Dust ID (GregTech)", 3620).getInt();
        dustAmethystID = config.get("item", "Amethyst Dust ID (GregTech)", 3621).getInt();
        
        amethystToolsBaseID = config.get("item", "Amethyst Tools Base ID", 3700).getInt();
        rubyToolsBaseID = config.get("item", "Ruby Tools Base ID", 3705).getInt();
        sapphireToolsBaseID = config.get("item", "Sapphire Tools Base ID", 3710).getInt();
        emeraldToolsBaseID = config.get("item", "Emerald Tools Base ID", 3715).getInt();
        topazToolsBaseID = config.get("item", "Topaz Tools Base ID", 3720).getInt();
        pyriteToolsBaseID = config.get("item", "Pyrite Tools Base ID", 3725).getInt();
        blackDiamondToolsBaseID = config.get("item", "Black Diamond Tools Base ID", 3730).getInt();
        
        amethystArmorBaseID = config.get("item", "Amethyst Armor Base ID", 3900).getInt();
        rubyArmorBaseID = config.get("item", "Ruby Armor Base ID", 3904).getInt();
        sapphireArmorBaseID = config.get("item", "Sapphire Armor Base ID", 3908).getInt();
        emeraldArmorBaseID = config.get("item", "Emerald Armor Base ID", 3912).getInt();
        topazArmorBaseID = config.get("item", "Topaz Armor Base ID", 3916).getInt();
        blackDiamondArmorBaseID = config.get("item", "Black Diamond Armor Base ID", 3920).getInt();
        
        increaseDiamondOreHarvestLvl = config.get("general", "Diamond Ore harvest level fix", true).getBoolean(true);
        
        amethystVeinCount = config.get("general", "Amethyst Veins per Chunk", 2).getInt();
        rubyVeinCount = config.get("general", "Ruby Veins per Chunk", 1).getInt();
        sapphireVeinCount = config.get("general", "Sapphire Veins per Chunk", 2).getInt();
        emeraldVeinCount = config.get("general", "Emerald Veins per Chunk", 1).getInt();
        topazVeinCount = config.get("general", "Topaz Veins per Chunk", 2).getInt();
        pyriteVeinCount = config.get("general", "Pyrite Veins per Chunk", 5).getInt();
        bdVeinCount = config.get("general", "Black Diamond Veins per Chunk", 4).getInt();
        
        amethystOreHeight = config.get("general", "Amethyst max. Generation Height", 25).getInt();
        rubyOreHeight = config.get("general", "Ruby max. Generation Height", 16).getInt();
        sapphireOreHeight = config.get("general", "Sapphire max. Generation Height", 20).getInt();
        emeraldOreHeight = config.get("general", "Emerald max. Generation Height", 18).getInt();
        topazOreHeight = config.get("general", "Topaz max. Generation Height", 22).getInt();
        pyriteOreHeight = config.get("general", "Pyrite max. Generation Height", 50).getInt();
        bdOreHeight = config.get("general", "Black Diamond max. Generation Height", 25).getInt();
        
        generateInOtherDimensions = config.get("general", "Generate Gems in Mod Dimensions", true).getBoolean(true);

        config.save();
    }
}
