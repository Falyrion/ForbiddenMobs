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

            // Spawn zombie horse
            if (ForbiddenMobsMain.getInstance().zombieHorseSpawnRate > 0) {
                double random = Math.random();
                if (random <= ForbiddenMobsMain.getInstance().zombieHorseSpawnRate) {
                    Location location = event.getLocation();
                    event.getLocation().getWorld().spawnEntity(location, EntityType.ZOMBIE_HORSE);
                }
            }

            // Spawn vindicator
            if (ForbiddenMobsMain.getInstance().vindicatorSpawnRate > 0) {
                double random = Math.random();
                if (random <= ForbiddenMobsMain.getInstance().vindicatorSpawnRate) {
                    Location location = event.getLocation();
                    event.getLocation().getWorld().spawnEntity(location, EntityType.VINDICATOR);
                }
            }

            // Spawn evoker
            if (ForbiddenMobsMain.getInstance().evokerSpawnRate > 0) {
                double random = Math.random();
                if (random <= ForbiddenMobsMain.getInstance().evokerSpawnRate) {
                    Location location = event.getLocation();
                    event.getLocation().getWorld().spawnEntity(location, EntityType.EVOKER);
                }
            }

            // Spawn illusioner
            if (ForbiddenMobsMain.getInstance().illusionerSpawnRate > 0) {
                double random = Math.random();
                if (random <= ForbiddenMobsMain.getInstance().illusionerSpawnRate) {
                    Location location = event.getLocation();
                    event.getLocation().getWorld().spawnEntity(location, EntityType.ILLUSIONER);
                }
            }

            // Spawn ravager
            if (ForbiddenMobsMain.getInstance().ravagerSpawnRate > 0) {
                double random = Math.random();
                if (random <= ForbiddenMobsMain.getInstance().ravagerSpawnRate) {
                    Location location = event.getLocation();
                    event.getLocation().getWorld().spawnEntity(location, EntityType.RAVAGER);
                }
            }


        }

    }

}
