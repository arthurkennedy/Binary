public class Axe extends Weapon{

    @Override
    public String getType() {
        weaponType = "Axe";
        return weaponType;
    }

    @Override
    public void setType(String weaponType) {
        this.weaponType = weaponType;    
    }

    @Override
    public int getDamage() {
        return weaponDamage;
    }

    @Override
    public void setDamage(int weaponDamage) {
        this.weaponDamage = weaponDamage;
    }

    @Override
    public int getAccuracy() {
        return weaponAccuracy;
    }

    @Override
    public void setAccuracy(int weaponAccuracy) {
        this.weaponAccuracy = weaponAccuracy;
    }
    
}

/** RATIONALE
 * An axe is a pretty handy melee weapon and deals a fair amount of damage if the hit is well placed. The "accuracy" regarding an axe can be thought of
 * in terms of body location the axe hit when the person weilding the axe is under pressure and in close quarters with zombies:
 * 20% chance for full damage : 30 dmg (can decapitate common infected)
 * 70% chance for half damage : 15 dmg
 * 10% chance for no damage
 * 
*/