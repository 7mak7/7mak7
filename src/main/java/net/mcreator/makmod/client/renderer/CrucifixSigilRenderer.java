
package net.mcreator.makmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.makmod.entity.CrucifixSigilEntity;
import net.mcreator.makmod.client.model.ModelCrucifixSigil;

public class CrucifixSigilRenderer extends MobRenderer<CrucifixSigilEntity, ModelCrucifixSigil<CrucifixSigilEntity>> {
	public CrucifixSigilRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelCrucifixSigil(context.bakeLayer(ModelCrucifixSigil.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CrucifixSigilEntity entity) {
		return new ResourceLocation("mak_mod:textures/entities/sigiltexture.png");
	}
}
