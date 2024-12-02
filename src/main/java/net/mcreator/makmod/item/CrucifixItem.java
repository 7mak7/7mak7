
package net.mcreator.makmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.makmod.procedures.CrucifixusedProcedure;

public class CrucifixItem extends Item {
	public CrucifixItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.EPIC));
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		CrucifixusedProcedure.execute(entity.level(), entity, sourceentity);
		return retval;
	}
}
