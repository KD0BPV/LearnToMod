package name.kd0bpv.learntomod.client.gui;

import cpw.mods.fml.client.config.GuiConfig;
import name.kd0bpv.learntomod.handler.Config;
import name.kd0bpv.learntomod.reference.Reference;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

public class ModGuiConfig extends GuiConfig
{
	public ModGuiConfig(GuiScreen guiScreen)
	{
		super(guiScreen,
				new ConfigElement(Config.cfg.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
				Reference.MOD_ID,
				false,
				false,
				Reference.MOD_NAME + " Configuration"
		);
	}
}
