

/**
 *
 * @author arthu
 */


public class Teacher extends Survivor {
    
    int teacherQuantity;

    public Teacher(){
        this.health = 50;
        this.attack = 5;
    }

    @Override
    public int getSurvivorQuantity() {
        return teacherQuantity;
    }

    @Override
    public String getType(int[] survivor) {
        return survivorType;
    }

    @Override
    public void setType(int[] survivor) {
        survivorType = "Teacher";
    }

    @Override
    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public int getHealth(int survivorType) {
        return health;
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
    public boolean isDead(int[] survivor) {
        boolean isDead;
        if (health <= 0) {
            isDead = true;
            teacherQuantity --; //Decrement the quantity of zombies by one if zombie is dead.
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
    
}
