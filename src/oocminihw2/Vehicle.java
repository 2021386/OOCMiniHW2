/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author sweis
 */

public abstract class Vehicle {
    // Private fields to store vehicle information
    private float speed;
    private float direction = 0;
    private String make;
    private String type;
    protected int numWheels = 0;
    protected int numWings = 0;
    protected int numSails = 0;
    private int numPassengers;

    // Constructor for the Vehicle class
    public Vehicle(float speed, String make, String type, int numPassengers) {
        // Initialize vehicle properties with provided values
        this.speed = speed;
        this.make = make;
        this.type = type;
        this.numPassengers = numPassengers;
    }

    // Getter method to retrieve the current speed of the vehicle
    public float getSpeed() {
        return speed;
    }

    // Setter method to update the speed of the vehicle
    public void setSpeed(float speed) {
        this.speed = speed;
    }

    // Getter method to retrieve the current direction of the vehicle
    public float getDirection() {
        return direction;
    }

    // Setter method to update the direction of the vehicle
    public void setDirection(float direction) {
        this.direction = direction;
    }

    // Getter method to retrieve the make of the vehicle
    public String getMake() {
        return make;
    }

    // Setter method to update the make of the vehicle
    public void setMake(String make) {
        this.make = make;
    }

    // Getter method to retrieve the type of the vehicle
    public String getType() {
        return type;
    }

    // Setter method to update the type of the vehicle
    public void setType(String type) {
        this.type = type;
    }

    // Getter method to retrieve the number of wheels the vehicle has
    public int getNumWheels() {
        return numWheels;
    }

    // Setter method to update the number of wheels the vehicle has
    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    // Getter method to retrieve the number of wings the vehicle has
    public int getNumWings() {
        return numWings;
    }

    // Setter method to update the number of wings the vehicle has
    public void setNumWings(int numWings) {
        this.numWings = numWings;
    }

    // Getter method to retrieve the number of sails the vehicle has
    public int getNumSails() {
        return numSails;
    }

    // Setter method to update the number of sails the vehicle has
    public void setNumSails(int numSails) {
        this.numSails = numSails;
    }

    // Getter method to retrieve the number of passengers the vehicle can carry
    public int getNumPassengers() {
        return numPassengers;
    }

    // Setter method to update the number of passengers the vehicle can carry
    public void setNumPassengers(int numPassengers) {
        this.numPassengers = numPassengers;
    }
}
