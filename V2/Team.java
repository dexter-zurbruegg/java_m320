package V2;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private final String teamName;
    private final List<Player> players;

    public Team(String teamName) {
        this.teamName = teamName;
        this.players = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        players.add(player);
        System.out.println(player.name + " has been added to the team: " + teamName);
    }

    public void play() {
        System.out.println("Team " + teamName + " is playing!");
        for (Player player : players) {
            player.play(); // testing polymorphism
        }
    }
}