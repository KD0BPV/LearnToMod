package name.kd0bpv.learntomod.block;

import name.kd0bpv.learntomod.creativetab.ModCreativeTab;
import name.kd0bpv.learntomod.reference.Name;
import net.minecraft.item.Item;

public class OreRutile extends ModBlock
{
	public OreRutile()
	{
		super();
		this.setBlockName(Name.Block.RUTILE.name);
		this.setBlockTextureName(Name.Block.RUTILE.name);
		this.setCreativeTab(ModCreativeTab.LTM_TAB);
		this.setHarvestLevel("pickaxe", Item.ToolMaterial.IRON.getHarvestLevel());
		this.setHardness(6f);
	}

}
