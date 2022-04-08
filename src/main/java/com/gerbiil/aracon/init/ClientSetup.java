package com.gerbiil.aracon.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.api.distmarker.Dist;
import com.gerbiil.aracon.Aracon;

@Mod.EventBusSubscriber(modid = Aracon.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientSetup {
	public static void init(final FMLClientSetupEvent event) {
		
	}
}
