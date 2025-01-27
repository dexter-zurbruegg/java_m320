package V3;

/**
 * Represents a rogue character with a dagger.
 * This class sets the weapon behavior to a dagger for the character.
 */
class DolchSchurke extends Figur {
    public DolchSchurke(String charakterName) {
        super(charakterName, new DolchVerhalten());
    }
}