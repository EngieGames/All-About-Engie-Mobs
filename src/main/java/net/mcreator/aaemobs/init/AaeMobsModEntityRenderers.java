
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aaemobs.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.aaemobs.client.renderer.PunisherRenderer;
import net.mcreator.aaemobs.client.renderer.MadEngieRenderer;
import net.mcreator.aaemobs.client.renderer.HelperRenderer;
import net.mcreator.aaemobs.client.renderer.EnragedEngieRenderer;
import net.mcreator.aaemobs.client.renderer.EngieRenderer;
import net.mcreator.aaemobs.client.renderer.EngieGamesHimselfRenderer;
import net.mcreator.aaemobs.client.renderer.Engie2Renderer;
import net.mcreator.aaemobs.client.renderer.CreatorRenderer;
import net.mcreator.aaemobs.client.renderer.AngryEngieRenderer;
import net.mcreator.aaemobs.client.renderer.AngryCreatorRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AaeMobsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(AaeMobsModEntities.MAD_ENGIE.get(), MadEngieRenderer::new);
		event.registerEntityRenderer(AaeMobsModEntities.ENGIE.get(), EngieRenderer::new);
		event.registerEntityRenderer(AaeMobsModEntities.ANGRY_ENGIE.get(), AngryEngieRenderer::new);
		event.registerEntityRenderer(AaeMobsModEntities.CREATOR.get(), CreatorRenderer::new);
		event.registerEntityRenderer(AaeMobsModEntities.ANGRY_CREATOR.get(), AngryCreatorRenderer::new);
		event.registerEntityRenderer(AaeMobsModEntities.ENGIE_2.get(), Engie2Renderer::new);
		event.registerEntityRenderer(AaeMobsModEntities.PUNISHER.get(), PunisherRenderer::new);
		event.registerEntityRenderer(AaeMobsModEntities.HELPER.get(), HelperRenderer::new);
		event.registerEntityRenderer(AaeMobsModEntities.ENGIE_GAMES_HIMSELF.get(), EngieGamesHimselfRenderer::new);
		event.registerEntityRenderer(AaeMobsModEntities.ENRAGED_ENGIE.get(), EnragedEngieRenderer::new);
	}
}
