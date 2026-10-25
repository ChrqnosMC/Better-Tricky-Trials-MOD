package net.chrqnos.better_tricky_trials.effect;

import net.chrqnos.better_tricky_trials.BetterTrickyTrials;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;

public class CustomEffects {
    public static final Holder<MobEffect> DREAMING = registerMobEffect("dreaming", new DreamingEffect(MobEffectCategory.BENEFICIAL, 15978425));

    private static Holder<MobEffect> registerMobEffect(String name, MobEffect effect) {
        return Registry.registerForHolder(BuiltInRegistries.MOB_EFFECT, Identifier.fromNamespaceAndPath(BetterTrickyTrials.MOD_ID, name), effect);
    }

    public static void registerEffects() {}
}