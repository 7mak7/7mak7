
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.makmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.makmod.item.CrucifixItem;
import net.mcreator.makmod.MakModMod;

public class MakModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MakModMod.MODID);
	public static final RegistryObject<Item> CRUCIFIX_SIGIL_SPAWN_EGG = REGISTRY.register("crucifix_sigil_spawn_egg", () -> new ForgeSpawnEggItem(MakModModEntities.CRUCIFIX_SIGIL, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> CRUCIFIX = REGISTRY.register("crucifix", () -> new CrucifixItem());
	// Start of user code block custom items
	// End of user code block custom items
}