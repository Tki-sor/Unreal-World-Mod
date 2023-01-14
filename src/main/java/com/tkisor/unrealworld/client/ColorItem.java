package com.tkisor.unrealworld.client;

import com.tkisor.unrealworld.common.CreateItems;
import com.tkisor.unrealworld.UnrealWorld;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid=UnrealWorld.MODID, value= Dist.CLIENT, bus=Mod.EventBusSubscriber.Bus.MOD)
public class ColorItem {
    @SubscribeEvent
    public static void coloritem(net.minecraftforge.client.event.ColorHandlerEvent.Item event) {
        event.getItemColors().register((stack, index)-> 0xffd200, CreateItems.INPURE_COPPER_INGOT.get(),CreateItems.INPURE_COPPER_DUST.get());
//        event.getItemColors().register((stack, index)-> 0x, CreateItems..get());
//        event.getItemColors().register((stack, index)-> 0x, CreateItems..get());
//        event.getItemColors().register((stack, index)-> 0x, CreateItems..get());
//        event.getItemColors().register((stack, index)-> 0x, CreateItems..get());

        event.getItemColors().register((stack, index)-> 0xc7c6eb, CreateItems.STONE_DUST.get());
        event.getItemColors().register((stack, index)-> 0xfaf6e8, CreateItems.INSURE_NITRATE_DUST.get());
        event.getItemColors().register((stack, index)-> 0xd8f4f3, CreateItems.NORMAL_MINERAL_SALT_DUST.get());
        event.getItemColors().register((stack, index)-> 0xa9a37d, CreateItems.INPURE_MINERAL_SALT_DUST.get());
//        event.getItemColors().register((stack, index)-> 0x, CreateItems..get());
//        event.getItemColors().register((stack, index)-> 0x, CreateItems..get());
//        event.getItemColors().register((stack, index)-> 0x, CreateItems..get());
//        event.getItemColors().register((stack, index)-> 0x, CreateItems..get());
//        event.getItemColors().register((stack, index)-> 0x, CreateItems..get());
    }

}
