
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.enemyexpproofofconcept.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.enemyexpproofofconcept.client.model.meathat;
import net.mcreator.enemyexpproofofconcept.client.model.Modelsteve;
import net.mcreator.enemyexpproofofconcept.client.model.Modelsprinter_zombie;
import net.mcreator.enemyexpproofofconcept.client.model.Modelsenior_zombie;
import net.mcreator.enemyexpproofofconcept.client.model.Modelphantasm;
import net.mcreator.enemyexpproofofconcept.client.model.Modelmeature;
import net.mcreator.enemyexpproofofconcept.client.model.Modelmeatman;
import net.mcreator.enemyexpproofofconcept.client.model.Modelhuntsman;
import net.mcreator.enemyexpproofofconcept.client.model.Modelfrigid_zombie;
import net.mcreator.enemyexpproofofconcept.client.model.Modelequestrian_zombie;
import net.mcreator.enemyexpproofofconcept.client.model.Modelcinderhelmet;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class EnemyexpansionModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(meathat.LAYER_LOCATION, meathat::createBodyLayer);
		event.registerLayerDefinition(Modelphantasm.LAYER_LOCATION, Modelphantasm::createBodyLayer);
		event.registerLayerDefinition(Modelsteve.LAYER_LOCATION, Modelsteve::createBodyLayer);
		event.registerLayerDefinition(Modelsenior_zombie.LAYER_LOCATION, Modelsenior_zombie::createBodyLayer);
		event.registerLayerDefinition(Modelequestrian_zombie.LAYER_LOCATION, Modelequestrian_zombie::createBodyLayer);
		event.registerLayerDefinition(Modelfrigid_zombie.LAYER_LOCATION, Modelfrigid_zombie::createBodyLayer);
		event.registerLayerDefinition(Modelmeature.LAYER_LOCATION, Modelmeature::createBodyLayer);
		event.registerLayerDefinition(Modelsprinter_zombie.LAYER_LOCATION, Modelsprinter_zombie::createBodyLayer);
		event.registerLayerDefinition(Modelcinderhelmet.LAYER_LOCATION, Modelcinderhelmet::createBodyLayer);
		event.registerLayerDefinition(Modelhuntsman.LAYER_LOCATION, Modelhuntsman::createBodyLayer);
		event.registerLayerDefinition(Modelmeatman.LAYER_LOCATION, Modelmeatman::createBodyLayer);
	}
}
