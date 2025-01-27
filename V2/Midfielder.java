package V2;
public class Midfielder extends Player {
    public Midfielder(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println(name + " is controlling the midfield as a Midfielder!");
    }
}
