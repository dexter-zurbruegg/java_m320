package V2;

public class Defender extends Player {
    public Defender(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println(name + " is defending the team as a Defender!");
    }
}
