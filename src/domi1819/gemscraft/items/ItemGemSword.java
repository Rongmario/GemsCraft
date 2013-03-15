package domi1819.gemscraft.items;

import domi1819.gemscraft.util.GCProperties;
import net.minecraft.item.*;
import net.minecraft.entity.EntityLiving;

public class ItemGemSword extends ItemSword
{
    public ItemGemSword(int itemID, EnumToolMaterial toolmaterial)
    {
        super(itemID, toolmaterial);
    }

    public String getTextureFile()
    {
        return "/domi1819/gemscraft/img/items.png";
    }

    public boolean itemInteractionForEntity(ItemStack itemstack, EntityLiving entity)
    {
        //Black Diamond sword
        if (itemstack.itemID == GCProperties.blackDiamondToolsBaseID + 3)
        {
            if (itemstack.getItemDamage() < 2116)
            {
                entity.setFire(12);
                itemstack.setItemDamage(itemstack.getItemDamage() + 5);
            }
        }

        return true;
    }
    
    public boolean getIsRepairable(ItemStack tool, ItemStack resource)
    {
        if ((resource.itemID == GCProperties.itemAmethystID && this.itemID == GCProperties.amethystToolsBaseID + 3) ||
            (resource.itemID == GCProperties.itemRubyID && this.itemID == GCProperties.rubyToolsBaseID + 3) ||
            (resource.itemID == GCProperties.itemSapphireID && this.itemID == GCProperties.sapphireToolsBaseID + 3) ||
            (resource.itemID == GCProperties.itemEmeraldID && this.itemID == GCProperties.emeraldToolsBaseID + 3) ||
            (resource.itemID == GCProperties.itemTopazID && this.itemID == GCProperties.topazToolsBaseID + 3) ||
            (resource.itemID == GCProperties.blockGemID && resource.getItemDamage() == 5 && this.itemID == GCProperties.pyriteToolsBaseID + 3))
            return true;
        else return false;
    }
}