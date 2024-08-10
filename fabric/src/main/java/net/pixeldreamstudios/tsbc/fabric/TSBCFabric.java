package net.pixeldreamstudios.tsbc.fabric;

import net.fabricmc.api.ModInitializer;

import net.pixeldreamstudios.tsbc.TSBC;

public final class TSBCFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        TSBC.init();
    }
}
