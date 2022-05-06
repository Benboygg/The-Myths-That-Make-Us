
package net.mcreator.themythisthatmadeus.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class MinaturhornItem extends Item {
	public MinaturhornItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(4).rarity(Rarity.RARE));
		setRegistryName("minaturhorn");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
