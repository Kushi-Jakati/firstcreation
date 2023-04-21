package edu.guilford;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ArrayList<Dogs> allDogs = new ArrayList<Dogs>();
        
        //Instantiate dog object
         Dogs dog1 = new Dogs("Spot", "Poodle", 10, 100.0);
         allDogs.add(dog1);
            
        //loop that instantiates 5 dog objects and adds them to an arraylist
        for (int i = 0; i < 4; i++) {
            Dogs dog = new Dogs("Fido", "Pitbull");
            allDogs.add(dog);
        }

        //loop through arraylist and print out all info
        String allInfo = ""; 
        for (Dogs dog : allDogs) {
            allInfo = dog.toString() + "\n" + "Life Expectancy: " + dog.liklihoodOfDeath() + "\n";
            System.out.println(allInfo);
        }
    
    }

}
