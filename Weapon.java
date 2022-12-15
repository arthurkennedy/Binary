public abstract class Weapon {
    
    int weaponDamage; // The damage value of the weapon
    String weaponType; // The type of weapon
    int weaponAccuracy; // The weapon's accuracy (out of 100)

    /**
     * @return type of weapon (String)
     */
    public abstract String getType();

    /**
     * @param weaponType type of weapon (String)
     */
    public abstract void setType(String weaponType);

    /**
     * @return weapon damage (int)
     */
    public abstract int getDamage();

    /**
     * @param weaponDamage amount of damage weapon does (int)
     */
    public abstract void setDamage(int weaponDamage);

    /**
     * @return weapon accuracy (int)
     */
    public abstract int getAccuracy();

    /**
     * @param weaponAccuracy the weapon's accuracy (int) out of 100
     */
    public abstract void setAccuracy(int weaponAccuracy);

}
