

/**
 *
 * @author arthu
 */

public class Soldier extends Survivor {
    
    int soldierQuantity;

    public Soldier(){
        this.health = 100;
        this.attack = 10;
    }

    @Override
    public int getSurvivorQuantity() {
        return soldierQuantity;
    }

    @Override
    public String getType(int[] survivor) {
        return survivorType;
    }

    @Override
    public void setType(int[] survivor) {
        survivorType = "Soldier";
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
        attack = 10;
    }

    @Override
    public int getAttack() {
        return attack;
    }

    @Override
    public boolean isDead(int[] survivor) {
        boolean isDead;
        if (health <= 0) {
            isDead = true;
            soldierQuantity --; //Decrement the quantity of zombies by one if zombie is dead.
        } else {
            isDead = false;
        }
        return isDead;
    }

    @Override
    public int takeDmg(int[] survivor, int dmgReceived) {
        health -= dmgReceived;
        return health;
    }

    @Override
    public void setSurvivorQuantity(int type) {
        // TODO Auto-generated method stub
        
    }
    
}
