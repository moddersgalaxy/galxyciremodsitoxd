
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.galaxycore.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.galaxycore.GalaxyCoreMod;

public class GalaxyCoreModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, GalaxyCoreMod.MODID);
	public static final RegistryObject<SoundEvent> MCCACO = REGISTRY.register("mccaco", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("galaxy_core", "mccaco")));
	public static final RegistryObject<SoundEvent> FELIZ = REGISTRY.register("feliz", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("galaxy_core", "feliz")));
	public static final RegistryObject<SoundEvent> SOUND = REGISTRY.register("sound", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("galaxy_core", "sound")));
}
