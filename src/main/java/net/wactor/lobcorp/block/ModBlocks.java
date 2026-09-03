package net.wactor.lobcorp.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.wactor.lobcorp.LobCorp;


public class ModBlocks {


    public static final Block E_BOX_BLOCK = registerBlock("e_box_block",
            new Block(AbstractBlock.Settings.create()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.COPPER)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block CAUTION_STRIPE_BLOCK = registerBlock("caution_stripe_block",
            new Block(AbstractBlock.Settings.create()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.COPPER)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK,Identifier.of(LobCorp.MOD_ID, name),block);
    }

    public static void registerBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(LobCorp.MOD_ID,name),
        new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        LobCorp.LOGGER.info("Registering Mod Blocks for "+ LobCorp.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(entries -> {
            entries.add(ModBlocks.E_BOX_BLOCK);
        });
    }
}
