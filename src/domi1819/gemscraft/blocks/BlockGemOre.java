package domi1819.gemscraft.blocks;

import java.util.*;

import domi1819.gemscraft.util.GCProperties;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.Material;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;

public class BlockGemOre extends Block
{
    public static Icon[] textures = new Icon[7];
    
    public BlockGemOre(int blockID)
    {
        super(blockID, Material.rock);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }
    
    public void registerIcons(IconRegister iconRegistry)
    {
        textures[0] = iconRegistry.registerIcon("gc_blockAmethystOre");
        textures[1] = iconRegistry.registerIcon("gc_blockRubyOre");
        textures[2] = iconRegistry.registerIcon("gc_blockSapphireOre");
        textures[3] = iconRegistry.registerIcon("gc_blockEmeraldOre");
        textures[4] = iconRegistry.registerIcon("gc_blockTopazOre");
        textures[5] = iconRegistry.registerIcon("gc_blockPyriteOre");
        textures[6] = iconRegistry.registerIcon("gc_blockBlackDiamondOre");
    }
    
    public Icon getBlockTextureFromSideAndMetadata(int side, int meta)
    {
    	if (meta < 7) return textures[meta];
    	return null;
    }

    public int getDamageValue(World world, int x, int y, int z)
    {
        return world.getBlockMetadata(x, y, z);
    }
    
    public int idDropped(int meta, Random random, int fortune)
    {
        switch (meta)
        {
            case 0:
                return GCProperties.itemAmethystID;

            case 1:
                return GCProperties.itemRubyID;

            case 2:
                return GCProperties.itemSapphireID;

            case 3:
                return GCProperties.itemEmeraldID;

            case 4:
                return GCProperties.itemTopazID;

            case 5:
                return GCProperties.itemPyriteID;

            case 6:
                return GCProperties.itemBlackDiamondID;

            default:
                return 1;
        }
    }

    public void dropBlockAsItemWithChance(World world, int x, int y, int z, int i, float f, int j)
    {
        super.dropBlockAsItemWithChance(world, x, y, z, i, f, j);
        int xp = MathHelper.getRandomIntegerInRange(world.rand, 2, 5);
        this.dropXpOnBlockBreak(world, x, y, z, xp);
    }

    public int quantityDropped(int meta, int fortune, Random random)
    {
        switch (meta)
        {
            case 5: return 2 + random.nextInt(3);
            default: return 1;
        }
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
