import java.util.ArrayList;

/** Abstract class for the survivor character type */

/** CSC 422 Week 5 Team Project
*  Written by Nate Turner 11/30/22
*  Edited on
*/

public abstract class Survivor {
    
    ArrayList<Integer> survivor; //The arrayList object which will hold the various survivor types
    String survivorType; //The description of which type of survivor
    int health; //The value of the character's health
    int attack; //The value of the character's attack against the zombies

    /**
     * Returns the number of survivors.
     * @return the current number of survivors.
     */
    public abstract int getSurvivorQuantity();

    /**
     * Returns a survivor's health.
     * @param survivorType the type of survivor.
     * @return the survivor's health.
     */
    public abstract int getHealth(int survivorType);

    /**
     * Returns whether a character is dead.
     * @param survivor the array value of the specific survivor.
     * @return t/f whether the survivor is dead.
     */
    public abstract boolean isDead(int[] survivor);

    /**
     * Method for running the survivor's attack.
     */
    public abstract void attackTurn();

    /**
     * Returns damage received from enemy.
     * @return damage taken during enemy's attack turn.
     */
    public abstract int takeDmg();
}
