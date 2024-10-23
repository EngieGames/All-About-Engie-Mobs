
package net.mcreator.aaemobs.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.aaemobs.entity.EngieGamesHimselfEntity;
import net.mcreator.aaemobs.client.model.ModelEngieGames;

public class EngieGamesHimselfRenderer extends MobRenderer<EngieGamesHimselfEntity, ModelEngieGames<EngieGamesHimselfEntity>> {
	public EngieGamesHimselfRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelEngieGames(context.bakeLayer(ModelEngieGames.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EngieGamesHimselfEntity entity) {
		return new ResourceLocation("aae_mobs:textures/entities/engiegames.png");
	}
}
