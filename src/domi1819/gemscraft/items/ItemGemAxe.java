package domi1819.gemscraft.items;

import domi1819.gemscraft.util.GCProperties;
import domi1819.gemscraft.util.WorldHelper;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.*;
import net.minecraft.world.World;

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
    
    public boolean onItemUseFirst(ItemStack itemStack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ)
    {
    	if (!world.isRemote)
    	if (itemStack.itemID == GCProperties.blackDiamondToolsBaseID + 2)
        {
        	ItemStack output = null;
        	
            if (itemStack.getItemDamage() < 2116)
            {
            	int block = world.getBlockId(x, y, z);
            	
            	if (block == Block.wood.blockID)
            		output = new ItemStack(Item.coal.itemID, 1, 1);
            }
            
            if (output != null)
            {
            	world.setBlock(x, y, z, 0);
            	WorldHelper.dropItemInWorld(world, x, y, z, output);
            	itemStack.setItemDamage(itemStack.getItemDamage() + 5);
            }
            
            return true;
        }
    	
        return false;
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