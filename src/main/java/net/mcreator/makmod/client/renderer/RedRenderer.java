package net.mcreator.makmod.client.renderer;

import com.mojang.math.Axis;

public class RedRenderer extends EntityRenderer<RedEntity> {

	private static final ResourceLocation texture = new ResourceLocation("mak_mod:textures/entities/redtexture.png");

	private final ModelRed model;

	public RedRenderer(EntityRendererProvider.Context context) {
		super(context);
		model = new ModelRed(context.bakeLayer(ModelRed.LAYER_LOCATION));
	}

	@Override
	public void render(RedEntity entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn, int packedLightIn) {
		VertexConsumer vb = bufferIn.getBuffer(RenderType.entityCutout(this.getTextureLocation(entityIn)));
		poseStack.pushPose();
		poseStack.mulPose(Axis.YP.rotationDegrees(Mth.lerp(partialTicks, entityIn.yRotO, entityIn.getYRot()) - 90));
		poseStack.mulPose(Axis.ZP.rotationDegrees(90 + Mth.lerp(partialTicks, entityIn.xRotO, entityIn.getXRot())));
		model.renderToBuffer(poseStack, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		poseStack.popPose();

		super.render(entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
	}

	@Override
	public ResourceLocation getTextureLocation(RedEntity entity) {
		return texture;
	}

}
