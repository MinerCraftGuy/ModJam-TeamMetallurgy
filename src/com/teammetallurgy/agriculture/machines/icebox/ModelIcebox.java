package com.teammetallurgy.agriculture.machines.icebox;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelIcebox extends ModelBase
{
	// fields
	ModelRenderer ovenbase;
	ModelRenderer countertop;

	public ModelIcebox()
	{
		textureWidth = 128;
		textureHeight = 64;

		ovenbase = new ModelRenderer(this, 0, 36);
		ovenbase.addBox(-8F, -8F, -8F, 16, 12, 16);
		ovenbase.setRotationPoint(0F, 20F, 0F);
		ovenbase.setTextureSize(128, 64);
		ovenbase.mirror = true;
		setRotation(ovenbase, 0F, 0F, 0F);
		countertop = new ModelRenderer(this, 0, 12);
		countertop.addBox(-8F, -4F, -15F, 16, 4, 16);
		countertop.setRotationPoint(0F, 12F, 7F);
		countertop.setTextureSize(128, 64);
		countertop.mirror = true;
		//setRotation(countertop, -1.570796F, 0F, 0F);
	}
	
	public void renderAll()
	{
		ovenbase.render(1/16f);
		countertop.render(1/16f);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		ovenbase.render(f5);
		countertop.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

}