package net.chrqnos.better_tricky_trials.effect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class CustomEffects {
    public static RegistryEntry.Reference<StatusEffect> DREAMING = registerEffect("dreaming", new DreamingEffect(StatusEffectCategory.BENEFICIAL, 15978425));

    public static RegistryEntry.Reference<StatusEffect> registerEffect(String id, StatusEffect statusEffect) {
        return Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(net.chrqnos.better_tricky_trials.BetterTrickyTrials.MOD_ID, id), statusEffect);
    }

    public static void registerStatusEffects() {

    }
}