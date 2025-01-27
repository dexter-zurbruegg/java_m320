package V2;

public class Striker extends Player {
    public Striker(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println(name + " is attacking the opponent's goal as a Striker!");
    }
}
