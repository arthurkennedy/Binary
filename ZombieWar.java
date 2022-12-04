import java.util.ArrayList;
import java.util.Random;

public class ZombieWar {

    public static void main(String[] args){
        
        ArrayList<Survivor> survivors = generateSurvivors();
        ArrayList<Zombie> zombies = generateZombies();

        System.out.println("We have " + survivors.size() + " survivors trying to make it to safety.");
        System.out.println("But there are " + zombies.size() + " zombies waiting for them.");

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
                zombieHealth -= survivors.get(i).getAttack();             //Subtract the attack of the survivor from the heatlh of the zombie
                zombies.get(0).setHealth(zombieHealth);
                
                if (zombieHealth <= 0){
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
                    z.add(new CommonInfected());
                    break;
                case 2: 
                    z.add(new Tank());
                    break;
            }
        }

        return z;
    }

    private static ArrayList<Survivor> generateSurvivors() {
        //Create a list of survivors to send back to main
        ArrayList<Survivor> s = new ArrayList<>();

        int numOfSurvivors = getRandomNumber(30);

        for (int i=0; i<numOfSurvivors; i++){
            int type = getRandomNumber(3);  //generates 1, 2, or 3 at random
            //adds a new survivor to the list depending on what random number gets generated
            switch(type){
                case 1:
                    s.add(new Child());
                    break;
                case 2:
                    s.add(new Teacher());
                    break;
                case 3:
                    s.add(new Soldier());
                    break;
            }
        }

        return s;
        
    }

    //This method will return a random number between 1 and the max sent
    private static int getRandomNumber(int max){
        Random r = new Random();

        return r.nextInt(max) + 1;
    }
}
