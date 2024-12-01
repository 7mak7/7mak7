
package net.mcreator.makmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class GojoEyeItem extends Item {
	public GojoEyeItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
