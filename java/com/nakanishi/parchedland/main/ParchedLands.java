package com.nakanishi.parchedland.main;

import com.nakanishi.parchedland.registry.ParchedLandsItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@SuppressWarnings("removal")
@Mod(ParchedLands.MOD_ID)
public class ParchedLands {

    public static final String MOD_ID = "parched_lands";

    public ParchedLands(){

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
    }
}