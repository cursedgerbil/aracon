package com.gerbiil.aracon;

import com.mojang.logging.LogUtils;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import com.gerbiil.aracon.init.RegistryManager;
import com.gerbiil.aracon.init.CommonSetup;
import com.gerbiil.aracon.init.ClientSetup;


@Mod("aracon")
public class Aracon
{
	
    // Setup the console logger for sending inputs to console/logs
	// Also register Mod ID
    private static final Logger LOGGER = LogUtils.getLogger();
    public static final String MODID = "aracon";

    public Aracon()
    {
    	//Initialise the Registry Manager to register items/blocks/etc.
    	RegistryManager.init();
    	
    	//Get the event bus, then register modloading setup methods
    	IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
    	
    	//Register the COMMON mod setup event (client AND server side)
    	modEventBus.addListener(CommonSetup::init);
    	
    	//Register the CLIENT mod setup event (client side ONLY)
    	DistExecutor.safeRunWhenOn(Dist.CLIENT, () -> () -> modEventBus.addListener(ClientSetup::init));
    }

}
