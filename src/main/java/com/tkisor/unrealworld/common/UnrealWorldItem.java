package com.tkisor.unrealworld.common;

import net.minecraft.world.item.Item;

public class UnrealWorldItem extends Item {
    public UnrealWorldItem() {
        super(new Item.Properties().tab(UnrealWorldTab.TAB_UNREALWORLD));
    }

    public UnrealWorldItem(Properties pProperties) {
        super(pProperties);
    }
}
