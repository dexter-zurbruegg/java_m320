package V3;

/**
 * Interface to define weapon behavior.
 * This allows characters to use different weapons without changing their class.
 */
interface Waffenverhalten {
    /**
     * Uses the weapon.
     * This method is implemented by different weapon behaviors to define their specific actions.
     */
    void benutzeWaffe();
}