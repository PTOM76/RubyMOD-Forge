package ml.pkom.rubymod;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class RubyBlock extends Block {

    public RubyBlock() {
        super(Material.ROCK, MapColor.RED);
        this
                .setRegistryName(RubyMod.MOD_ID,"ruby_block")
                .setCreativeTab(RubyMod.RUBY_TAB)
                .setLightLevel(1.0F)
                .setHardness(3.0F)
                .setResistance(15.0F)
                .setUnlocalizedName("ruby_block");
    }
}
