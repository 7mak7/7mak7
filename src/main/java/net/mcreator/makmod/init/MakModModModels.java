
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.makmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.makmod.client.model.ModelRed;
import net.mcreator.makmod.client.model.ModelCrucifixSigil;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class MakModModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelCrucifixSigil.LAYER_LOCATION, ModelCrucifixSigil::createBodyLayer);
		event.registerLayerDefinition(ModelRed.LAYER_LOCATION, ModelRed::createBodyLayer);
	}
}
