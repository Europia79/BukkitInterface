package mc.euro.bukkitinterface.compat.v1_7_9;

import java.util.Arrays;
import java.util.Collection;
import mc.euro.bukkitinterface.compat.OnlinePlayers;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

/**
 * 
 * @author Nikolai
 */
public class OnlinePlayersArray implements OnlinePlayers {

    @Override
    public Player[] toArray() {
        return Bukkit.getOnlinePlayers();
    }

    @Override
    public Collection<Player> toCollection() {
        return Arrays.asList(Bukkit.getOnlinePlayers());
    }

}
