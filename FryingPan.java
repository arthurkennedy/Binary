public class FryingPan extends Weapon{

    @Override
    public String getType() {
        weaponType = "Frying Pan";
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
 * The frying pan is the holy grail of zombie defense. The weilder of this mighty weapon can instantly dispatch any foe with a satisfying CLANG
 * The frying pan's base damage is 1,000 and there is no accuracy stats associated with the weapon.
 * Imagine Thor with Mario's invincibility star.
 * 
 * The frying pan is exceedingly rare: 1/4096, the same odds for someone finding a shiny Pokemon. 
*/