package name.kd0bpv.learntomod.init;

import cpw.mods.fml.common.registry.GameRegistry;
import name.kd0bpv.learntomod.block.*;
import name.kd0bpv.learntomod.reference.Name;
import name.kd0bpv.learntomod.reference.Reference;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
	public static final ModBlock rutile = new OreRutile();

	public static void init()
	{
		GameRegistry.registerBlock(rutile, Name.Block.RUTILE.name);
	}
}
