package com.gerbiil.aracon.init;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import com.gerbiil.aracon.Aracon;

public class RegistryManager {
	
	//Create registers for blocks and items
	private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Aracon.MODID);
	private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Aracon.MODID);
	
	//Init event
	public static void init() {
		
	//Get event bus
	IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
	
	//Register blocks and items over bus
	BLOCKS.register(modEventBus);
	ITEMS.register(modEventBus);
	}

}
