package ml.pkom.rubymod;

import net.minecraft.item.Item;

public class RubyItem extends Item {
    public RubyItem(){
        super();
        this
                .setRegistryName(RubyMod.MOD_ID, "ruby_item")
                .setCreativeTab(RubyMod.RUBY_TAB)
                .setUnlocalizedName("ruby_item")
                .setMaxStackSize(64);
    }
}
