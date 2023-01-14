package com.tkisor.unrealworld.common;

import com.tkisor.unrealworld.UnrealWorld;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class CreateItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, UnrealWorld.MODID);
    /**
    * 物品类型：ingot(锭)
    */
    public static final RegistryObject<Item> INPURE_COPPER_INGOT = ITEMS.register("inpure_copper_ingot", UnrealWorldItem::new);

    /**
     * 物品类型：dust(粉)
     */
    public static final RegistryObject<Item> ICON = ITEMS.register("icon", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STONE_DUST = ITEMS.register("stone_dust", UnrealWorldItem::new);
    public static final RegistryObject<Item> INSURE_NITRATE_DUST = ITEMS.register("inpure_nitrate_dust", UnrealWorldItem::new);
    public static final RegistryObject<Item> NORMAL_MINERAL_SALT_DUST = ITEMS.register("normal_mineral_salt_dust", UnrealWorldItem::new);
    public static final RegistryObject<Item> INPURE_MINERAL_SALT_DUST = ITEMS.register("inpure_mineral_salt_dust", UnrealWorldItem::new);
    public static final RegistryObject<Item> INPURE_COPPER_DUST = ITEMS.register("inpure_copper_dust", UnrealWorldItem::new);


}
