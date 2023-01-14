package com.tkisor.unrealworld;

import net.minecraftforge.common.ForgeConfigSpec;


public class Config {
    public static ForgeConfigSpec COMMON_CONFIG;
    public static ForgeConfigSpec.ConfigValue<String> WEAPONS_TAG;
    public static ForgeConfigSpec.ConfigValue<String> WEAPONS_TAG_2;
    static {
        ForgeConfigSpec.Builder COMMON_BUILDER = new ForgeConfigSpec.Builder();
        COMMON_BUILDER.comment("General settings").push("general");
        WEAPONS_TAG = COMMON_BUILDER.comment("Set the tag that does the damage.").define("weapons tag", "unrealworld:weapons");
        WEAPONS_TAG_2 = COMMON_BUILDER.comment("Set the tag that does the damage.","But 1/3").define("weapons tag 2", "unrealworld:weapons2");
        COMMON_BUILDER.pop();
        COMMON_CONFIG = COMMON_BUILDER.build();


    }
}
