
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.makmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.makmod.item.ReversalRedItem;
import net.mcreator.makmod.item.GojoEyeItem;
import net.mcreator.makmod.MakModMod;

public class MakModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MakModMod.MODID);
	public static final RegistryObject<Item> REVERSAL_RED = REGISTRY.register("reversal_red", () -> new ReversalRedItem());
	public static final RegistryObject<Item> GOJO_EYE = REGISTRY.register("gojo_eye", () -> new GojoEyeItem());
	// Start of user code block custom items
	// End of user code block custom items
}
