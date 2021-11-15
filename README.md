# ForbiddenMobs

This is a plugin for CraftBukkit/ Spigot 1.17+.

# Overview 

ForbiddenMobs allows rare or disabled vanilla mobs to spawn more often or spawn at all. You can set up the spawn rate of
each mob individually.

These unused mobs are:

- **Zombie Horses** (will not spawn in vanilla game)
- **Illusioner** (will not spawn in vanilla game)

Additionally, you have the option to increase the spawn rates of rare mobs:

- **Vindicator** (very rare in vanilla game, there only in woodland mansions and raids)
- **Evoker** (very rare in vanilla game, there only in woodland mansions and raids)
- **Ravager** (very rare in vanilla game, there only in woodland mansions and raids)

# Config of this plugin

You can control the individual spawn rates for all mobs of this plugin in the config-file. All values are decimals (range 
0 to 1), representing percentages from 0% to 100%.

Set a value to `0` (= 0%) to deny their additional spawning. Mobs that spawn naturally anyways (like evocers) will continue
spawning in their natural areas like normal, just the additional spawn event will be removed.

After setting a value, save the config.yml and restart the server.
