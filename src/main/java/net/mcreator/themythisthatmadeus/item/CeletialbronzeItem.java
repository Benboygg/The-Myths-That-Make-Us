
package net.mcreator.themythisthatmadeus.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class CeletialbronzeItem extends Item {
	public CeletialbronzeItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("celetialbronze");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
