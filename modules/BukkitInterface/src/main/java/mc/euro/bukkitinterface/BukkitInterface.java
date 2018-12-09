package mc.euro.bukkitinterface;

import java.util.Collection;
import mc.euro.bukkitinterface.compat.OnlinePlayers;

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
