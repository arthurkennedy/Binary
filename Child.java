/**
 *
 * @author arthu
 */


public class Child extends Survivor {
    
    int childQuantity;

    public Child(String id){
        this.health = 20;
        this.attack = 2;
        this.id = id;
    }

    public String getId(){
        return this.id;
    }

    @Override
    public int getSurvivorQuantity() {
        return childQuantity;
    }

    @Override
    public String getType(int[] survivor) {
        return survivorType;
    }

    @Override
    public void setType(int[] survivor) {
        survivorType = "Child";
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
        attack = 2;
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
            childQuantity --; //Decrement the quantity of zombies by one if zombie is dead.
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
