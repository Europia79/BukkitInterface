package mc.euro.bukkitinterface.compat.v1_7_10;

import java.util.Collection;
import mc.euro.bukkitinterface.compat.OnlinePlayers;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

/**
 * 
 * @author Nikolai
 */
public class OnlinePlayersCollection implements OnlinePlayers {

    @Override
    public Player[] toArray() {
        return Bukkit.getOnlinePlayers().toArray(new Player[Bukkit.getOnlinePlayers().size()]);
    }

    @Override
    public Collection<? extends Player> toCollection() {
        return Bukkit.getOnlinePlayers();
    }

}
