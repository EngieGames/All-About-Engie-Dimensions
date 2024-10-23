
package net.mcreator.aaedimensions.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.aaedimensions.entity.ProtogenEntity;

public class ProtogenRenderer extends HumanoidMobRenderer<ProtogenEntity, HumanoidModel<ProtogenEntity>> {
	public ProtogenRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
	}

	@Override
	public ResourceLocation getTextureLocation(ProtogenEntity entity) {
		return new ResourceLocation("aae_dimensions:textures/entities/2022_02_10_blue-protogen-with-almost-realistic-scarf-19874125.png");
	}
}
