package com.tkisor.unrealworld.common;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;


public class UnrealWorldTab  {
    public static CreativeModeTab TAB_UNREALWORLD;

    public static void load() {
        TAB_UNREALWORLD = new CreativeModeTab("unreal_world") {
            @Override
            public ItemStack makeIcon() {
                return new ItemStack(CreateItems.ICON.get());
            }
        };
    }
}
