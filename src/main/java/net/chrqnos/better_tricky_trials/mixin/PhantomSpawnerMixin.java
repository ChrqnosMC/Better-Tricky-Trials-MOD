
package net.chrqnos.better_tricky_trials.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import net.chrqnos.better_tricky_trials.effect.CustomEffects;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.level.levelgen.PhantomSpawner;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import java.util.List;

@Mixin(PhantomSpawner.class)
public class PhantomSpawnerMixin {

    @ModifyExpressionValue(
            method = "tick",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/server/level/ServerLevel;players()Ljava/util/List;"
            )
    )
    private List<ServerPlayer> filterOutPlayersWithEffect(
            List<ServerPlayer> original) {
        return original.stream()
                .filter(player -> !player.hasEffect(CustomEffects.DREAMING))
                .toList();
    }
}
