
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.galaxycore.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.galaxycore.GalaxyCoreMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class GalaxyCoreModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GalaxyCoreMod.MODID);
	public static final RegistryObject<CreativeModeTab> GALAXY_TAB = REGISTRY.register("galaxy_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.galaxy_core.galaxy_tab")).icon(() -> new ItemStack(GalaxyCoreModItems.HUB.get())).displayItems((parameters, tabData) -> {
				tabData.accept(GalaxyCoreModItems.STARLIGHT.get());
				tabData.accept(GalaxyCoreModItems.AMETHYST_STARLIGHT.get());
				tabData.accept(GalaxyCoreModItems.CAJITA_FELIZ.get());
				tabData.accept(GalaxyCoreModItems.MONSTER_ENERGY.get());
				tabData.accept(GalaxyCoreModItems.SANDWICHITO.get());
				tabData.accept(GalaxyCoreModItems.DORITOS.get());
				tabData.accept(GalaxyCoreModItems.GUANTELETE.get());
				tabData.accept(GalaxyCoreModItems.GOLDEN_BLADE.get());
				tabData.accept(GalaxyCoreModItems.HUB_2.get());
				tabData.accept(GalaxyCoreModItems.HUB.get());
				tabData.accept(GalaxyCoreModItems.HUBGREEN.get());
				tabData.accept(GalaxyCoreModItems.HUB_4.get());
				tabData.accept(GalaxyCoreModItems.HUB_1.get());
				tabData.accept(GalaxyCoreModBlocks.SEXY_XD.get().asItem());
				tabData.accept(GalaxyCoreModItems.PANCHITO.get());
				tabData.accept(GalaxyCoreModBlocks.PRUEBAA.get().asItem());
				tabData.accept(GalaxyCoreModItems.COFRECITO.get());
				tabData.accept(GalaxyCoreModBlocks.BLOQUE.get().asItem());
				tabData.accept(GalaxyCoreModItems.KEY_ROJO.get());
				tabData.accept(GalaxyCoreModItems.KEY_AMARILLA.get());
				tabData.accept(GalaxyCoreModItems.KEY_MADERA.get());
				tabData.accept(GalaxyCoreModItems.KEY_ROSA.get());
				tabData.accept(GalaxyCoreModItems.KEY_MORADA.get());
				tabData.accept(GalaxyCoreModItems.KEY_VERDE.get());
				tabData.accept(GalaxyCoreModItems.SKULLPURPLE.get());
				tabData.accept(GalaxyCoreModItems.TREBOL.get());
				tabData.accept(GalaxyCoreModBlocks.FUNKITO_NADIEN.get().asItem());
			}).withSearchBar().build());
	public static final RegistryObject<CreativeModeTab> GALAXY_EXTRA = REGISTRY.register("galaxy_extra",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.galaxy_core.galaxy_extra")).icon(() -> new ItemStack(GalaxyCoreModItems.HUB_1.get())).displayItems((parameters, tabData) -> {
				tabData.accept(GalaxyCoreModItems.CATALIZADOR.get());
				tabData.accept(GalaxyCoreModItems.BRUJULA_MALDITA.get());
				tabData.accept(GalaxyCoreModItems.CALAVERA_OSCURA.get());
				tabData.accept(GalaxyCoreModItems.AGUJERO_NEGRO.get());
				tabData.accept(GalaxyCoreModItems.ALMA_DE_DRAGON.get());
				tabData.accept(GalaxyCoreModItems.ANTI_MATERIA.get());
				tabData.accept(GalaxyCoreModItems.COMBUSTIBLE_RADIACTIVO.get());
				tabData.accept(GalaxyCoreModItems.PATRICIO_ESTRELLA.get());
				tabData.accept(GalaxyCoreModItems.MINI_REACTOR.get());
				tabData.accept(GalaxyCoreModItems.MINI_PORTAL.get());
				tabData.accept(GalaxyCoreModItems.PLANOS.get());
				tabData.accept(GalaxyCoreModItems.PEPITA_DE_MEGA_ESTRELLA.get());
				tabData.accept(GalaxyCoreModItems.TRANSMISOR.get());
				tabData.accept(GalaxyCoreModItems.SEMILLA.get());
				tabData.accept(GalaxyCoreModItems.SUPER_SEMILLA.get());
				tabData.accept(GalaxyCoreModItems.MUNECO_DE_PAJA.get());
				tabData.accept(GalaxyCoreModItems.BUSCADOR_DEL_UNIVERSO.get());
				tabData.accept(GalaxyCoreModItems.MONEDA.get());
				tabData.accept(GalaxyCoreModItems.SUPER_CACA.get());
				tabData.accept(GalaxyCoreModItems.MC_CACO.get());
				tabData.accept(GalaxyCoreModItems.TOKEN.get());
				tabData.accept(GalaxyCoreModItems.COINSILVER.get());
				tabData.accept(GalaxyCoreModItems.COIN_GOLD.get());
				tabData.accept(GalaxyCoreModItems.HEARTBLUE.get());
				tabData.accept(GalaxyCoreModItems.HEARTBROWN.get());
				tabData.accept(GalaxyCoreModItems.HEARTGREEN.get());
				tabData.accept(GalaxyCoreModItems.HEARTGREY.get());
				tabData.accept(GalaxyCoreModItems.HEARTPURPLE.get());
				tabData.accept(GalaxyCoreModItems.HEARTRED.get());
				tabData.accept(GalaxyCoreModItems.HEARTYELLOW.get());
				tabData.accept(GalaxyCoreModItems.FLAMEPURPLE.get());
				tabData.accept(GalaxyCoreModItems.ORBEBLUE.get());
				tabData.accept(GalaxyCoreModItems.ORBEBROWN.get());
				tabData.accept(GalaxyCoreModItems.ORBEGREEN.get());
				tabData.accept(GalaxyCoreModItems.ORBEGREY.get());
				tabData.accept(GalaxyCoreModItems.ORBEPURPLE.get());
				tabData.accept(GalaxyCoreModItems.ORBERED.get());
				tabData.accept(GalaxyCoreModItems.ORBEYELLOW.get());
				tabData.accept(GalaxyCoreModItems.SKULLBLUE.get());
				tabData.accept(GalaxyCoreModItems.SKULLBROWN.get());
				tabData.accept(GalaxyCoreModItems.SKULLGREEN.get());
				tabData.accept(GalaxyCoreModItems.SKULLGREY.get());
				tabData.accept(GalaxyCoreModItems.SKULLYELLOW.get());
				tabData.accept(GalaxyCoreModItems.SKULLRED.get());
				tabData.accept(GalaxyCoreModItems.ABSOLUTE_PLATE.get());
				tabData.accept(GalaxyCoreModItems.CACOTA.get());
				tabData.accept(GalaxyCoreModBlocks.GALAXY_POP_NADIEN.get().asItem());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> GALAXY_ARMAS = REGISTRY.register("galaxy_armas",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.galaxy_core.galaxy_armas")).icon(() -> new ItemStack(GalaxyCoreModItems.HUB_2.get())).displayItems((parameters, tabData) -> {
				tabData.accept(GalaxyCoreModItems.HELLFIRESWORD.get());
				tabData.accept(GalaxyCoreModItems.HELLFIREPICKAXE.get());
				tabData.accept(GalaxyCoreModItems.IRONHEARTSWORD.get());
				tabData.accept(GalaxyCoreModItems.FROZENBLADE.get());
				tabData.accept(GalaxyCoreModItems.KNIGHTSSWORD.get());
				tabData.accept(GalaxyCoreModItems.VOLCANICBLADE.get());
				tabData.accept(GalaxyCoreModItems.BRAVEHEART.get());
				tabData.accept(GalaxyCoreModItems.BRAVEHEARTPICKAXE.get());
				tabData.accept(GalaxyCoreModItems.BRAVEHEARTAXE.get());
				tabData.accept(GalaxyCoreModItems.BRAVEHEARTSWORD.get());
				tabData.accept(GalaxyCoreModItems.VANGUARDSWORD.get());
				tabData.accept(GalaxyCoreModItems.VANGUARDPICKAXE.get());
				tabData.accept(GalaxyCoreModItems.VANGUARDAXE.get());
				tabData.accept(GalaxyCoreModItems.INFINITYSWORDBALANCED.get());
				tabData.accept(GalaxyCoreModItems.INFINITYSWORD_1.get());
				tabData.accept(GalaxyCoreModItems.INFINITY_1PICK.get());
			}).withSearchBar().build());
	public static final RegistryObject<CreativeModeTab> GALAXY_ORES = REGISTRY.register("galaxy_ores",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.galaxy_core.galaxy_ores")).icon(() -> new ItemStack(GalaxyCoreModItems.HUB_4.get())).displayItems((parameters, tabData) -> {
				tabData.accept(GalaxyCoreModItems.LINGOTE_NEUTRAL_TIER_1.get());
				tabData.accept(GalaxyCoreModItems.HIERRO_PULSANTE.get());
				tabData.accept(GalaxyCoreModItems.REDSTONE_ALLOY.get());
				tabData.accept(GalaxyCoreModItems.ENERGETIC_ALLOY.get());
				tabData.accept(GalaxyCoreModItems.VIBRANT_ALLOY.get());
				tabData.accept(GalaxyCoreModItems.SOULARIUM.get());
				tabData.accept(GalaxyCoreModItems.STELLAR_ALLOY.get());
				tabData.accept(GalaxyCoreModItems.HIERRO_CONDUCTOR.get());
				tabData.accept(GalaxyCoreModItems.MELODIC_ALLOY.get());
				tabData.accept(GalaxyCoreModItems.DARK_STEEL.get());
				tabData.accept(GalaxyCoreModItems.END_STEEL_ALLOY.get());
				tabData.accept(GalaxyCoreModItems.ENDERIUM_BASE.get());
				tabData.accept(GalaxyCoreModItems.ELECTRICALSTEEL_INGOT.get());
				tabData.accept(GalaxyCoreModItems.PEPITA_PULSANTE.get());
				tabData.accept(GalaxyCoreModItems.PEPITA_ENERGETICA.get());
				tabData.accept(GalaxyCoreModItems.PEPITA_VIBRANTE.get());
				tabData.accept(GalaxyCoreModItems.PEPITA_DE_ALMAS.get());
				tabData.accept(GalaxyCoreModItems.PEPITA_ESTELAR.get());
				tabData.accept(GalaxyCoreModItems.PEPITA_CONDUCTORA.get());
				tabData.accept(GalaxyCoreModItems.MELODIC_ALLOY_NUGGET.get());
				tabData.accept(GalaxyCoreModItems.DARK_STEEL_NUGGET.get());
				tabData.accept(GalaxyCoreModItems.END_STEEL_NUGGET.get());
				tabData.accept(GalaxyCoreModItems.REDSTONE_ALLOY_NUGGET.get());
				tabData.accept(GalaxyCoreModItems.ELECTRICAL_STEEL_NUGGET.get());
				tabData.accept(GalaxyCoreModItems.VOLCANIC_ORE.get());
				tabData.accept(GalaxyCoreModItems.VANGUARDINGOT.get());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(GalaxyCoreModItems.VOLCANICAXE.get());
			tabData.accept(GalaxyCoreModItems.EPEOLATRY.get());
		}
	}
}
