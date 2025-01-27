package V3;

/**
 * Represents a warrior character with an axe.
 * This class sets the weapon behavior to an axe for the character.
 */
class AxtKrieger extends Figur {
    public AxtKrieger(String charakterName) {
        super(charakterName, new AxtVerhalten());
    }
}