package domi1819.gemscraft.integration;

import java.util.List;

import domi1819.gemscraft.util.GCProperties;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemGemDust extends Item
{
    public ItemGemDust(int id)
    {
        super(id);
    }
    
    public String getTextureFile()
    {
        return "/domi1819/gemscraft/img/items.png";
    }
    
    public void addInformation(ItemStack itemstack, EntityPlayer player, List descriptiveList, boolean b)
    {
        if (itemstack.itemID == GCProperties.dustAmethystID) descriptiveList.add("SiO2");
        if (itemstack.itemID == GCProperties.dustTopazID) descriptiveList.add("Al2(OH)2SiO4");
    }
}
