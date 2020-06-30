package two.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.util.DamageSource;

public class BackfireCurseEnchantment extends Enchantment {
	public BackfireCurseEnchantment(Rarity rarityIn, EquipmentSlotType... slots) {
		super(rarityIn, EnchantmentType.WEAPON, slots);
	}
	
	@Override
	public void onEntityDamaged(LivingEntity user, Entity target, int level) {
		if(EnchantmentHelper.getEnchantmentLevel(EnchantmentsTwo.BACKFIRE_CURSE, user.getActiveItemStack()) > 0) {
			user.attackEntityFrom(DamageSource.MAGIC, level);
		}
	}
	@Override
	public boolean isCurse() {
		return true;
	}
}