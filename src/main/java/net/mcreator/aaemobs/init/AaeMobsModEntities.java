
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aaemobs.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.aaemobs.entity.PunisherEntity;
import net.mcreator.aaemobs.entity.MadEngieEntity;
import net.mcreator.aaemobs.entity.HelperEntity;
import net.mcreator.aaemobs.entity.EnragedEngieEntity;
import net.mcreator.aaemobs.entity.EngieGamesHimselfEntity;
import net.mcreator.aaemobs.entity.EngieEntity;
import net.mcreator.aaemobs.entity.Engie2Entity;
import net.mcreator.aaemobs.entity.CreatorEntity;
import net.mcreator.aaemobs.entity.AngryEngieEntity;
import net.mcreator.aaemobs.entity.AngryCreatorEntity;
import net.mcreator.aaemobs.AaeMobsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AaeMobsModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, AaeMobsMod.MODID);
	public static final RegistryObject<EntityType<MadEngieEntity>> MAD_ENGIE = register("mad_engie",
			EntityType.Builder.<MadEngieEntity>of(MadEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MadEngieEntity::new)

					.sized(0.6f, 2f));
	public static final RegistryObject<EntityType<EngieEntity>> ENGIE = register("engie",
			EntityType.Builder.<EngieEntity>of(EngieEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EngieEntity::new)

					.sized(0.6f, 2f));
	public static final RegistryObject<EntityType<AngryEngieEntity>> ANGRY_ENGIE = register("angry_engie",
			EntityType.Builder.<AngryEngieEntity>of(AngryEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AngryEngieEntity::new)

					.sized(0.6f, 2f));
	public static final RegistryObject<EntityType<CreatorEntity>> CREATOR = register("creator",
			EntityType.Builder.<CreatorEntity>of(CreatorEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CreatorEntity::new)

					.sized(0.6f, 2f));
	public static final RegistryObject<EntityType<AngryCreatorEntity>> ANGRY_CREATOR = register("angry_creator",
			EntityType.Builder.<AngryCreatorEntity>of(AngryCreatorEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AngryCreatorEntity::new)

					.sized(0.6f, 2f));
	public static final RegistryObject<EntityType<Engie2Entity>> ENGIE_2 = register("engie_2",
			EntityType.Builder.<Engie2Entity>of(Engie2Entity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Engie2Entity::new)

					.sized(0.6f, 2f));
	public static final RegistryObject<EntityType<PunisherEntity>> PUNISHER = register("punisher",
			EntityType.Builder.<PunisherEntity>of(PunisherEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PunisherEntity::new).fireImmune().sized(0.6f, 2f));
	public static final RegistryObject<EntityType<HelperEntity>> HELPER = register("helper",
			EntityType.Builder.<HelperEntity>of(HelperEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HelperEntity::new).fireImmune().sized(0.6f, 2f));
	public static final RegistryObject<EntityType<EngieGamesHimselfEntity>> ENGIE_GAMES_HIMSELF = register("engie_games_himself",
			EntityType.Builder.<EngieGamesHimselfEntity>of(EngieGamesHimselfEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EngieGamesHimselfEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedEngieEntity>> ENRAGED_ENGIE = register("enraged_engie",
			EntityType.Builder.<EnragedEngieEntity>of(EnragedEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedEngieEntity::new)

					.sized(0.6f, 2f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			MadEngieEntity.init();
			EngieEntity.init();
			AngryEngieEntity.init();
			CreatorEntity.init();
			AngryCreatorEntity.init();
			Engie2Entity.init();
			PunisherEntity.init();
			HelperEntity.init();
			EngieGamesHimselfEntity.init();
			EnragedEngieEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(MAD_ENGIE.get(), MadEngieEntity.createAttributes().build());
		event.put(ENGIE.get(), EngieEntity.createAttributes().build());
		event.put(ANGRY_ENGIE.get(), AngryEngieEntity.createAttributes().build());
		event.put(CREATOR.get(), CreatorEntity.createAttributes().build());
		event.put(ANGRY_CREATOR.get(), AngryCreatorEntity.createAttributes().build());
		event.put(ENGIE_2.get(), Engie2Entity.createAttributes().build());
		event.put(PUNISHER.get(), PunisherEntity.createAttributes().build());
		event.put(HELPER.get(), HelperEntity.createAttributes().build());
		event.put(ENGIE_GAMES_HIMSELF.get(), EngieGamesHimselfEntity.createAttributes().build());
		event.put(ENRAGED_ENGIE.get(), EnragedEngieEntity.createAttributes().build());
	}
}
