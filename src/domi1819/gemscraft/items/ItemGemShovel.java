package domi1819.gemscraft.items;

import domi1819.gemscraft.util.GCProperties;
import net.minecraft.item.*;

public class ItemGemShovel extends ItemSpade
{
    public ItemGemShovel(int itemID, EnumToolMaterial toolmaterial)
    {
        super(itemID, toolmaterial);
    }

    public String getTextureFile()
    {
        return "/domi1819/gemscraft/img/items.png";
    }
    
    public boolean getIsRepairable(ItemStack tool, ItemStack resource)
    {
        if ((resource.itemID == GCProperties.itemAmethystID && this.itemID == GCProperties.amethystToolsBaseID) ||
            (resource.itemID == GCProperties.itemRubyID && this.itemID == GCProperties.rubyToolsBaseID) ||
            (resource.itemID == GCProperties.itemSapphireID && this.itemID == GCProperties.sapphireToolsBaseID) ||
            (resource.itemID == GCProperties.itemEmeraldID && this.itemID == GCProperties.emeraldToolsBaseID) ||
            (resource.itemID == GCProperties.itemTopazID && this.itemID == GCProperties.topazToolsBaseID) ||
            (resource.itemID == GCProperties.blockGemID && resource.getItemDamage() == 5 && this.itemID == GCProperties.pyriteToolsBaseID))
            return true;
        else return false;
    }
}