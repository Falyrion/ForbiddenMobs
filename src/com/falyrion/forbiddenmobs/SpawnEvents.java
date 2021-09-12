package com.falyrion.forbiddenmobs;

import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

public class SpawnEvents implements Listener {


    @EventHandler
    public void onZombieSpawn(CreatureSpawnEvent event) {

        if (event.getEntity() instanceof Zombie) {

            if (ForbiddenMobsMain.getInstance().zombieHorseSpawnRate > 0) {
                double random = Math.random();
                if (random <= ForbiddenMobsMain.getInstance().zombieHorseSpawnRate) {
                    Location location = event.getLocation();
                    event.getLocation().getWorld().spawnEntity(location, EntityType.ZOMBIE_HORSE);
                }
            }

            if (ForbiddenMobsMain.getInstance().vindicatorSpawnRate > 0) {
                double random = Math.random();
                if (random <= ForbiddenMobsMain.getInstance().vindicatorSpawnRate) {
                    Location location = event.getLocation();
                    event.getLocation().getWorld().spawnEntity(location, EntityType.ZOMBIE_HORSE);
                }
            }

            if (ForbiddenMobsMain.getInstance().evocerSpawnRate > 0) {
                double random = Math.random();
                if (random <= ForbiddenMobsMain.getInstance().evocerSpawnRate) {
                    Location location = event.getLocation();
                    event.getLocation().getWorld().spawnEntity(location, EntityType.ZOMBIE_HORSE);

                    System.out.println("loaction:" + location.toString());
                }
            }

            /*
            if (ForbiddenMobsMain.getInstance().illusionerSpawnRate > 0) {
                double random = Math.random();
                if (random <= ForbiddenMobsMain.getInstance().illusionerSpawnRate) {
                    Location location = event.getLocation();

                    Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "/summon illusioner " + location.toString());

                }
            }
            */
        }

    }



}
