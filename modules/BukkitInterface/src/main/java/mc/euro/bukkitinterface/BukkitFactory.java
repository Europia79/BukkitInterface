package mc.euro.bukkitinterface;

import mc.euro.bukkitinterface.compat.OnlinePlayers;
import mc.euro.bukkitinterface.compat.v1_7_10.OnlinePlayersCollection;
import mc.euro.bukkitinterface.compat.v1_7_9.OnlinePlayersArray;
import mc.euro.version.Version;
import mc.euro.version.VersionFactory;

import org.bukkit.Server;

/**
 * 
 * @author Nikolai
 */
class BukkitFactory {
    
    private static Version<Server> server = VersionFactory.getServerVersion();

    public static OnlinePlayers getOnlinePlayers() {
        if (server.isCompatible("1.7.10")) {
            return new OnlinePlayersCollection();
        } else {
            return new OnlinePlayersArray();
        }
    }

}
