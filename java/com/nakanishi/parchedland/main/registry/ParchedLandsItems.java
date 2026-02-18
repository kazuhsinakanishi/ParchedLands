package com.nakanishi.parchedland.registry;

import com.nakanishi.parchedland.main.ParchedLands;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ParchedLandsItems {

    public static final DeferredRegister<Item> MOD_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ParchedLands.MOD_ID);

    public static final RegistryObject<Item> PARCHED_APPLE = MOD_ITEMS.register("parched_apple", ()-> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){MOD_ITEMS.register(eventBus);}

}