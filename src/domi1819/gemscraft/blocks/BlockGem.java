package domi1819.gemscraft.blocks;

import java.util.Random;
import java.util.List;

import domi1819.gemscraft.GCItems;
import net.minecraftforge.common.*;
import static net.minecraftforge.common.ForgeDirection.*;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.*;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Icon;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.Material;

public class BlockGem extends Block
{
    public static Icon[] textures = {null, null, null, null, null, null, null};

    public BlockGem(int blockID)
    {
        super(blockID, Material.iron);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }

    public String getTextureFile()
    {
        return "/domi1819/gemscraft/img/blocks.png";
    }

    public int damageDropped(int meta)
    {
        return meta;
    }

    //public void loadTextures(IconRegister obj)
    //I'd have helped to deobfuscate them if Searge hadn't ignore me >_<
    public void func_94332_a(IconRegister iconRegistry)
    {
        //func_94245_a = getIconFromString
        textures[0] = iconRegistry.func_94245_a("gc_blockAmethyst");
        textures[1] = iconRegistry.func_94245_a("gc_blockRuby");
        textures[2] = iconRegistry.func_94245_a("gc_blockSapphire");
        textures[3] = iconRegistry.func_94245_a("gc_blockEmerald");
        textures[4] = iconRegistry.func_94245_a("gc_blockTopaz");
        textures[5] = iconRegistry.func_94245_a("gc_blockPyrite");
        textures[6] = iconRegistry.func_94245_a("gc_blockBlackDiamond");
    }
    
    public Icon getBlockTextureFromSideAndMetadata(int side, int meta)
    {
    	if (meta < 7) return textures[meta];
    	return null;
    }
    
    public boolean isFireSource(World world, int x, int y, int z, int metadata, ForgeDirection side)
    {
        if (world.getBlockMetadata(x, y, z) == 6 && side == UP)
        {
            return true;
        }

        return false;
    }

    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer entityplayer, int i, float f, float g, float h)
    {
        if (world.getBlockMetadata(x, y, z) == 6)
        {
            if (world.getBlockId(x, y + 1, z) == Block.fire.blockID)
            {
                if (entityplayer.getCurrentEquippedItem() != null)
                {
                    if (entityplayer.getCurrentEquippedItem().getItem() == Item.diamond && entityplayer.getCurrentEquippedItem().stackSize > 1)
                    {
                        entityplayer.inventory.setInventorySlotContents(entityplayer.inventory.currentItem, new ItemStack(entityplayer.getCurrentEquippedItem().itemID, entityplayer.getCurrentEquippedItem().stackSize - 2, 0));
                        world.setBlockAndMetadataWithNotify(x, y + 1, z, 0, 0, 1);
                        this.dropBlockAsItem_do(world, x, y, z, new ItemStack(GCItems.blackDiamond, 1));
                        entityplayer.attackEntityFrom(DamageSource.onFire, 16);
                        return true;
                    }

                    if (entityplayer.getCurrentEquippedItem().getItem() == Item.ingotGold && entityplayer.getCurrentEquippedItem().stackSize > 1)
                    {
                        entityplayer.inventory.setInventorySlotContents(entityplayer.inventory.currentItem, new ItemStack(entityplayer.getCurrentEquippedItem().itemID, entityplayer.getCurrentEquippedItem().stackSize - 2, 0));
                        world.setBlockAndMetadataWithNotify(x, y + 1, z, 0, 0, 1);
                        this.dropBlockAsItem_do(world, x, y, z, new ItemStack(Item.diamond, 1));
                        entityplayer.attackEntityFrom(DamageSource.onFire, 12);
                        return true;
                    }
                }
            }

            return false;
        }

        return false;
    }

    public void getSubBlocks(int blockID, CreativeTabs creativetab, List list)
    {
        list.add(new ItemStack(blockID, 1, 0));
        list.add(new ItemStack(blockID, 1, 1));
        list.add(new ItemStack(blockID, 1, 2));
        list.add(new ItemStack(blockID, 1, 3));
        list.add(new ItemStack(blockID, 1, 4));
        list.add(new ItemStack(blockID, 1, 5));
        list.add(new ItemStack(blockID, 1, 6));
    }
    
    public int idPicked(World world, int i, int j, int k)
    {
        return this.blockID;
    }
}
