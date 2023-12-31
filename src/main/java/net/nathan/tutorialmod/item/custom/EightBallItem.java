package net.nathan.tutorialmod.item.custom;

import com.mojang.blaze3d.shaders.Effect;
import net.minecraft.client.gui.font.glyphs.BakedGlyph;
import net.minecraft.network.chat.Component;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import java.util.Objects;

public class EightBallItem extends Item {
    public EightBallItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        if(!level.isClientSide() && hand == InteractionHand.MAIN_HAND) {
            int random = (int) ((Math.random() * 32) +1);
            player.addEffect(new MobEffectInstance(Objects.requireNonNull(MobEffect.byId(random)), 400, 1));
            player.getCooldowns().addCooldown(this, 20);
        }

        return super.use(level, player, hand);
    }
}
