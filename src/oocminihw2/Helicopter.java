/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author Asad
 */

 
public class Helicopter extends Vehicle implements Flyable {
    // Private field to track the helicopter's altitude
    private float altitude;

    // Constructor for the Helicopter class
    public Helicopter(float speed, String make, String type, int numPassengers) {
        // Call the superclass (Vehicle) constructor with the provided values
        super(speed, make, type, numPassengers);
        
        // Initialize the number of wings for the helicopter
        numWings = 2;
    }

    // Method to change the altitude of the helicopter
    @Override
    public void changeAltitude(float change) {
        altitude += change;
    }

    // Method to get the current altitude of the helicopter
    @Override
    public float getAltitude() {
        return altitude;
    }
}
