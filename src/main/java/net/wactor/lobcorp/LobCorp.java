package net.wactor.lobcorp;

import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;

import net.wactor.lobcorp.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LobCorp implements ModInitializer {
	public static final String MOD_ID = "lobcorp";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItem();
	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}
