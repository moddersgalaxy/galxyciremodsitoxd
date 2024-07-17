
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.galaxycore.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.galaxycore.client.model.Modelsamuraii;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class GalaxyCoreModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelsamuraii.LAYER_LOCATION, Modelsamuraii::createBodyLayer);
	}
}
