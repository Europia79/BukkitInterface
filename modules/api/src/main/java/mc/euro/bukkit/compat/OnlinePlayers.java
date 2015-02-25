package mc.euro.bukkit.compat;

import java.util.Collection;
import org.bukkit.entity.Player;

/**
 * 
 * @author Nikolai
 */
public interface OnlinePlayers {
    
    public Player[] toArray();
    public Collection<? extends Player> toCollection();

}
