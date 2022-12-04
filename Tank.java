/** Tank Zombie Class
 * Written by Nate Turner 12/2/22
 * Edited on
 * 
 * Tank Character Data:
 * Health 150
 * Attack 20
 * 
 * As a reminder, the abstract class's variables are:
 * ArrayList<Integer> zombie
 * String zombieType
 * int health
 * int attack
 */

public class Tank extends Zombie {

    int tankQuantity; //The number of tank zombies generated
    // This should be specific to the zombie type class because it's a count of a specific type of zombie,
    // not quantity of zombies all together.

    public Tank(String id){
        this.health = 150;
        this.attack = 20;
        this.id = id;
    }

    public String getId(){
        return this.id;
    }

    @Override
    public int getZombieQuantity() {
        return tankQuantity;
    }

    @Override
    public void setZombieQuantity(int type) {
        tankQuantity = type;
    }

    @Override
    public String getType(int[] zombie) {
        return zombieType;
    }

    @Override
    public void setType(int[] zombie) {
        zombieType = "Tank";
    }

    @Override
    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public int getHealth() {
        return this.health;
    }

    @Override
    public void setAttack(int attack) {
        attack = 150;
    }

    @Override
    public int getAttack() {
        return attack;
    }

    @Override
    public boolean isDead(int[] zombie) {
        boolean isDead;
        if (health <= 0) {
            isDead = true;
            tankQuantity --; //Decrement the quantity of zombies by one if zombie is dead.
        } else {
            isDead = false;
        }
        return isDead;
    }

    @Override
    public int takeDmg(int[] zombie, int dmgReceived) {
        health -= dmgReceived;
        return health;
    }
    
}
