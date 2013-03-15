package domi1819.gemscraft.items;

import domi1819.gemscraft.util.GCProperties;
import net.minecraft.item.*;

public class ItemGemHoe extends ItemHoe
{
    public ItemGemHoe(int itemID, EnumToolMaterial toolmaterial)
    {
        super(itemID, toolmaterial);
    }

    public String getTextureFile()
    {
        return "/domi1819/gemscraft/img/items.png";
    }
    
    public boolean getIsRepairable(ItemStack tool, ItemStack resource)
    {
        if ((resource.itemID == GCProperties.itemAmethystID && this.itemID == GCProperties.amethystToolsBaseID + 4) ||
            (resource.itemID == GCProperties.itemRubyID && this.itemID == GCProperties.rubyToolsBaseID + 4) ||
            (resource.itemID == GCProperties.itemSapphireID && this.itemID == GCProperties.sapphireToolsBaseID + 4) ||
            (resource.itemID == GCProperties.itemEmeraldID && this.itemID == GCProperties.emeraldToolsBaseID + 4) ||
            (resource.itemID == GCProperties.itemTopazID && this.itemID == GCProperties.topazToolsBaseID + 4) ||
            (resource.itemID == GCProperties.blockGemID && resource.getItemDamage() == 5 && this.itemID == GCProperties.pyriteToolsBaseID + 4))
            return true;
        else return false;
    }
}