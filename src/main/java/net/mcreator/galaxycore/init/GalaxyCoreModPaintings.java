
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.galaxycore.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

import net.mcreator.galaxycore.GalaxyCoreMod;

public class GalaxyCoreModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, GalaxyCoreMod.MODID);
	public static final RegistryObject<PaintingVariant> SHUERK = REGISTRY.register("shuerk", () -> new PaintingVariant(16, 16));
}
