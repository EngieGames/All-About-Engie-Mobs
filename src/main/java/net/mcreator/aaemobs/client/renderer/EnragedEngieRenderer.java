
package net.mcreator.aaemobs.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.aaemobs.entity.EnragedEngieEntity;
import net.mcreator.aaemobs.client.model.Modelenraged_new;

public class EnragedEngieRenderer extends MobRenderer<EnragedEngieEntity, Modelenraged_new<EnragedEngieEntity>> {
	public EnragedEngieRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelenraged_new(context.bakeLayer(Modelenraged_new.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EnragedEngieEntity entity) {
		return new ResourceLocation("aae_mobs:textures/entities/enragednew.png");
	}
}
