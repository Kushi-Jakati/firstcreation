package edu.guilford;

public class Dice {
    
    //attributes 
    private int numSides;; 
    private int value;

    //Constructors 
    public Dice() {
        numSides = 6; 
        value = 0; 
    }

    //Methods
    public int roll() {
        value = (int) (Math.random() * numSides) + 1; 
        return value; 
    } //end roll

    //Constructor
    public Dice(int numSides) {
        this.numSides = numSides;
    }

    //Getters and Setters
    public int getNumSides() {
        return numSides;
    }

    public void setNumSides(int numSides) {
        this.numSides = numSides;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    

}
