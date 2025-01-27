package V3;

public class StabVerhalten implements Waffenverhalten {
    @Override
    public void benutzeWaffe() {
        System.out.println("Zaubert mit einem Stab!");
    }
}