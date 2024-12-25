
package net.mcreator.aaemobs.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.aaemobs.entity.EngieEntity;
import net.mcreator.aaemobs.client.model.ModelEngie;

public class EngieRenderer extends MobRenderer<EngieEntity, ModelEngie<EngieEntity>> {
	public EngieRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelEngie(context.bakeLayer(ModelEngie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EngieEntity entity) {
		return new ResourceLocation("aae_mobs:textures/entities/engienew.png");
	}
}
