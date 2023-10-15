/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author Asad
 */

public class Jeep extends Vehicle implements Drivable {
    // Constructor for the Jeep class
    public Jeep(float speed, String make, String type, int numPassengers) {
        // Call the superclass (Vehicle) constructor with the provided values
        super(speed, make, type, numPassengers);
        
        // Initialize the number of wheels for the Jeep
        numWheels = 4;
    }

    // Method to accelerate the Jeep's speed
    @Override
    public void accelerate(float speed) {
        setSpeed(getSpeed() + speed);
    }

    // Method to apply the brakes and set the speed to zero
    @Override
    public void brake() {
        setSpeed(0);
    }

    // Method to turn the Jeep by adjusting its direction
    @Override
    public void turn(float angle) {
        setDirection(getDirection() + angle);
    } 
}
