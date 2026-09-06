package net.wactor.lobcorp.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.wactor.lobcorp.LobCorp;

public class ModItems {

    public static final Item Tile_powder = registerItem("tile_powder",new Item(new Item.Settings()));
    public static final Item Penitence_weapon = registerItem("penitence_weapon",new Item(new Item.Settings()));
    public static final Item Penitence_suit = registerItem("penitence_suit",new Item(new Item.Settings()));
    public static final Item Penitence_gift = registerItem("penitence_gift",new Item(new Item.Settings()));
    private static Item registerItem(String name,Item item){
        return Registry.register(Registries.ITEM, Identifier.of(LobCorp.MOD_ID,name),item);
    }
    public  static void registerModItem(){
        LobCorp.LOGGER.info("Registering mod items for "+LobCorp.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(Penitence_weapon);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(Tile_powder);
        });

    }
}
