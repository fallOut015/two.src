package io.github.fallout015.two.entity.projectile;

import io.github.fallout015.two.entity.EntityTypeTwo;
import io.github.fallout015.two.item.ItemsTwo;
import io.github.fallout015.two.particles.ParticleTypesTwo;
import io.github.fallout015.two.potion.EffectsTwo;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.network.IPacket;
import net.minecraft.potion.EffectInstance;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;

public class IceArrowEntity extends AbstractArrowEntity {
	public IceArrowEntity(EntityType<? extends IceArrowEntity> entityType, World worldIn) {
		super(entityType, worldIn);
	}
	public IceArrowEntity(World worldIn, double x, double y, double z) {
		super(EntityTypeTwo.ICE_ARROW, x, y, z, worldIn);
	}
	public IceArrowEntity(World worldIn, LivingEntity shooter) {
		super(EntityTypeTwo.ICE_ARROW, shooter, worldIn);
	}
	
	@Override
	protected ItemStack getArrowStack() {
		return new ItemStack(ItemsTwo.ICE_ARROW);
	}
	@Override
	public IPacket<?> createSpawnPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}
	@Override
	public void tick() {
		super.tick();
		if (this.world.isRemote && !this.inGround) {
			this.world.addParticle(ParticleTypesTwo.FROST, this.getPosX(), this.getPosY(), this.getPosZ(), 0.0D, 0.0D, 0.0D);
		}
	}
	@Override
	protected void arrowHit(LivingEntity living) {
		living.addPotionEffect(new EffectInstance(EffectsTwo.FROSTY, 50, 1, false, false));
	}
}