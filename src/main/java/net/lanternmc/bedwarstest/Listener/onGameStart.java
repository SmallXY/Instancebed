package net.lanternmc.bedwarstest.Listener;

import com.andrei1058.bedwars.api.arena.GameState;
import com.andrei1058.bedwars.api.events.gameplay.GameStateChangeEvent;
import net.lanternmc.bedwarstest.Other;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class onGameStart implements Listener {

    @EventHandler
    public void GameStart(GameStateChangeEvent e) {
        // 开始游戏时
        if (e.getNewState() == GameState.playing) {
//            e.getArena().
        }
    }
}
