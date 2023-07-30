package de.penguinpiz.betterqualityguns;

import de.penguinpiz.betterqualityguns.exceptions.RegisterCommandException;
import de.penguinpiz.betterqualityguns.exceptions.RegisterListenerException;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class BetterQualityGuns extends JavaPlugin {

    private BetterQualityGuns main;


    @Override
    public void onEnable() {

        Logger.alert("initializing BetterQualityGuns " + Bukkit.getVersion());

        main = this;

        Logger.alert("initializing listeners");
        try {
            registerListeners();
        } catch (RegisterListenerException e) {
            Logger.warning("initializing listeners failed &7" + e.getMessage());
        }
        Logger.info("successfully initialized listeners");

        Logger.alert("initializing commands");
        try {
            registerCommands();
        } catch (RegisterCommandException e) {
            Logger.warning("initializing commands failed &7" + e.getMessage());
        }
        Logger.info("successfully initialized commands");
    }

    @Override
    public void onDisable() {

    }


    /**
     * @return instance of the Main class
     */
    public BetterQualityGuns getMain() {
        return main;
    }

    /**
     *
     * Registers all the Listeners used in the plugin
     *
     * @throws RegisterListenerException
     */
    private void registerListeners() throws RegisterListenerException {

        PluginManager pluginManager = Bukkit.getPluginManager();


        throw new RegisterListenerException("Problem while initializing Listener <name>");

    }

    /**
     *
     * Registers all the Commands used in the plugin
     *
     * @throws RegisterCommandException
     */
    private void registerCommands() throws RegisterCommandException {


        throw new RegisterCommandException("Problem while initializing Command <name>");

    }
}
