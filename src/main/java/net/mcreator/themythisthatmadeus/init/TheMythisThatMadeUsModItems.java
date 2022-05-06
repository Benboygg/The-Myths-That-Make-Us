
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.themythisthatmadeus.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.themythisthatmadeus.item.ScaleItem;
import net.mcreator.themythisthatmadeus.item.MinaturspearItem;
import net.mcreator.themythisthatmadeus.item.MinaturhornItem;
import net.mcreator.themythisthatmadeus.item.MinaturfurItem;
import net.mcreator.themythisthatmadeus.item.Minatur_armorArmorItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TheMythisThatMadeUsModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item MINATUR = register(
			new SpawnEggItem(TheMythisThatMadeUsModEntities.MINATUR, -1, -10066432, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("minatur_spawn_egg"));
	public static final Item MINATURFUR = register(new MinaturfurItem());
	public static final Item MINATUR_ARMOR_ARMOR_HELMET = register(new Minatur_armorArmorItem.Helmet());
	public static final Item MINATUR_ARMOR_ARMOR_CHESTPLATE = register(new Minatur_armorArmorItem.Chestplate());
	public static final Item MINATUR_ARMOR_ARMOR_LEGGINGS = register(new Minatur_armorArmorItem.Leggings());
	public static final Item MINATUR_ARMOR_ARMOR_BOOTS = register(new Minatur_armorArmorItem.Boots());
	public static final Item MINATURHORN = register(new MinaturhornItem());
	public static final Item MINATURSPEAR = register(new MinaturspearItem());
	public static final Item SCALE = register(new ScaleItem());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
