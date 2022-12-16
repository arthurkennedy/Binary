
/**
 *
 * @author arthu
 */


public class Teacher extends Survivor {
    
    int teacherQuantity;

    public Teacher(String id, Weapon weapon){
        this.health = 50;
        this.attack = 5;
        this.id = id;
        this.weapon = weapon;
    }

    public String getId(){
        return this.id;
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
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    
    @Override
    public Weapon getWeapon() {
        return this.weapon;
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

    @Override
    public void setSurvivorQuantity(int type) {
        // TODO Auto-generated method stub
        
    }
    
}
