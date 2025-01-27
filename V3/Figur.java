package V3;

/**
 * Abstract class representing a character.
 * This class allows characters to have a name and a weapon behavior.
 */
abstract class Figur {
    private String charakterName;
    private Waffenverhalten waffenverhalten;

    /**
     * Constructs a character with a name and a weapon behavior.
     * This allows the character to perform actions with the specified weapon.
     *
     * @param charakterName the name of the character
     * @param waffenverhalten the weapon behavior of the character
     */
    public Figur(String charakterName, Waffenverhalten waffenverhalten) {
        this.charakterName = charakterName;
        this.waffenverhalten = waffenverhalten;
    }

    /**
     * Sets a new weapon behavior for the character.
     * This allows the character to change weapons dynamically.
     *
     * @param waffenverhalten the new weapon behavior
     */
    public void setWaffenverhalten(Waffenverhalten waffenverhalten) {
        this.waffenverhalten = waffenverhalten;
    }

    /**
     * Makes the character fight using their weapon.
     * This method demonstrates the character's action with their current weapon.
     */
    public void kaempfen() {
        System.out.println(charakterName + " kämpft!");
        waffenverhalten.benutzeWaffe();
    }

    /**
     * Gets the name of the character.
     * This method is used to retrieve the character's name.
     *
     * @return the name of the character
     */
    public String getCharakterName() {
        return charakterName;
    }
}