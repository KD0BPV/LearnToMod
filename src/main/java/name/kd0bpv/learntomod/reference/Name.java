package name.kd0bpv.learntomod.reference;

public class Name
{
	public static enum Block
	{
		RUTILE("rutile", "oreRutile"),
		FLAG("flag", null);

		public final String name;
		public final String oreName;

		private Block(String name, String oreName)
		{
			this.name = name;
			this.oreName = oreName;
		}
	}

	public static enum Item
	{
		TITANIUM_PICKAXE("pickaxeTitanium", null),
		TITANIUM_SWORD("swordTitanium", null),
		TITANIUM_INGOT("ingotTitanium", "ingotTitanium"),
		TITANIUM_DUST("dustTitanium", "dustTitanium"),
		MAPLE_LEAF("mapleLeaf", null);

		public final String name;
		public final String oreName;

		private Item(String name, String oreName)
		{
			this.name = name;
			this.oreName = oreName;
		}
	}

	public static enum Material
	{
		TITANIUM("titanium");

		public final String name;

		private Material(String name)
		{
			this.name = name;
		}
	}
}
