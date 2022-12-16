import java.util.ArrayList;

/** Abstract class for the survivor character type */

/** CSC 422 Week 5 Team Project
*  Written by Nate Turner 11/30/22
*  Edited on 12/1/22
*/

public abstract class Survivor {
    
    ArrayList<Integer> survivor; //The arrayList object which will hold the various survivor types
    String survivorType; //The description of which type of survivor
    int health; //The value of the character's health
    int attack; //The value of the character's attack against the zombies
    String id;     //The [type + number] that identifies which survivor this is
       
    Weapon weapon; //weapon declaration
    
    /**
     * Returns the ID of the survivor
     * @return the ID of the survivor
     */
    public abstract String getId();

    /**
     * Returns the number of survivors.
     * @return the current number of survivors.
     */
    public abstract int getSurvivorQuantity();

    /**
     * Sets the number of survivors for that survivor type.
     * @param type the quantity of survivors of that survivor type (int)
     */
    public abstract void setSurvivorQuantity(int type);

    /**
     * Get what type of survivor.
     * @param survivor the int[] value of the survivor array
     * @return the type of survivor class (String)
     */
    public abstract String getType(int[] survivor);

    /**
     * Set what type of survivor.
     * @param survivor the int[] value of the survivor array
     */
    public abstract void setType(int[] survivor);

    /**
     * Set survivor's health.
     * @param survivor the array value of the survivor.
     */
    public abstract void setHealth(int health);

    /**
     * Returns a survivor's health.
     * @param survivorType the type of survivor.
     * @return the survivor's health.
     */
    public abstract int getHealth();

    /**
     * Set the survivor's attack value.
     * @param attack the strength value of the survivor's attack
     */
    public abstract void setAttack(int attack);

    /**
     * Returns the the attack value.
     * @return the survivor's attack strength value.
     */
    public abstract int getAttack();
    
    /* 
        set and returns the survior's weapon
    */
    public abstract void setWeapon(Weapon weapon);
    public abstract Weapon getWeapon();

    /**
     * Returns whether a character is dead.
     * @param survivor the array value of the specific survivor.
     * @return t/f whether the survivor is dead.
     */
    public abstract boolean isDead(int[] survivor);

    /**
     * Returns damage received from enemy.
     * @param survivor the array value of the specific survior.
     * @param dmgReceived the value of the damaged to be received.
     * @return damage taken during enemy's attack turn.
     */
    public abstract int takeDmg(int[] survivor, int dmgReceived);
}
