package V3;

/**
 * Implements the behavior for using a staff.
 * This class provides the specific action for characters wielding a staff.
 */
class StabVerhalten implements Waffenverhalten {
    @Override
    public void benutzeWaffe() {
        System.out.println("Zaubert mit einem Stab!");
    }
}