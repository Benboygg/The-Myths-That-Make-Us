// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelcustom_model<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "custom_model"), "main");
	private final ModelPart legs;
	private final ModelPart body_parts;
	private final ModelPart right_arm;
	private final ModelPart head;
	private final ModelPart horns;
	private final ModelPart left_arm;

	public Modelcustom_model(ModelPart root) {
		this.legs = root.getChild("legs");
		this.body_parts = root.getChild("body_parts");
		this.right_arm = root.getChild("right_arm");
		this.head = root.getChild("head");
		this.horns = root.getChild("horns");
		this.left_arm = root.getChild("left_arm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition legs = partdefinition.addOrReplaceChild("legs",
				CubeListBuilder.create().texOffs(28, 43)
						.addBox(2.0F, -13.0F, -2.0F, 6.0F, 14.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(50, 43)
						.addBox(-7.0F, -13.0F, -2.0F, 6.0F, 13.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body_parts = partdefinition.addOrReplaceChild("body_parts", CubeListBuilder.create()
				.texOffs(0, 28).addBox(-7.0F, -10.0F, -2.0F, 15.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 17.0F, 0.0F));

		PartDefinition abb3_r1 = body_parts.addOrReplaceChild("abb3_r1",
				CubeListBuilder.create().texOffs(66, 29)
						.addBox(-2.0F, 4.0F, -1.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(41, 7)
						.addBox(3.0F, 4.0F, -1.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(45, 43)
						.addBox(3.0F, -1.0F, -1.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(65, 61)
						.addBox(-2.0F, -1.0F, -1.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -14.0F, -5.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition right_nipple_r1 = body_parts.addOrReplaceChild("right_nipple_r1",
				CubeListBuilder.create().texOffs(0, 28)
						.addBox(3.0F, -1.0F, -0.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 31)
						.addBox(-3.0F, -1.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -19.0F, -8.0F, 0.3054F, -0.0436F, 0.0F));

		PartDefinition right_peck_r1 = body_parts.addOrReplaceChild("right_peck_r1",
				CubeListBuilder.create().texOffs(0, 56)
						.addBox(4.0F, -3.0F, -1.0F, 7.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(49, 61)
						.addBox(-4.0F, -3.0F, -1.0F, 7.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -19.0F, -7.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition top_r1 = body_parts
				.addOrReplaceChild("top_r1",
						CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, -18.0F, -4.0F, 15.0F, 17.0F, 11.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -8.0F, 1.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create()
				.texOffs(52, 18).addBox(-6.0F, -4.0F, -4.0F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-7.0F, -4.0F, 0.0F));

		PartDefinition hand_r1 = right_arm.addOrReplaceChild("hand_r1",
				CubeListBuilder.create().texOffs(26, 62).addBox(-3.0F, -2.0F, -2.0F, 3.0F, 5.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 10.0F, -8.0F, 1.7017F, 0.0F, 0.0F));

		PartDefinition arm_2_r1 = right_arm.addOrReplaceChild("arm_2_r1",
				CubeListBuilder.create().texOffs(0, 39).addBox(-3.0F, 2.0F, 2.0F, 5.0F, 8.0F, -4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 5.0F, 0.0F, -0.9163F, 0.0F, 0.0F));

		PartDefinition arm_r1 = right_arm.addOrReplaceChild("arm_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, 8.0F, -3.0F, 5.0F, -8.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 0.0F, 0.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(),
				PartPose.offset(0.0F, 9.0F, 1.0F));

		PartDefinition neck_r1 = head.addOrReplaceChild("neck_r1",
				CubeListBuilder.create().texOffs(36, 31).addBox(-5.0F, -10.0F, -2.0F, 11.0F, 4.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -8.0F, -4.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition head_r1 = head.addOrReplaceChild("head_r1",
				CubeListBuilder.create().texOffs(0, 39).addBox(-3.0F, -16.0F, -6.0F, 7.0F, 10.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -10.0F, 0.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition horns = partdefinition.addOrReplaceChild("horns", CubeListBuilder.create(),
				PartPose.offset(0.0F, 1.0F, -3.0F));

		PartDefinition left_skipe_r1 = horns.addOrReplaceChild("left_skipe_r1",
				CubeListBuilder.create().texOffs(36, 62)
						.addBox(-12.0F, -19.0F, 0.6F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 64)
						.addBox(12.0F, -19.0F, 1.0F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition base_r1 = horns.addOrReplaceChild("base_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-8.7F, 1.0F, 0.0F, 2.0F, 8.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -7.0F, -1.0F, 0.0018F, -0.3051F, 1.5715F));

		PartDefinition horn_2_r1 = horns.addOrReplaceChild("horn_2_r1",
				CubeListBuilder.create().texOffs(16, 56).addBox(-18.0F, -11.0F, 1.2F, 2.0F, 10.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 2.0F, 0.0F, -0.0185F, -0.2483F, 1.5895F));

		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(52, 7)
				.addBox(15.0F, -4.0F, -4.0F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-7.0F, -4.0F, 0.0F));

		PartDefinition hand_r2 = left_arm.addOrReplaceChild("hand_r2",
				CubeListBuilder.create().texOffs(21, 39).addBox(-4.0F, -2.0F, -2.0F, 3.0F, 5.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(20.0F, 10.0F, -8.0F, 1.7017F, 0.0F, 0.0F));

		PartDefinition arm_2_r2 = left_arm.addOrReplaceChild("arm_2_r2",
				CubeListBuilder.create().texOffs(37, 28).addBox(-4.0F, 2.0F, 2.0F, 5.0F, 8.0F, -4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(19.0F, 5.0F, 0.0F, -0.9163F, 0.0F, 0.0F));

		PartDefinition arm_r2 = left_arm.addOrReplaceChild("arm_r2",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, 8.0F, -3.0F, 5.0F, -8.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(19.0F, 0.0F, 0.0F, -0.2182F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		legs.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body_parts.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		horns.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.zRot = headPitch / (180F / (float) Math.PI);
		this.right_arm.zRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.legs.zRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}