/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author Asad
 */

public class CatBoat extends Vehicle implements Sailable {
    // Constructor for the CatBoat class
    public CatBoat(float speed, String make, String type, int numPassengers) {
        // Call the superclass (Vehicle) constructor with the provided values
        super(speed, make, type, numPassengers);
        
        // Initialize the number of sails for the CatBoat
        numSails = 1;
    }

    // Private field to track if the sail is hoisted
    private boolean sailHoisted;

    // Method to hoist the sail
    @Override
    public void hoistSail() {
        sailHoisted = true;
    }

    // Method to lower the sail
    @Override
    public void lowerSail() {
        sailHoisted = false;
    }

    // Method to check if the sail is hoisted
    @Override
    public boolean isSailHoisted() {
        return sailHoisted;
    }

    // Method to describe the action when landing the CatBoat
    @Override
    public void landHo() {
        System.out.println("Catboat is landing at the beach.");
    }
}
