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

    public static final Block TILE_CONTROL = registerBlock("tile_control",
            new Block(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.STONE)
                    .strength(4,10)));

    public static final Block TILE_INFORMATION = registerBlock("tile_information",
            new Block(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.STONE)
                    .strength(4,10)));

    public static final Block TILE_TRAINING = registerBlock("tile_training",
            new Block(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.STONE)
                    .strength(4,10)));

    public static final Block TILE_SAFETY = registerBlock("tile_safety",
            new Block(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.STONE)
                    .strength(4,10)));

    public static final Block TILE_WHITE = registerBlock("tile_white",
            new Block(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.STONE)
                    .strength(4,10)));

    public static final Block TILE_GRAY = registerBlock("tile_gray",
            new Block(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.STONE)
                    .strength(4,10)));

    public static final Block E_BOX_BLOCK = registerBlock("e_box_block",
            new Block(AbstractBlock.Settings.create()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.COPPER)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block CAUTION_STRIPE_BLOCK = registerBlock("caution_stripe_block",
            new Block(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.COPPER)
                    .strength(4,10)));

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK,Identifier.of(LobCorp.MOD_ID, name),block);
    }

    public static void registerBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(LobCorp.MOD_ID,name),
        new BlockItem(block, new Item.Settings()));
    }
//vanilla item group blocks go here, modded go into ModItemGroups
    public static void registerModBlocks(){
        LobCorp.LOGGER.info("Registering Mod Blocks for "+ LobCorp.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(entries -> {
            entries.add(ModBlocks.E_BOX_BLOCK);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.CAUTION_STRIPE_BLOCK);
            entries.add(ModBlocks.TILE_CONTROL);
            entries.add(ModBlocks.TILE_INFORMATION);
            entries.add(ModBlocks.TILE_TRAINING);
            entries.add(ModBlocks.TILE_SAFETY);
            entries.add(ModBlocks.TILE_WHITE);
            entries.add(ModBlocks.TILE_GRAY);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(entries -> {
            entries.add(ModBlocks.TILE_CONTROL);
            entries.add(ModBlocks.TILE_INFORMATION);
            entries.add(ModBlocks.TILE_TRAINING);
            entries.add(ModBlocks.TILE_SAFETY);
            entries.add(ModBlocks.TILE_WHITE);
            entries.add(ModBlocks.TILE_GRAY);
        });
    }

}
