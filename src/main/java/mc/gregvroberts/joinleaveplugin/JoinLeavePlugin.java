package mc.gregvroberts.joinleaveplugin;

import mc.gregvroberts.joinleaveplugin.events.JoinLeaveListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class JoinLeavePlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        getServer().getPluginManager().registerEvents(new JoinLeaveListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
