import java.util.ArrayList;
import java.util.Random;


/*
 * HELLO ARTHUR!!!
 * I APPRECIATE YOU HELPING OUT WITH PART 2 AND ALLOWING ME TO DO 3 ON TIME
 * TO SAY THANKS I WENT AHEAD AND DID PART 4 AS WELL SO THAT RELEASE 1 AND 2 WILL BE READY TO GO
 * ALL YOU HAVE TO DO IS UN-COMMENT LINES:
 *      31-34, 70, 91
 * 
 * THANKS AGAIN!!!  
 */

public class ZombieWar {

    private static int children = 0;
    private static int teachers = 0;
    private static int soldiers = 0;
    private static int commons = 0;
    private static int tanks = 0;

    public static void main(String[] args){
        
        ArrayList<Survivor> survivors = generateSurvivors();
        ArrayList<Zombie> zombies = generateZombies();

         System.out.println("We have " + survivors.size() + " survivors trying to make it to safety"
                        + "(" + children + " children, " + teachers + " teachers, " + soldiers + " soldiers)");
         System.out.println("But there are " + zombies.size() + " zombies waiting for them"
                        +"(" + commons + " common infected, " + tanks + " tanks)");
        
        

        fight(survivors, zombies);

        if (survivors.size() == 0){
            System.out.println("None of the survivors made it.");
        }
        else{
            System.out.println("It seems " + survivors.size() + " have made it to safety.");
        }
        
        
    }

    private static String fight(ArrayList<Survivor> survivors, ArrayList<Zombie> zombies) {
        //These will be our flags, we will flip to true when either the survivor or zombie list is empty
        boolean sEmpty = false;
        boolean zEmpty = false;

        if (survivors.size() == 0) { sEmpty = true; }
        if (zombies.size() == 0) { zEmpty = true; }

        //This is the fight loop, we will continue looping the fight until one of these lists is empty
        while (sEmpty == false && zEmpty == false){
            //First ever survivor gets a chance to attack!
            for (int i=0; i<survivors.size(); i++){

                int zombieHealth = zombies.get(0).getHealth();      //Get the health of the next zombie in the list
                zombieHealth -= survivors.get(i).getWeapon().getDamage();             //Subtract the attack of the survivor from the heatlh of the zombie
                zombies.get(0).setHealth(zombieHealth);
                
                if (zombieHealth <= 0){
                    
                    // UN-COMMENT THIS FOR RELEASE 2 !!!
                    System.out.println("   " + survivors.get(i).getId() + " killed " + zombies.get(0).getId() + " with a " + survivors.get(i).getWeapon().weaponType);
                    
                    zombies.remove(0);                              //Remove zombie from the list if its health has fallen to 0 or below
                }

                if (zombies.size() == 0){
                    zEmpty = true; 
                    break;                                      //Set flag to true if zombie list is empty
                }
            }
            if (zEmpty == true){ break; }   //Break while loop early if zombies are all defeated

            for (int x=0; x<zombies.size(); x++){
                
                int survivorHealth = survivors.get(0).getHealth();  //Get the health of the next survivor in the list
                survivorHealth -= zombies.get(x).getAttack();             //Subtract the attack of the next zombie from the health of the survivor
                survivors.get(0).setHealth(survivorHealth);

                if (survivorHealth <= 0){

                    // UN-COMMENT THIS FOR RELEASE 2 !!!
                    System.out.println("   " + zombies.get(x).getId() + " killed " + survivors.get(0).getId());
                    
                    survivors.remove(0);                            //Remove survivor from the list if their health has fallen to 0 or below
                }

                if (survivors.size() == 0){
                    sEmpty = true;          //Set flag to true if survivor list is empty
                    break;                                      
                }
            }
        }

        if (zEmpty == true){ return "Survivors"; }
        else{ return "Zombies"; }
    }

    private static ArrayList<Zombie> generateZombies() {
        //Create a list of zombies to send back to main
        ArrayList<Zombie> z = new ArrayList<>();

        int numOfZombies = getRandomNumber(30);

        for (int i=0; i < numOfZombies; i++){
            int type = getRandomNumber(2);  //generates either 1 or 2 at random
            //adds a random type of zombie to the list depending on the number generated
            switch(type){
                case 1:
                    commons++; 
                    z.add(new CommonInfected("Common Infected " + commons));
                    break;
                case 2: 
                    tanks++;
                    z.add(new Tank("Tank " + tanks));
                    break;
            }
        }

        return z;
    }

    private static ArrayList<Survivor> generateSurvivors() {
        //Create a list of survivors to send back to main
        ArrayList<Survivor> s = new ArrayList<>();

        int numOfSurvivors = getRandomNumber(30);

        Weapon weapon;

        for (int i=0; i<numOfSurvivors; i++){
            int type = getRandomNumber(3);  //generates 1, 2, or 3 at random
            weapon = weaponCache();             //generates a random weapon for the survivor

            //adds a new survivor to the list depending on what random number gets generated
            switch(type){
                case 1:
                    children++;
                    s.add(new Child("Child " + children, weapon));
                    break;
                case 2:
                    teachers++;
                    s.add(new Teacher("Teacher " + teachers, weapon));
                    break;
                case 3:
                    soldiers++;
                    s.add(new Soldier("Soldier " + soldiers, weapon));
                    break;
            }
        }

        return s;
        
    }

    /*
     * This is the weapon cache, every survivor gets one chance to reach into the cache and remove a weapon
     * The odds for recieving each weapon are as follows:
     * __________________________________
     * |Assault Rifle| 15% |   615/4096 |
     * |Axe          | 15% |   615/4096 |
     * |Crowbar      | 40% |   1637/4096|
     * |Frying Pan   | <1% |   1/4096   |
     * |Pistol       | 20% |   819/4096 |
     * |Shotgun      | 10% |   409/4096 |
     * |________________________________|
     */
    private static Weapon weaponCache(){
        int x = getRandomNumber(4096);

        if      (x == 1)  { return new FryingPan(); }
        else if (x < 410) { return new Shotgun(); }
        else if (x < 1025){ return new AssaultRifle(); }
        else if (x < 1640){ return new Axe(); }
        else if (x < 2459){ return new Pistol(); }
        else              { return new Crowbar(); }

    }

    //This method will return a random number between 1 and the max sent
    private static int getRandomNumber(int max){
        Random r = new Random();

        return r.nextInt(max) + 1;
    }
}
