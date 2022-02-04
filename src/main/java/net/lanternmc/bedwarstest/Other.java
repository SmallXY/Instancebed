package net.lanternmc.bedwarstest;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import java.util.HashMap;

public class Other {
    public static String pluginname = "§7[§b起床战争副床守护§7]";
    /*
     在开始游戏时加载内容
     格式：红队 - Bukkit Loction
     */
    public static HashMap<String, Location> bedLocals = new HashMap<>();
    /*
    * 格式 玩家 挖掉副床的Int
    *  */
    public static HashMap<Player, Integer> playerdesbed = new HashMap<>();
}
