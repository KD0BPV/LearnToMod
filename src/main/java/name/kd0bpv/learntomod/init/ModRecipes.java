package name.kd0bpv.learntomod.init;

import cpw.mods.fml.common.registry.GameRegistry;
import name.kd0bpv.learntomod.init.ModItems;
import name.kd0bpv.learntomod.init.ModBlocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class ModRecipes
{
	public static void init()
	{
		GameRegistry.addRecipe(new ShapedOreRecipe(
				new ItemStack(ModItems.mapleLeaf, 4),	// Result
				"s s", " s ", " s ",					// Shape
				's', "stickWood"						// Define tokens...
		));
		GameRegistry.addRecipe(new ShapedOreRecipe(
				new ItemStack(ModBlocks.flag),
				"sff", "sff", "s  ",
				's', "stickWood",
				'f', ModItems.mapleLeaf
		));
	}
}
