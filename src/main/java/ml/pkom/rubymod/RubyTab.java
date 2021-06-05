package ml.pkom.rubymod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class RubyTab extends CreativeTabs {

    public RubyTab(String label) {
        super(getNextID(), label);
    }

    @Override
    public ItemStack getTabIconItem() {
        return RubyMod.itemStack(RubyMod.RUBY_ITEM);
    }
}
