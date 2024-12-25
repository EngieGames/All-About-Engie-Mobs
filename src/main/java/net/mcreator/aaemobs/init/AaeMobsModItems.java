
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aaemobs.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.aaemobs.item.BloodyGogglesPunisherItem;
import net.mcreator.aaemobs.AaeMobsMod;

public class AaeMobsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AaeMobsMod.MODID);
	public static final RegistryObject<Item> MAD_ENGIE_SPAWN_EGG = REGISTRY.register("mad_engie_spawn_egg", () -> new ForgeSpawnEggItem(AaeMobsModEntities.MAD_ENGIE, -3407872, -154, new Item.Properties().tab(AaeMobsModTabs.TAB_MOBS)));
	public static final RegistryObject<Item> ENGIE_SPAWN_EGG = REGISTRY.register("engie_spawn_egg", () -> new ForgeSpawnEggItem(AaeMobsModEntities.ENGIE, -52429, -154, new Item.Properties().tab(AaeMobsModTabs.TAB_MOBS)));
	public static final RegistryObject<Item> ANGRY_ENGIE_SPAWN_EGG = REGISTRY.register("angry_engie_spawn_egg", () -> new ForgeSpawnEggItem(AaeMobsModEntities.ANGRY_ENGIE, -16777216, -3355444, new Item.Properties().tab(AaeMobsModTabs.TAB_MOBS)));
	public static final RegistryObject<Item> CREATOR_SPAWN_EGG = REGISTRY.register("creator_spawn_egg", () -> new ForgeSpawnEggItem(AaeMobsModEntities.CREATOR, -6723841, -154, new Item.Properties().tab(AaeMobsModTabs.TAB_MOBS)));
	public static final RegistryObject<Item> OUTRAGED_ENGIE_SPAWN_EGG = REGISTRY.register("outraged_engie_spawn_egg",
			() -> new ForgeSpawnEggItem(AaeMobsModEntities.OUTRAGED_ENGIE, -16777216, -9502465, new Item.Properties().tab(AaeMobsModTabs.TAB_MOBS)));
	public static final RegistryObject<Item> ENGIE_2_SPAWN_EGG = REGISTRY.register("engie_2_spawn_egg", () -> new ForgeSpawnEggItem(AaeMobsModEntities.ENGIE_2, -13421773, -3355444, new Item.Properties().tab(AaeMobsModTabs.TAB_MOBS)));
	public static final RegistryObject<Item> PUNISHER_SPAWN_EGG = REGISTRY.register("punisher_spawn_egg", () -> new ForgeSpawnEggItem(AaeMobsModEntities.PUNISHER, -16777216, -6015354, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> HELPER_SPAWN_EGG = REGISTRY.register("helper_spawn_egg", () -> new ForgeSpawnEggItem(AaeMobsModEntities.HELPER, -16777216, -6015354, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> BLOODY_GOGGLES_PUNISHER = REGISTRY.register("bloody_goggles_punisher", () -> new BloodyGogglesPunisherItem());
	public static final RegistryObject<Item> ENGIE_GAMES_HIMSELF_SPAWN_EGG = REGISTRY.register("engie_games_himself_spawn_egg",
			() -> new ForgeSpawnEggItem(AaeMobsModEntities.ENGIE_GAMES_HIMSELF, -10763008, -1194203, new Item.Properties().tab(AaeMobsModTabs.TAB_MOBS)));
	public static final RegistryObject<Item> ENRAGED_ENGIE_SPAWN_EGG = REGISTRY.register("enraged_engie_spawn_egg",
			() -> new ForgeSpawnEggItem(AaeMobsModEntities.ENRAGED_ENGIE, -16777216, -10092544, new Item.Properties().tab(AaeMobsModTabs.TAB_MOBS)));
}
