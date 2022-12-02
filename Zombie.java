import java.util.ArrayList;

/** Abstract class for the zombie character type */

/** CSC 422 Week 5 Team Project
*  Written by Nate Turner 11/30/22
*  Edited on 12/1/22
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
     * Get what type of zombie.
     * @param zombie the int[] value of the zombie array
     * @return the type of zombie class (String)
     */
    public abstract String getType(int[] zombie);

    /**
     * Set what type of zombie.
     * @param zombie the int[] value of the zombie array
     */
    public abstract void setType(int[] zombie);

    /**
     * Set zombie's health.
     * @param zombie the array value of the zombie.
     */
    public abstract int setHealth(int[] zombie);

    /**
     * Returns a zombie's health.
     * @param zombieType the type of zombie.
     * @return the zombie's health.
     */
    public abstract int getHealth(int zombieType);

    /**
     * Set the zombie's attack value.
     * @param attack the strength value of the zombie's attack
     */
    public abstract void setAttack(int attack);

    /**
     * Returns the the attack value.
     * @return the zombie's attack strength value.
     */
    public abstract int getAttack();

    /**
     * Returns whether a character is dead.
     * @param zombie the array value of the specific zombie.
     * @return t/f whether the zombie is dead.
     */
    public abstract boolean isDead(int[] zombie);

    /**
     * Returns damage received from enemy.
     * @param zombie the array value of the spcific zombie.
     * @return damage taken during enemy's attack turn.
     */
    public abstract int takeDmg(int[] zombie);
}

