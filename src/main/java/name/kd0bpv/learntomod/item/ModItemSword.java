package name.kd0bpv.learntomod.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import name.kd0bpv.learntomod.reference.Reference;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class ModItemSword extends ItemSword
{
	public ModItemSword(Item.ToolMaterial material)
	{
		super(material);
	}

	@Override
	public String getUnlocalizedName()
	{
		return String.format("item.%s", getName());
	}

	@Override
	public String getUnlocalizedName(ItemStack itemStack)
	{
		return this.getUnlocalizedName();
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister)
	{
		itemIcon = iconRegister.registerIcon(this.getName());
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

	@Override
	public boolean getShareTag()
	{
		return true;
	}

	/*@Override
	public boolean showDurabilityBar(ItemStack itemStack)
	{

	}*/

	/*@Override
	public double getDurabilityForDisplay(ItemStack itemStack)
	{

	}*/
}
