
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.galaxycore.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.galaxycore.block.SexyXDBlock;
import net.mcreator.galaxycore.block.PruebaaBlock;
import net.mcreator.galaxycore.block.GalaxyPopTroesitoBlock;
import net.mcreator.galaxycore.block.GalaxyPopNadienBlock;
import net.mcreator.galaxycore.block.FunkitoTroesitoBlock;
import net.mcreator.galaxycore.block.FunkitoNadienBlock;
import net.mcreator.galaxycore.block.BloqueBlock;
import net.mcreator.galaxycore.GalaxyCoreMod;

public class GalaxyCoreModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, GalaxyCoreMod.MODID);
	public static final RegistryObject<Block> SEXY_XD = REGISTRY.register("sexy_xd", () -> new SexyXDBlock());
	public static final RegistryObject<Block> PRUEBAA = REGISTRY.register("pruebaa", () -> new PruebaaBlock());
	public static final RegistryObject<Block> BLOQUE = REGISTRY.register("bloque", () -> new BloqueBlock());
	public static final RegistryObject<Block> GALAXY_POP_NADIEN = REGISTRY.register("galaxy_pop_nadien", () -> new GalaxyPopNadienBlock());
	public static final RegistryObject<Block> FUNKITO_NADIEN = REGISTRY.register("funkito_nadien", () -> new FunkitoNadienBlock());
	public static final RegistryObject<Block> GALAXY_POP_TROESITO = REGISTRY.register("galaxy_pop_troesito", () -> new GalaxyPopTroesitoBlock());
	public static final RegistryObject<Block> FUNKITO_TROESITO = REGISTRY.register("funkito_troesito", () -> new FunkitoTroesitoBlock());
}
