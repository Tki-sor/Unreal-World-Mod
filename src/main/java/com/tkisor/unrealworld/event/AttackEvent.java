package com.tkisor.unrealworld.event;

import com.tkisor.unrealworld.Config;
import com.tkisor.unrealworld.UnrealWorld;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid= UnrealWorld.MODID)
public class AttackEvent {
    @SubscribeEvent
    public static void onHurt(LivingHurtEvent event) {
        if (event.getSource().getDirectEntity() instanceof Player player) {
            if (!player.isCreative()) {
                final ItemStack handStack = player.getMainHandItem();
                if (!(handStack.is(ItemTags.create(new ResourceLocation(Config.WEAPONS_TAG.get()))))&&!(handStack.is(ItemTags.create(new ResourceLocation(Config.WEAPONS_TAG_2.get()))))) {
                    event.setAmount(0.2f);
                }
                if (handStack.is(ItemTags.create(new ResourceLocation(Config.WEAPONS_TAG.get())))&&!(handStack.is(ItemTags.create(new ResourceLocation(Config.WEAPONS_TAG_2.get()))))) {
                    event.setAmount(event.getAmount());
                }
                if (handStack.is(ItemTags.create(new ResourceLocation(Config.WEAPONS_TAG_2.get())))&&!(handStack.is(ItemTags.create(new ResourceLocation(Config.WEAPONS_TAG.get()))))) {
                    event.setAmount(event.getAmount()/3);
                }
            }
        }
    }
}
