package com.thesledgehammer.retrobees;

import forestry.api.core.Tabs;
import forestry.core.CreativeTabForestry;
import moze_intel.projecte.gameObjs.CreativeTab;
import net.minecraft.creativetab.CreativeTabs;
import org.apache.logging.log4j.Logger;

import com.thesledgehammer.retrobees.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = RetroBees.MOD_ID, name = "RetroBees", version = RetroBees.VERSION, acceptedMinecraftVersions = "[1.12.2]", dependencies = "required-after:forestry;after:projecte;after:techreborn;after:reborncore;")
public class RetroBees {
	
	public static final String MOD_ID = "retrobees";
	public static final String VERSION = "1.0.2";
	public static final String MCVERSION = "1.12.2";
	
	@SidedProxy(clientSide = "com.thesledgehammer.retrobees.proxy.ClientProxy", serverSide = "com.thesledgehammer.retrobees.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	@Mod.Instance("retrobees")
	public static  RetroBees instance;
	
	public static Logger logger;
	public static CreativeTabs creativeTab;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		logger = event.getModLog();
		proxy.preInit(event);
		creativeTab = Tabs.tabAgriculture;
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}
}
