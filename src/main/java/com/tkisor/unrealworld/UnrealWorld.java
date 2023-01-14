package com.tkisor.unrealworld;

import com.tkisor.unrealworld.common.CreateItems;
import com.tkisor.unrealworld.common.UnrealWorldTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(UnrealWorld.MODID)
public class UnrealWorld {
    public static final String MODID = "unrealworld";

    public UnrealWorld() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.COMMON_CONFIG);

        UnrealWorldTab.load();
        IEventBus modbus = FMLJavaModLoadingContext.get().getModEventBus();
        CreateItems.ITEMS.register(modbus);
    }
}
