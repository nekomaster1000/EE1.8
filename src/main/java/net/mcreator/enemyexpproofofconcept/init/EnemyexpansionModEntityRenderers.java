
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.enemyexpproofofconcept.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.enemyexpproofofconcept.client.renderer.ZobgoblinRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.ZadybugRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.WaspRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.TarantulaRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.SprinterRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.SpectreRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.SluggerRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.SeniorRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.ScorpionRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.RancherRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.PheromoneSummonRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.MeatureRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.MeatmanzombieRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.LadybugRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.HuntsmanskeletonRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.GoblinRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.GoblinFearRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.GhoulRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.GallantRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.GabbleRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.FrigidRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.ErrantRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.EquestrianRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.CinderRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.CeilingTarantulaRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.CasterRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.CakeroverRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.BouncerRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.BakerRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class EnemyexpansionModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(EnemyexpansionModEntities.MEATURE.get(), MeatureRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.TARANTULA.get(), TarantulaRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.SCORPION.get(), ScorpionRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.MEATMANZOMBIE.get(), MeatmanzombieRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.HUNTSMANSKELETON.get(), HuntsmanskeletonRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.WASP.get(), WaspRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.PHEROMONE_SUMMON.get(), PheromoneSummonRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.CEILING_TARANTULA.get(), CeilingTarantulaRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.SPRINTER.get(), SprinterRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.SLUGGER.get(), SluggerRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.SENIOR.get(), SeniorRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.EQUESTRIAN.get(), EquestrianRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.FRIGID.get(), FrigidRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.LADYBUG.get(), LadybugRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.ZADYBUG.get(), ZadybugRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.SPECTRE.get(), SpectreRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.GHOUL.get(), GhoulRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.CINDER.get(), CinderRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.GALLANT.get(), GallantRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.GOBLIN_FEAR.get(), GoblinFearRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.GOBLIN.get(), GoblinRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.BOUNCER.get(), BouncerRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.RANCHER.get(), RancherRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.BAKER.get(), BakerRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.ERRANT.get(), ErrantRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.CASTER.get(), CasterRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.GABBLE.get(), GabbleRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.ZOBGOBLIN.get(), ZobgoblinRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.CAKEROVER.get(), CakeroverRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.PHEROMONE_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.HUNTSMAN_PUNCH.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.ENEMY_MELEE_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.WASP_STING_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.FRIGID_TOUCH_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.HEALING_GOO.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.GHOUL_SLASH.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.GHOUL_SPIT.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.CINDER_SLICE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.CINDER_FIRE_CHARGE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.GALLANT_SWINGS.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.BOUNCER_KICK_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.SLIMEBALL_THROW.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.CAST_SPELL.get(), ThrownItemRenderer::new);
	}
}
