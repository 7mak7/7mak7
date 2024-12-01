
package net.mcreator.makmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.makmod.entity.RedEntity;
import net.mcreator.makmod.client.model.ModelRed;

public class RedRenderer extends MobRenderer<RedEntity, ModelRed<RedEntity>> {
	public RedRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelRed(context.bakeLayer(ModelRed.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RedEntity entity) {
		return new ResourceLocation("mak_mod:textures/entities/redtexture.png");
	}
}
