package com.falyrion.forbiddenmobs;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class ForbiddenMobsMain extends JavaPlugin implements Listener {

    // Zombie Horse, mansion mobs (evoker, vindicator), ravanger, illusioner, killer bunny (on rabbit spawn)

    private static ForbiddenMobsMain instance;

    public static ForbiddenMobsMain getInstance() {
        return instance;
    }

    public double zombieHorseSpawnRate;
    public double illusionerSpawnRate;
    public double vindicatorSpawnRate;
    public double evocerSpawnRate;
    FileConfiguration config = getConfig();

    public void owjej() {
        getServer().getWorld("world").getChunkAt(1, 1).getBlock(1, 1, 1).getBiome();

    }


    @Override
    public void onEnable() {

        this.saveDefaultConfig();

        zombieHorseSpawnRate = config.getDouble("zombieHorseSpawnRate");
        illusionerSpawnRate = config.getDouble("illusionerSpawnRate");
        vindicatorSpawnRate = config.getDouble("vindicatorSpawnRate");
        evocerSpawnRate = config.getDouble("evocerSpawnRate");

        Bukkit.getServer().getPluginManager().registerEvents(new SpawnEvents(), this);

        System.out.println("[ForbiddenMobs] enabled v1.0.0.0 for bukkit 1.17+");
    }

    @Override
    public void onDisable() {
        System.out.println("[ForbiddenMobs] disabled");
    }

}
