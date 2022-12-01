import java.util.ArrayList;

/** Abstract class for the zombie character type */

/** CSC 422 Week 5 Team Project
*  Written by Nate Turner 11/30/22
*  Edited on
*/

public abstract class Zombie {
    
    ArrayList<Integer> zombie; //The arrayList object which will hold the various zombie types
    String zombieType; //The description of which type of zombie
    int health; //The value of the character's health
    int attack; //The value of the character's attack against the survivors

    /**
     * Returns the number of zombies.
     * @return the current number of zombies.
     */
    public abstract int getZombieQuantity();

    /**
     * Returns a zombie's health.
     * @param survivorType the type of zombie.
     * @return the zombie's health.
     */
    public abstract int getHealth(int zombieType);

    /**
     * Returns whether a character is dead.
     * @param zombie the array value of the specific zombie.
     * @return t/f whether the zombie is dead.
     */
    public abstract boolean isDead(int[] zombie);

    /**
     * Method for running the zombie's attack.
     */
    public abstract void attackTurn();

    /**
     * Returns damage received from enemy.
     * @return damage taken during enemy's attack turn.
     */
    public abstract int takeDmg();
}

