
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.makmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.makmod.MakModMod;

public class MakModModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MakModMod.MODID);
	public static final RegistryObject<SoundEvent> CRUCIFIX = REGISTRY.register("crucifix", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("mak_mod", "crucifix")));
}
