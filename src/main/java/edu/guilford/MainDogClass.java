package edu.guilford;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class MainDogClass 
{
    public static void main( String[] args ) throws FileNotFoundException, URISyntaxException
    {
        ArrayList<Dogs> allDogs = new ArrayList<Dogs>();
        DecimalFormat formatter = new DecimalFormat("0.00");
        
        //Instantiate dog object
         Dogs dog1 = new Dogs("Spot", "Poodle", 10, 100.0);
         allDogs.add(dog1);
            
        //loop that instantiates 5 dog objects and adds them to an arraylist
        File sourceFile = new File(MainDogClass.class.getResource("/dogNames.txt").toURI());
        File sourceFile2 = new File(MainDogClass.class.getResource("/dogBreeds.txt").toURI());
        Scanner scan = new Scanner(sourceFile);
        Scanner scan2 = new Scanner(sourceFile2);
        
        for (int i = 0; i < 5; i++) {
            String name = scan.next(); 
            String breed = scan2.next();
            Dogs dog = new Dogs(name, breed);
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
