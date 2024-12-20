
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aaemobs.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.aaemobs.AaeMobsMod;

public class AaeMobsModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, AaeMobsMod.MODID);
	public static final RegistryObject<SoundEvent> SUMMON = REGISTRY.register("summon", () -> new SoundEvent(new ResourceLocation("aae_mobs", "summon")));
}
