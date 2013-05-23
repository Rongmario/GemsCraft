package domi1819.gemscraft.util;

import java.util.Random;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.world.World;
import net.minecraft.block.Block;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import domi1819.gemscraft.util.GCProperties;

public class GCWorldGenerator implements IWorldGenerator
{
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider c, IChunkProvider d)
    {
        int dimID = world.provider.dimensionId;
        
        if      (dimID == 0)   genSurface(world, random, chunkX * 16, chunkZ * 16);
        else if (dimID == -1)  genNether(world, random, chunkX * 16, chunkZ * 16);
        else if (dimID == 1)   genEnd(world, random, chunkX * 16, chunkZ * 16);
        else                   genOther(world, random, chunkX * 16, chunkZ * 16);
    }
        
    public void genSurface(World world, Random random, int chunkX, int chunkZ)
    {
        int gen, x, y, z;
        
        if (GCProperties.generateAmethyst)
        for (gen = 0; gen < GCProperties.amethystVeinCount; gen++)
        {
            x = chunkX + random.nextInt(16);
            y = random.nextInt(GCProperties.amethystOreHeight);
            z = chunkZ + random.nextInt(16);
            new WorldGenMinable(GCProperties.blockGemOreID, 0, 8, Block.stone.blockID).generate(world, random, x, y, z);
        }

        if (GCProperties.generateRuby)
        for (gen = 0; gen < GCProperties.rubyVeinCount; gen++)
        {
            x = chunkX + random.nextInt(16);
            y = random.nextInt(GCProperties.rubyOreHeight);
            z = chunkZ + random.nextInt(16);
            new WorldGenMinable(GCProperties.blockGemOreID, 1, 8, Block.stone.blockID).generate(world, random, x, y, z);
        }

        if (GCProperties.generateSapphire)
        for (gen = 0; gen < GCProperties.sapphireVeinCount; gen++)
        {
            x = chunkX + random.nextInt(16);
            y = random.nextInt(GCProperties.sapphireOreHeight);
            z = chunkZ + random.nextInt(16);
            new WorldGenMinable(GCProperties.blockGemOreID, 2, 8, Block.stone.blockID).generate(world, random, x, y, z);
        }

        if (GCProperties.generateEmerald)
        for (gen = 0; gen < GCProperties.emeraldVeinCount; gen++)
        {
            x = chunkX + random.nextInt(16);
            y = random.nextInt(GCProperties.emeraldOreHeight);
            z = chunkZ + random.nextInt(16);
            new WorldGenMinable(GCProperties.blockGemOreID, 3, 8, Block.stone.blockID).generate(world, random, x, y, z);
        }
        
        if (GCProperties.generateTopaz)
        for (gen = 0; gen < GCProperties.topazVeinCount; gen++)
        {
            x = chunkX + random.nextInt(16);
            y = random.nextInt(GCProperties.topazOreHeight);
            z = chunkZ + random.nextInt(16);
            new WorldGenMinable(GCProperties.blockGemOreID, 4, 8, Block.stone.blockID).generate(world, random, x, y, z);
        }

        if (GCProperties.generatePyrite)
        for (gen = 0; gen < GCProperties.pyriteVeinCount; gen++)
        {
            x = chunkX + random.nextInt(16);
            y = random.nextInt(GCProperties.pyriteOreHeight);
            z = chunkZ + random.nextInt(16);
            new WorldGenMinable(GCProperties.blockGemOreID, 5, 4, Block.stone.blockID).generate(world, random, x, y, z);
        }
    }

    public void genNether(World world, Random random, int chunkX, int chunkZ)
    {
        int gen, x, y, z;
    	
        if (GCProperties.generateBlackDiamond)
        for (gen = 0; gen < GCProperties.bdVeinCount; gen++)
        {
            x = chunkX + random.nextInt(16);
            y = random.nextInt(GCProperties.bdOreHeight);
            z = chunkZ + random.nextInt(16);
            new WorldGenMinable(GCProperties.blockGemOreID, 6, 4, Block.netherrack.blockID).generate(world, random, x, y, z);
        }
    }

    public void genEnd(World world, Random random, int chunkX, int chunkZ)
    {
    }
    
    public void genOther(World world, Random random, int chunkX, int chunkZ)
    {
        if (world.provider.dimensionId != 0 && GCProperties.generateInOtherDimensions)
        {
            genSurface(world, random, chunkX * 16, chunkZ * 16);
            genNether(world, random, chunkX * 16, chunkZ * 16);
        }
    }
}