package net.wactor.lobcorp.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.wactor.lobcorp.LobCorp;

public class ModItemGroups {
    public static final ItemGroup EGO_WEAPON_GROUP= Registry.register(Registries.ITEM_GROUP, Identifier.of(
    LobCorp.MOD_ID,"ego_weapon_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.Penitence_weapon))
                    .displayName(Text.translatable("itemgroup.lobcorp.ego_weapon_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.Penitence_weapon);

                    })
                    .build());

    public static final ItemGroup EGO_SUIT_GROUP= Registry.register(Registries.ITEM_GROUP, Identifier.of(
                    LobCorp.MOD_ID,"ego_suit_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.Penitence_suit))
                    .displayName(Text.translatable("itemgroup.lobcorp.ego_suit_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.Penitence_suit);

                    })
                    .build());

    public static final ItemGroup EGO_GIFTS_GROUP= Registry.register(Registries.ITEM_GROUP, Identifier.of(
                    LobCorp.MOD_ID,"ego_gift_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.Penitence_gift))
                    .displayName(Text.translatable("itemgroup.lobcorp.ego_gift_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.Penitence_gift);

                    })
                    .build());

    public static void registerItemGroups() {
        LobCorp.LOGGER.info("Registering Item Groups for " + LobCorp.MOD_ID);
    }
}
