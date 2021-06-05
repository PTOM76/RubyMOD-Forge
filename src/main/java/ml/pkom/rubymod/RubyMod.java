package ml.pkom.rubymod;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

@Mod(modid = RubyMod.MOD_ID, name = RubyMod.MOD_NAME, version = RubyMod.MOD_VERSION)
public class RubyMod
{
    public static final String MOD_ID = "rubymod";
    public static final String MOD_NAME = "Ruby Mod";
    public static final String MOD_VERSION = "1.0.1";

    public static final CreativeTabs RUBY_TAB = new RubyTab("rubytab");

    public static Item RUBY_ITEM = new RubyItem();
    public static ItemSword RUBY_KNIFE = new RubyKnife(ToolMaterial.IRON);
    public static Block RUBY_BLOCK = new RubyBlock();

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        registerItem(RUBY_ITEM);
        registerItem(RUBY_KNIFE);
        registerBlock(RUBY_BLOCK);
        if(event.getSide().isClient()){
            client();
        }
    }

    public void client(){
        //RUBY_ITEM.getRegistryName();
        setItemModel(RUBY_ITEM, "ruby_item", 0);
        setItemModel(RUBY_KNIFE, "ruby_knife", 0);
        setBlockModel(RUBY_BLOCK, "ruby_block", 0);
    }

    public void registerItem(Item item){
        ForgeRegistries.ITEMS.register(item);
    }

    public void registerBlock(Block block){
        ForgeRegistries.BLOCKS.register(block);
        registerItem(new ItemBlock(block).setRegistryName(block.getRegistryName())); //アイテムブロックをこの関数で自動的に登録
    }

    public void setItemModel(Item item, String name, int metadata){
        ModelLoader.setCustomModelResourceLocation(item, metadata , new ModelResourceLocation(MOD_ID + ":" + name));
    }

    public void setBlockModel(Block block, String name, int metadata){
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), metadata, new ModelResourceLocation(MOD_ID + ":" + name));
    }

    public static ItemStack itemStack(Item item){
        return new ItemStack(item);
    }
}
