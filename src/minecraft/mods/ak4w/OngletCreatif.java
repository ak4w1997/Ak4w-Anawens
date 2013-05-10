package mods.ak4w;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class OngletCreatif extends CreativeTabs
{
	public OngletCreatif(String par2Str)
	{
		super(par2Str);
	}
	
	@SideOnly(Side.CLIENT)
	public int getTabIconItemIndex()
	{
		return Block.anvil.blockID;
	}
	
	public String getTranslatedTabLabel()
	{
		return "Ak4w Mods";
	}
}