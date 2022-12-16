public class AssaultRifle extends Weapon{


    public AssaultRifle(){
        this.weaponType = "Assault Rifle";
        this.weaponDamage = 30;
    }

    @Override
    public String getType() {
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
 * An assault riffle is powerful because of its ability to shoot quickly. A well placed headshot should still be able to down a common infected.
 * The same percentage breakdown as the shotgun can apply to the assault riffe:
 * >10% chance for "headshot" : 30 dmg
 * >40% chance for 50% damage : 15 dmg
 * >40% chance for 30% damage : 9 dmg
 * >10% chance for 0 damage
*/