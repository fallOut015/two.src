package io.github.fallout015.two.client.renderer.entity.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import io.github.fallout015.two.entity.effect.SigilEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class SigilModel<T extends SigilEntity> extends EntityModel<T> {
	private final ModelRenderer circle;
	
	public SigilModel() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.circle = new ModelRenderer(this, 0, 0);
		this.circle.setRotationPoint(32, 0, 32);
		this.circle.addBox(-32, 0, -32, 64, 0.065f, 64);
	}
	
	@Override
	public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.circle.rotateAngleY = ageInTicks / 20;
//		this.circle.rotateAngleX = ageInTicks / 20;
//		this.circle.rotateAngleZ = ageInTicks / 20;
	}
	@Override
	public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
		matrixStackIn.push();
		matrixStackIn.scale(0.5f, 0.5f, 0.5f);
		this.circle.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn);
		matrixStackIn.pop();
	}
}