package name.kd0bpv.learntomod.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class ModRecipes
{
	public static void init()
	{
		// Shaped recipes
		GameRegistry.addRecipe(new ShapedOreRecipe(
				new ItemStack(ModItems.swordTitanium),
				" t ", " t ", " s ",
				's', "stickWood",
				't', "ingotTitanium"
		));
		GameRegistry.addRecipe(new ShapedOreRecipe(
				new ItemStack(ModItems.pickaxeTitanium),
				"ttt", " s ", " s ",
				's', "stickWood",
				't', "ingotTitanium"
		));
		// Shapeless recipes

		// Smelting recipes
		GameRegistry.addSmelting(ModBlocks.rutile, new ItemStack(ModItems.dustTitanium, 2), 5f);
		GameRegistry.addSmelting(ModItems.dustTitanium, new ItemStack(ModItems.ingotTitanium), 20f);
	}
}
