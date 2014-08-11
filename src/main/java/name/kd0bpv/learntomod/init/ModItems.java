package name.kd0bpv.learntomod.init;

import cpw.mods.fml.common.registry.GameRegistry;
import name.kd0bpv.learntomod.item.*;
import name.kd0bpv.learntomod.reference.Name;
import name.kd0bpv.learntomod.reference.Reference;
import net.minecraftforge.oredict.OreDictionary;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
	public static final ModItemPickaxe pickaxeTitanium = new PickaxeTitanium();
	public static final ModItemSword swordTitanium = new SwordTitanium();
	public static final ModItem ingotTitanium = new IngotTitanium();
	public static final ModItem dustTitanium = new DustTitanium();

	public static void init()
	{
		// Register Items
		GameRegistry.registerItem(pickaxeTitanium, Name.Item.TITANIUM_PICKAXE.name);
		GameRegistry.registerItem(swordTitanium, Name.Item.TITANIUM_SWORD.name);
		GameRegistry.registerItem(ingotTitanium, Name.Item.TITANIUM_INGOT.name);
		GameRegistry.registerItem(dustTitanium, Name.Item.TITANIUM_DUST.name);

		// Register Ore Dictionary names
		OreDictionary.registerOre(Name.Item.TITANIUM_INGOT.oreName, ingotTitanium);
		OreDictionary.registerOre(Name.Item.TITANIUM_DUST.oreName, dustTitanium);
	}
}
