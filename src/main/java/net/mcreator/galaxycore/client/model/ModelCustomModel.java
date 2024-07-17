package net.mcreator.galaxycore.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelCustomModel<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("galaxy_core", "model_custom_model"), "main");
	public final ModelPart Personaje;
	public final ModelPart Cuerpo;
	public final ModelPart Cabeza;
	public final ModelPart Torzo;
	public final ModelPart bone;
	public final ModelPart Brazoizquierdo;
	public final ModelPart Brazodebajo;
	public final ModelPart Brazoderecho;
	public final ModelPart brazodebajode;
	public final ModelPart Piernaderecha;
	public final ModelPart Debajo;
	public final ModelPart Piernaizquierda;
	public final ModelPart zapatos;

	public ModelCustomModel(ModelPart root) {
		this.Personaje = root.getChild("Personaje");
		this.Cuerpo = root.getChild("Cuerpo");
		this.Cabeza = root.getChild("Cabeza");
		this.Torzo = root.getChild("Torzo");
		this.bone = root.getChild("bone");
		this.Brazoizquierdo = root.getChild("Brazoizquierdo");
		this.Brazodebajo = root.getChild("Brazodebajo");
		this.Brazoderecho = root.getChild("Brazoderecho");
		this.brazodebajode = root.getChild("brazodebajode");
		this.Piernaderecha = root.getChild("Piernaderecha");
		this.Debajo = root.getChild("Debajo");
		this.Piernaizquierda = root.getChild("Piernaizquierda");
		this.zapatos = root.getChild("zapatos");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Personaje = partdefinition.addOrReplaceChild("Personaje", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition Cuerpo = Personaje.addOrReplaceChild("Cuerpo", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Cabeza = Cuerpo.addOrReplaceChild("Cabeza",
				CubeListBuilder.create().texOffs(26, 13).addBox(-10.0F, -9.0F, 1.0F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-12.0F, -14.0F, -1.0F, 9.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 22)
						.addBox(-11.5F, -14.5F, -0.5F, 8.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 13).addBox(-12.0F, -7.0F, -1.0F, 9.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 30)
						.addBox(-12.0F, -9.0F, -1.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(26, 5).addBox(-5.0F, -9.0F, -1.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(7.0F, -3.0F, -1.0F));
		PartDefinition Torzo = Cuerpo.addOrReplaceChild("Torzo", CubeListBuilder.create(), PartPose.offset(0.0F, -6.4F, 0.0F));
		PartDefinition bone = Torzo.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(24, 24).addBox(-3.5F, 0.0F, -3.0F, 7.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.5F, -2.0F, 2.0F));
		PartDefinition Brazoizquierdo = bone.addOrReplaceChild("Brazoizquierdo", CubeListBuilder.create().texOffs(26, 4).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(4.75F, 1.4F, 0.0F));
		PartDefinition Brazodebajo = Brazoizquierdo.addOrReplaceChild("Brazodebajo", CubeListBuilder.create().texOffs(0, 17).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 3.0F, 0.0F));
		PartDefinition Brazoderecho = bone.addOrReplaceChild("Brazoderecho", CubeListBuilder.create().texOffs(0, 13).addBox(-1.0F, 1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.65F, 1.4F, 0.0F));
		PartDefinition brazodebajode = Brazoderecho.addOrReplaceChild("brazodebajode", CubeListBuilder.create().texOffs(0, 4).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.0F, 0.0F));
		PartDefinition Piernaderecha = bone.addOrReplaceChild("Piernaderecha", CubeListBuilder.create().texOffs(0, 0).addBox(0.75F, -3.25F, 1.1F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.7F, 8.4F, -2.0F));
		PartDefinition Debajo = Piernaderecha.addOrReplaceChild("Debajo", CubeListBuilder.create().texOffs(26, 0).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(1.75F, -1.25F, 0.1F));
		PartDefinition Piernaizquierda = bone.addOrReplaceChild("Piernaizquierda", CubeListBuilder.create().texOffs(0, 30).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.25F, 6.15F, 0.8F));
		PartDefinition zapatos = Piernaizquierda.addOrReplaceChild("zapatos", CubeListBuilder.create().texOffs(12, 30).addBox(-1.0F, 0.25F, -1.75F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.75F, -0.25F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Personaje.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
