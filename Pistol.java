public class Pistol extends Weapon{

    @Override
    public String getType() {
        weaponType = "Pistol";
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
 * A pistol is a light-weight weapon that can deal moderate damage (assuming this is a glock-style pistol and not a high calibur revolver) but a certain amount
 * of skill is required to handle a pistol accurately.
 * >25% chance for full damage : 15 dmg
 * >50% chance for half damage : 7 dmg (rounded down)
 * >25% chance for no damage
*/