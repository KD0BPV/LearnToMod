package name.kd0bpv.learntomod.init;

import cpw.mods.fml.common.registry.GameRegistry;
import name.kd0bpv.learntomod.block.*;
import name.kd0bpv.learntomod.reference.Reference;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
	public static final ModBlock flag = new BlockFlag();

	public static void init()
	{
		GameRegistry.registerBlock(flag, flag.getBaseName());
	}
}
