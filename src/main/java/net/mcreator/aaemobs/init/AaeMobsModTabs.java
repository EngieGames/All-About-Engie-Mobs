
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aaemobs.init;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class AaeMobsModTabs {
	public static CreativeModeTab TAB_MOBS;

	public static void load() {
		TAB_MOBS = new CreativeModeTab("tabmobs") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.SPAWNER);
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
