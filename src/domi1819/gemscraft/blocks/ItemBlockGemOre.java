package domi1819.gemscraft.blocks;

import net.minecraft.item.*;

public class ItemBlockGemOre extends ItemBlock
{
    public ItemBlockGemOre(int itemID)
    {
        super(itemID);
        setHasSubtypes(true);
    }

    public int getMetadata(int meta)
    {
        return meta;
    }

    public String getUnlocalizedName(ItemStack itemstack)
    {
        String name = "";

        switch (itemstack.getItemDamage())
        {
            case 0:
            {
                name = "amethyst";
                break;
            }

            case 1:
            {
                name = "ruby";
                break;
            }

            case 2:
            {
                name = "sapphire";
                break;
            }

            case 3:
            {
                name = "emerald";
                break;
            }

            case 4:
            {
                name = "topaz";
                break;
            }

            case 5:
            {
                name = "pyrite";
                break;
            }

            case 6:
            {
                name = "blackdiamond";
                break;
            }

            default:
                name = "amethyst";
        }

        return super.getUnlocalizedName() + "." + name;
    }
}