package net.chrqnos.better_tricky_trials;

import net.chrqnos.better_tricky_trials.effect.CustomEffects;
import net.fabricmc.api.ModInitializer;

public class BetterTrickyTrials implements ModInitializer {
	public static final String MOD_ID = "better_tricky_trials";

	@Override
	public void onInitialize() {
		CustomEffects.registerStatusEffects();
	}
}