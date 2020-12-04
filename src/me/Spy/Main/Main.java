package me.Spy.Main;

import me.Spy.Commands.SACCMD;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public static String prefix = "§8[§4SAC§8]";

    public void onEnable(){
        init();
    }

    public void onDisable(){
    }

    private void init() {
        getCommand("sac").setExecutor(new SACCMD());
    }

}
