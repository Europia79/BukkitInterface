package mc.euro.bukkit;

import java.util.Collection;
import mc.euro.bukkit.compat.OnlinePlayers;

import org.bukkit.entity.Player;

/**
 * 
 * @author Nikolai
 */
public class BukkitInterface {
    
    private static OnlinePlayers op = BukkitFactory.getOnlinePlayers();
    
    public static Collection<? extends Player> getOnlinePlayers() {
        return op.toCollection();
    }

}
