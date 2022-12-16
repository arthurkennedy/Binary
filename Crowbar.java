public class Crowbar extends Weapon{

    public Crowbar(){
        this.weaponType = "Crowbar";
        this.weaponDamage = 10;
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
    public int getDamage(int accuracy) {
        if      (accuracy <= 20){ return weaponDamage; }
        else if (accuracy <= 90){ return weaponDamage / 2; }
        else                    { return weaponDamage - weaponDamage; }
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
 * The Crowbar: the preferred weapon for particle physicists and zombie hunters alike. While handy in a pinch, a crowbar is blunt and not terribly well designed
 * for melee attacks. From the Half-Life wiki:
 * "If timed correctly, [hitting] can be repated until the zombie dies (usually around 5 hits)"
 * My proposed damage is a little more forgiving than Half-Life:
 * 20% chance for full damage : 10 dmg (kill common infected in 3 hits)
 * 70% chance for half damage : 5 dmg
 * 10% chance for no damage (either the person is really bad at swinging a crowbar or the zombie is out of range)
*/