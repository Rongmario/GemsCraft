package domi1819.gemscraft.items;

import domi1819.gemscraft.util.GCProperties;
import net.minecraft.item.*;

public class ItemGemAxe extends ItemAxe
{
    public ItemGemAxe(int itemID, EnumToolMaterial toolmaterial)
    {
        super(itemID, toolmaterial);
    }

    public String getTextureFile()
    {
        return "/domi1819/gemscraft/img/items.png";
    }
    
    public boolean getIsRepairable(ItemStack tool, ItemStack resource)
    {
        if ((resource.itemID == GCProperties.itemAmethystID && this.itemID == GCProperties.amethystToolsBaseID + 2) ||
            (resource.itemID == GCProperties.itemRubyID && this.itemID == GCProperties.rubyToolsBaseID + 2) ||
            (resource.itemID == GCProperties.itemSapphireID && this.itemID == GCProperties.sapphireToolsBaseID + 2) ||
            (resource.itemID == GCProperties.itemEmeraldID && this.itemID == GCProperties.emeraldToolsBaseID + 2) ||
            (resource.itemID == GCProperties.itemTopazID && this.itemID == GCProperties.topazToolsBaseID + 2) ||
            (resource.itemID == GCProperties.blockGemID && resource.getItemDamage() == 5 && this.itemID == GCProperties.pyriteToolsBaseID + 2))
            return true;
        else return false;
    }
}