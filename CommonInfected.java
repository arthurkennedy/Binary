/** Common Infected Zombie Class
 * Written by Nate Turner 12/2/22
 * Edited on
 * 
 * Common Infected Character Data:
 * Health 30
 * Attack 5
 * 
 * As a reminder, the abstract class's variables are:
 * ArrayList<Integer> zombie
 * String zombieType
 * int health
 * int attack
 */

public class CommonInfected extends Zombie {

    int commonInfectedQuantity; //The number of common zombies generated
    // This should be specific to the zombie type class because it's a count of a specific type of zombie,
    // not quantity of zombies all together.

    public CommonInfected(String id){
        this.health = 30;
        this.attack = 5;
        this.id = id;
    }

    public String getId(){
        return this.id;
    }

    @Override
    public int getZombieQuantity() {
        return commonInfectedQuantity;
    }

    @Override
    public void setZombieQuantity(int type) {
        commonInfectedQuantity = type;
    }

    @Override
    public String getType(int[] zombie) {
        return zombieType;
    }

    @Override
    public void setType(int[] zombie) {
        zombieType = "Common Infected";
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
        attack = 5;        
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
            commonInfectedQuantity --; // Decrement quantity of zombies by 1 if zombie is dead.
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
