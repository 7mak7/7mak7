
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.makmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.makmod.MakModMod;

public class MakModModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MakModMod.MODID);
	public static final RegistryObject<CreativeModeTab> GOJO = REGISTRY.register("gojo",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.mak_mod.gojo")).icon(() -> new ItemStack(MakModModItems.REVERSAL_RED.get())).displayItems((parameters, tabData) -> {
				tabData.accept(MakModModItems.REVERSAL_RED.get());
			})

					.build());
}
