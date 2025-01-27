package V2;

// Superclass Player
public class Player {
    protected String name;

    public Player(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println(name + " is playing as a generic player.");
    }
}
