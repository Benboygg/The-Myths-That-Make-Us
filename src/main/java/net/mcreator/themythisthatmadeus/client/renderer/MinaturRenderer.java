package net.mcreator.themythisthatmadeus.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.themythisthatmadeus.entity.MinaturEntity;
import net.mcreator.themythisthatmadeus.client.model.Modelcustom_model;

public class MinaturRenderer extends MobRenderer<MinaturEntity, Modelcustom_model<MinaturEntity>> {
	public MinaturRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MinaturEntity entity) {
		return new ResourceLocation("the_mythis_that_made_us:textures/minatur.png");
	}
}
