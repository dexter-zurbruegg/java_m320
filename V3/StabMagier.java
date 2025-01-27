package V3;

/**
 * Represents a mage character with a staff.
 * This class sets the weapon behavior to a staff for the character.
 */
class StabMagier extends Figur {
    public StabMagier(String charakterName) {
        super(charakterName, new StabVerhalten());
    }
}