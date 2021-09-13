package xyz.tehbrian.noserver;

import org.bukkit.plugin.java.JavaPlugin;

public final class NoServer extends JavaPlugin {

    @Override
    public void onEnable() {
        System.exit(0);
    }

}
