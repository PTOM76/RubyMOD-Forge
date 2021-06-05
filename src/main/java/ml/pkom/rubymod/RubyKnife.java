package ml.pkom.rubymod;

import net.minecraft.item.ItemSword;

public class RubyKnife extends ItemSword {

    public RubyKnife(ToolMaterial material) {
        super(material);
        this
                .setRegistryName(RubyMod.MOD_ID, "ruby_knife")
                .setCreativeTab(RubyMod.RUBY_TAB)
                .setUnlocalizedName("ruby_knife")
                .setMaxStackSize(1)
                .setMaxDamage(1000)
                ;
    }

}
