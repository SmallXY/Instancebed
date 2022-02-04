package net.lanternmc.bedwarstest;

import net.lanternmc.bedwarstest.Utils.FileUtil;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class BedWarsTest extends JavaPlugin {

    public static BedWarsTest getme() {
        return JavaPlugin.getPlugin(BedWarsTest.class);
    }

    public static FileUtil conf;
    public static FileUtil getconf() {
        return conf;
    }
// 第一步 开局放置副床
    public void onEnable() {
        conf = new FileUtil(this);
        if (!Bukkit.getPluginManager().isPluginEnabled("BedWars1058")) {
            getLogger().severe("BedWars1058 not found!");
            setEnabled(false);
            return;
        }
        getLogger().info("qwq");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
