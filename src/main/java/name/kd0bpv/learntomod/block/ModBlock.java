package name.kd0bpv.learntomod.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import name.kd0bpv.learntomod.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;


public class ModBlock extends Block
{
	public ModBlock(Material material)
	{
		super(material);
	}

	public ModBlock()
	{
		this(Material.rock);
	}

	@Override
	public String getUnlocalizedName()
	{
		return String.format("tile.%s", getName());
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister)
	{
		blockIcon = iconRegister.registerIcon(this.getName());
	}

	public String getName()
	{
		return String.format("%s:%s", Reference.MOD_ID, getBaseName());
	}

	public String getBaseName()
	{
		String name = super.getUnlocalizedName();
		return name.substring(name.indexOf('.') +1);
	}
}
