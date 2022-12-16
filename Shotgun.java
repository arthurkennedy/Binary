public class Shotgun extends Weapon {

    public Shotgun(){
        this.weaponType = "Shotgun";
        this.weaponDamage = 60;
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
 * A shotgun is a highly effective weapon in close quarters combat and should be able to one-shot a common infected,
 * meaning that it should deal at least 30 dmg.
 * 
 * My thought would be that it should take 3 hits to kill a tank with a shotgun, (any less, it would feel over-powered; any more, too bullet-spongey)
 * meaning that it should probably deal 60 dmg.
 * 
 * Accuracy: Since someone needs to be in relatively close quarters in order for the damage to be the most effective, I suggest that the shotgun should
 * have a sliding accuracy range. Meaning: 
 * >10% chance for full damage : 60 dmg
 * >40% chance for half damage : 30 dmg (This still 1-shots common infected)
 * >40% chance for 30% damage : 18 dmg
 * >10% chance for 0 damage
*/