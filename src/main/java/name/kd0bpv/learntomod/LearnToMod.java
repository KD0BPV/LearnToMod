package name.kd0bpv.learntomod;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import name.kd0bpv.learntomod.handler.Config;
import name.kd0bpv.learntomod.init.ModBlocks;
import name.kd0bpv.learntomod.init.ModItems;
import name.kd0bpv.learntomod.init.ModRecipes;
import name.kd0bpv.learntomod.proxy.IProxy;
import name.kd0bpv.learntomod.reference.Reference;
import name.kd0bpv.learntomod.utility.Log;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class LearnToMod
{
    @Mod.Instance(Reference.MOD_ID)
    public static LearnToMod instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
		Log.info("Pre-initializing " + Reference.MOD_FULL_NAME);
		Log.info("Loading config...");
        Config.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new Config());
		Log.info("Registering items...");
		ModItems.init();
		Log.info("Registering blocks...");
		ModBlocks.init();
		Log.info("Pre-initilization Complete.");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
		Log.info(" Entering Initialization phase for " + Reference.MOD_FULL_NAME);
		Log.info("Registering recipes...");
		ModRecipes.init();
		Log.info("Initialization Complete.");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
		Log.info("Entering Post-Initialization Phase for " + Reference.MOD_FULL_NAME);

		Log.info("Post-Initialization Complete.");
    }

}
