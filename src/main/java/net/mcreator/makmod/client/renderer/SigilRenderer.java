
package net.mcreator.makmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.makmod.entity.SigilEntity;
import net.mcreator.makmod.client.model.ModelCrucifixSigil;

public class SigilRenderer extends MobRenderer<SigilEntity, ModelCrucifixSigil<SigilEntity>> {
	public SigilRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelCrucifixSigil(context.bakeLayer(ModelCrucifixSigil.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SigilEntity entity) {
		return new ResourceLocation("mak_mod:textures/entities/sigiltexture.png");
	}
}
