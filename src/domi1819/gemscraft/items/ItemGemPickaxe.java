package domi1819.gemscraft.items;

import domi1819.gemscraft.GCBlocks;
import domi1819.gemscraft.util.GCProperties;
import domi1819.gemscraft.util.WorldHelper;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.*;
import net.minecraft.world.World;

public class ItemGemPickaxe extends ItemPickaxe
{
    public ItemGemPickaxe(int itemID, EnumToolMaterial toolmaterial)
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
    	if (itemStack.itemID == GCProperties.blackDiamondToolsBaseID + 1)
        {
        	ItemStack output = null;
        	
            if (itemStack.getItemDamage() < 2116)
            {
            	int block = world.getBlockId(x, y, z);
            	
            	if (block == Block.stone.blockID || block == Block.cobblestone.blockID)
            		output = new ItemStack(Block.stone.blockID, 1, 0);
            	else if (block == Block.oreGold.blockID)
            		output = new ItemStack(Item.ingotGold.itemID, 1, 0);
            	else if (block == Block.oreIron.blockID)
            		output = new ItemStack(Item.ingotIron.itemID, 1, 0);
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
        if ((resource.itemID == GCProperties.itemAmethystID && this.itemID == GCProperties.amethystToolsBaseID + 1) ||
            (resource.itemID == GCProperties.itemRubyID && this.itemID == GCProperties.rubyToolsBaseID + 1) ||
            (resource.itemID == GCProperties.itemSapphireID && this.itemID == GCProperties.sapphireToolsBaseID + 1) ||
            (resource.itemID == GCProperties.itemEmeraldID && this.itemID == GCProperties.emeraldToolsBaseID + 1) ||
            (resource.itemID == GCProperties.itemTopazID && this.itemID == GCProperties.topazToolsBaseID + 1) ||
            (resource.itemID == GCProperties.blockGemID && resource.getItemDamage() == 5 && this.itemID == GCProperties.pyriteToolsBaseID + 1))
            return true;
        else return false;
    }
}