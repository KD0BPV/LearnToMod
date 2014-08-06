package name.kd0bpv.learntomod.creativetab;

import name.kd0bpv.learntomod.init.ModItems;
import name.kd0bpv.learntomod.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModCreativeTab
{
	public static final CreativeTabs LTM_TAB = new CreativeTabs(Reference.MOD_ID)
	{
		@Override
		public Item getTabIconItem()
		{
			return ModItems.mapleLeaf;
		}
	};
}
