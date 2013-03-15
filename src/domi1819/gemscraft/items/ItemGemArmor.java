package domi1819.gemscraft.items;

import domi1819.gemscraft.util.GCProperties;
import net.minecraft.item.*;
import net.minecraftforge.common.IArmorTextureProvider;

public class ItemGemArmor extends ItemArmor implements IArmorTextureProvider
{
    public ItemGemArmor(int itemID, EnumArmorMaterial armormaterial, int armorID, int armorType)
    {
        super(itemID, armormaterial, armorID, armorType);
    }

    public String getTextureFile()
    {
        return "/domi1819/gemscraft/img/items.png";
    }

    public String getArmorTextureFile(ItemStack itemstack)
    {
        if (itemstack.itemID == GCProperties.amethystArmorBaseID || itemstack.itemID == GCProperties.amethystArmorBaseID + 1 || itemstack.itemID == GCProperties.amethystArmorBaseID + 3)
        {
            return "/domi1819/gemscraft/img/armor/amethyst_1.png";
        }

        if (itemstack.itemID == GCProperties.amethystArmorBaseID + 2)
        {
            return "/domi1819/gemscraft/img/armor/amethyst_2.png";
        }

        if (itemstack.itemID == GCProperties.rubyArmorBaseID || itemstack.itemID == GCProperties.rubyArmorBaseID + 1 || itemstack.itemID == GCProperties.rubyArmorBaseID + 3)
        {
            return "/domi1819/gemscraft/img/armor/ruby_1.png";
        }

        if (itemstack.itemID == GCProperties.rubyArmorBaseID + 2)
        {
            return "/domi1819/gemscraft/img/armor/ruby_2.png";
        }

        if (itemstack.itemID == GCProperties.sapphireArmorBaseID || itemstack.itemID == GCProperties.sapphireArmorBaseID + 1 || itemstack.itemID == GCProperties.sapphireArmorBaseID + 3)
        {
            return "/domi1819/gemscraft/img/armor/sapphire_1.png";
        }

        if (itemstack.itemID == GCProperties.sapphireArmorBaseID + 2)
        {
            return "/domi1819/gemscraft/img/armor/sapphire_2.png";
        }

        if (itemstack.itemID == GCProperties.emeraldArmorBaseID || itemstack.itemID == GCProperties.emeraldArmorBaseID + 1 || itemstack.itemID == GCProperties.emeraldArmorBaseID + 3)
        {
            return "/domi1819/gemscraft/img/armor/emerald_1.png";
        }

        if (itemstack.itemID == GCProperties.emeraldArmorBaseID + 2)
        {
            return "/domi1819/gemscraft/img/armor/emerald_2.png";
        }

        if (itemstack.itemID == GCProperties.topazArmorBaseID || itemstack.itemID == GCProperties.topazArmorBaseID + 1 || itemstack.itemID == GCProperties.topazArmorBaseID + 3)
        {
            return "/domi1819/gemscraft/img/armor/topaz_1.png";
        }

        if (itemstack.itemID == GCProperties.topazArmorBaseID + 2)
        {
            return "/domi1819/gemscraft/img/armor/topaz_2.png";
        }

        if (itemstack.itemID == GCProperties.blackDiamondArmorBaseID || itemstack.itemID == GCProperties.blackDiamondArmorBaseID + 1 || itemstack.itemID == GCProperties.blackDiamondArmorBaseID + 3)
        {
            return "/domi1819/gemscraft/img/armor/blackdiamond_1.png";
        }

        if (itemstack.itemID == GCProperties.blackDiamondArmorBaseID + 2)
        {
            return "/domi1819/gemscraft/img/armor/blackdiamond_2.png";
        }

        return "/domi1819/gemscraft/img/armor/amethyst_1.png";
    }
}