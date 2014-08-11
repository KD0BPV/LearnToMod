package name.kd0bpv.learntomod.material;

import name.kd0bpv.learntomod.reference.Name;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class Material
{
	public static final class Tool
	{
		public static final Item.ToolMaterial TITANIUM =
				EnumHelper.addToolMaterial(Name.Material.TITANIUM.name,
						Item.ToolMaterial.EMERALD.getHarvestLevel(),
						Item.ToolMaterial.EMERALD.getMaxUses() * 2,
						Item.ToolMaterial.EMERALD.getEfficiencyOnProperMaterial() * 3f,
						Item.ToolMaterial.EMERALD.getDamageVsEntity() * 6f,
						Item.ToolMaterial.GOLD.getEnchantability());
	}

	public static final class Armor
	{

	}
}
