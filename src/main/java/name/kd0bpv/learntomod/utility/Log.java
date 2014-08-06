package name.kd0bpv.learntomod.utility;

import cpw.mods.fml.common.FMLLog;
import name.kd0bpv.learntomod.reference.Reference;
import org.apache.logging.log4j.Level;

public class Log
{
	public static void entry(Level level, Object object)
	{
		FMLLog.log(Reference.MOD_NAME, level, String.valueOf(object));
	}

	public static void all(Object object)
	{
		entry(Level.ALL, object);
	}

	public static void debug(Object object)
	{
		entry(Level.DEBUG, object);
	}

	public static void error(Object object)
	{
		entry(Level.ERROR, object);
	}

	public static void fatal(Object object)
	{
		entry(Level.FATAL, object);
	}

	public static void info(Object object)
	{
		entry(Level.INFO, object);
	}

	public static void off(Object object)
	{
		entry(Level.OFF, object);
	}

	public static void trace(Object object)
	{
		entry(Level.TRACE, object);
	}

	public static void warn(Object object)
	{
		entry(Level.WARN, object);
	}
}
