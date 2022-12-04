import java.util.ArrayList;
import java.util.Random;

public class ZombieWar {

    public static void main(String[] args){
        
        ArrayList<Survivor> survivors = generateSurvivors();
        ArrayList<Zombie> zombies = generateZombies();
        fight();
        
    }

    private static void fight() {
    }

    private static ArrayList generateZombies() {
        //Create a list of zombies to send back to main
        ArrayList<Zombie> z = new ArrayList<>();

        int numOfZombies = getRandomNumber(30);

        for (int i=0; i < numOfZombies; i++){
            int type = getRandomNumber(1);  //generates either 0 or 1 at random
            //adds a random type of zombie to the list depending on the number generated
            switch(type){
                case 0:
                    z.add(new CommonInfected());
                    break;
                case 1: 
                    z.add(new Tank());
            }
        }

        return z;
    }

    private static ArrayList generateSurvivors() {
        //Create a list of survivors to send back to main
        ArrayList<Survivor> s = new ArrayList<>();

        int numOfSurvivors = getRandomNumber(30);

        for (int i=0; i<numOfSurvivors; i++){
            int type = getRandomNumber(2);  //generates 0, 1, or 2 at random
            //adds a new survivor to the list depending on what random number gets generated
            switch(type){
                case 0:
                    s.add(new Child());
                    break;
                case 1:
                    s.add(new Teacher());
                    break;
                case 2:
                    s.add(new Soldier());
                    break;
            }
        }

        return s;
        
    }

    //This method will return a random number between 0 and the max sent
    private static int getRandomNumber(int max){
        Random r = new Random();

        return r.nextInt(max + 1);
    }
}
