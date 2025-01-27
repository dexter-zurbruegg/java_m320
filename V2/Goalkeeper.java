package V2;

public class Goalkeeper extends Player {
    public Goalkeeper(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println(name + " is guarding the goal as the Goalkeeper!");
    }
}