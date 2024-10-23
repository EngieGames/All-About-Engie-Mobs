
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aaemobs.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.aaemobs.client.model.Modelenraged_newH;
import net.mcreator.aaemobs.client.model.Modelenraged_new;
import net.mcreator.aaemobs.client.model.Modeldistorted;
import net.mcreator.aaemobs.client.model.Modelangry_newH;
import net.mcreator.aaemobs.client.model.Modelangry_new;
import net.mcreator.aaemobs.client.model.ModelEngieGames;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class AaeMobsModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelEngieGames.LAYER_LOCATION, ModelEngieGames::createBodyLayer);
		event.registerLayerDefinition(Modeldistorted.LAYER_LOCATION, Modeldistorted::createBodyLayer);
		event.registerLayerDefinition(Modelenraged_new.LAYER_LOCATION, Modelenraged_new::createBodyLayer);
		event.registerLayerDefinition(Modelangry_new.LAYER_LOCATION, Modelangry_new::createBodyLayer);
		event.registerLayerDefinition(Modelangry_newH.LAYER_LOCATION, Modelangry_newH::createBodyLayer);
		event.registerLayerDefinition(Modelenraged_newH.LAYER_LOCATION, Modelenraged_newH::createBodyLayer);
	}
}
