
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.makmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.makmod.client.renderer.RedRenderer;
import net.mcreator.makmod.client.renderer.BlueRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MakModModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(MakModModEntities.RED.get(), RedRenderer::new);
		event.registerEntityRenderer(MakModModEntities.BLUE.get(), BlueRenderer::new);
	}
}
