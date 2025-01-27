package V3;

/**
 * Implements the behavior for using an axe.
 * This class provides the specific action for characters wielding an axe.
 */
class AxtVerhalten implements Waffenverhalten {
    @Override
    public void benutzeWaffe() {
        System.out.println("Schwingt eine Axt!");
    }
}