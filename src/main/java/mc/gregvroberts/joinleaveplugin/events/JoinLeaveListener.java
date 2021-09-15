package mc.gregvroberts.joinleaveplugin.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinLeaveListener implements Listener {

    @EventHandler
    public void onLeave(PlayerQuitEvent event) {
        // Get the player who quit
        Player player = event.getPlayer();

        // Send a message to all the players
        event.setQuitMessage(ChatColor.YELLOW + "" + ChatColor.BOLD + player.getDisplayName() + ChatColor.RED + " has left, let's hope they come back.");
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        // Get the player who joined
        Player player = event.getPlayer();

        // if the player has already been on the server at least once before else send a different message
        if (player.hasPlayedBefore()) {
            event.setJoinMessage(ChatColor.GREEN + "Welcome back to the server " + ChatColor.YELLOW + "" + ChatColor.BOLD + player.getDisplayName() + ChatColor.GREEN + "!!! We missed you.");
        } else {
            event.setJoinMessage(ChatColor.BLUE + "" + ChatColor.BOLD + player.getDisplayName() + ", " + ChatColor.BLUE + "Welcome to the best server ever! I hope you like it.");
        }
    }
}
