package domi1819.gemscraft.util;

import cpw.mods.fml.common.registry.LanguageRegistry;

public class MultiLanguageRegistry
{
    public static void addObjectNames(Object object, String name, String nameDE)
    {
        LanguageRegistry.addName(object, name);
        LanguageRegistry.instance().addNameForObject(object, "de_DE", nameDE);
    }
    
    public static void addStringNames(String object, String name, String nameDE)
    {
        LanguageRegistry.instance().addStringLocalization(object, name);
        LanguageRegistry.instance().addStringLocalization(object, "de_DE", nameDE);
    }
    
    public static void addAchievementNames(String achievementObject, String title, String description, String titleDE, String descriptionDE)
    {
        LanguageRegistry.instance().addStringLocalization("achievement." + achievementObject, title);
        LanguageRegistry.instance().addStringLocalization("achievement." + achievementObject + ".desc", description);
        LanguageRegistry.instance().addStringLocalization("achievement." + achievementObject, "de_DE", titleDE);
        LanguageRegistry.instance().addStringLocalization("achievement." + achievementObject + ".desc", "de_DE", descriptionDE);
        
    }
}