
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aaedimensions.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.aaedimensions.client.renderer.ProtogenRenderer;
import net.mcreator.aaedimensions.client.renderer.BloodyEngiRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AaeDimensionsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(AaeDimensionsModEntities.PROTOGEN.get(), ProtogenRenderer::new);
		event.registerEntityRenderer(AaeDimensionsModEntities.BLOODY_ENGI.get(), BloodyEngiRenderer::new);
	}
}
