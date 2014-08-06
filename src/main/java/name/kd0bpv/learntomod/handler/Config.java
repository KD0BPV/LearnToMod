package name.kd0bpv.learntomod.handler;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import name.kd0bpv.learntomod.reference.Reference;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class Config
{
    public static Configuration cfg;
	public static boolean testValue = false;

    public static void init(File cfgFile)
    {
		if (cfg == null)
		{
			cfg = new Configuration(cfgFile);
			loadConfig();

		}
    }

	private static void loadConfig()
	{
		testValue = cfg.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "blah!");
		if(cfg.hasChanged())
		{
			cfg.save();
		}
	}

	@SubscribeEvent
	public void onConfigChange(ConfigChangedEvent.OnConfigChangedEvent event)
	{
		if (event.modID.equalsIgnoreCase(Reference.MOD_ID))
		{
			loadConfig();
		}
	}
}
