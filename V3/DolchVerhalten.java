package V3;

/**
 * Implements the behavior for using a dagger.
 * This class provides the specific action for characters wielding a dagger.
 */
class DolchVerhalten implements Waffenverhalten {
    @Override
    public void benutzeWaffe() {
        System.out.println("Sticht mit einem Dolch zu!");
    }
}