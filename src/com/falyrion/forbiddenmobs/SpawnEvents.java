package com.falyrion.forbiddenmobs;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Rabbit;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

public class SpawnEvents implements Listener {


    @EventHandler
    public void onZombieSpawn(CreatureSpawnEvent event) {

        if (event.getEntity() instanceof Zombie) {

            if (ForbiddenMobsMain.getInstance().zombieHorseRate > 0) {
                double random = Math.random();
                if (random <= ForbiddenMobsMain.getInstance().zombieHorseRate) {
                    Location location = event.getLocation();
                    event.getLocation().getWorld().spawnEntity(location, EntityType.ZOMBIE_HORSE);
                }
            }

            if (ForbiddenMobsMain.getInstance().illusionerRate > 0) {
                double random = Math.random();
                if (random <= ForbiddenMobsMain.getInstance().illusionerRate) {
                    Location location = event.getLocation();

                    Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "/summon illusioner " + location.toString());

                }
            }





        } else if (event.getEntity() instanceof Rabbit) {



        }
    }



}
