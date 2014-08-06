package name.kd0bpv.learntomod.init;

import cpw.mods.fml.common.registry.GameRegistry;
import name.kd0bpv.learntomod.item.*;
import name.kd0bpv.learntomod.reference.Reference;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
	public static final ModItem mapleLeaf = new ItemMapleLeaf();

	public static void init()
	{
		GameRegistry.registerItem(mapleLeaf, mapleLeaf.getBaseName());
	}
}
