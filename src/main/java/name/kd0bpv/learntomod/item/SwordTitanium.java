package name.kd0bpv.learntomod.item;

import name.kd0bpv.learntomod.creativetab.ModCreativeTab;
import name.kd0bpv.learntomod.material.Material;
import name.kd0bpv.learntomod.reference.Name;

public class SwordTitanium extends ModItemSword
{
	public SwordTitanium()
	{
		super(Material.Tool.TITANIUM);
		this.setUnlocalizedName(Name.Item.TITANIUM_SWORD.name);
		this.setCreativeTab(ModCreativeTab.LTM_TAB);
	}
}
