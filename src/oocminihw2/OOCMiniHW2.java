/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author sweiss
 */
public class OOCMiniHW2 {

    /**
     * @param args the command line arguments
     */
    

public static void main(String[] args) {
    // Create instances of different vehicles
    CatBoat catboat = new CatBoat(11, "ALUCAT", "Power Catamarans", 12);
    Helicopter helicopter = new Helicopter(644, "Airbus", "Jet", 8);
    Jeep car = new Jeep(180, "FCA ", "Gladiator", 4);

    // Perform actions with each vehicle
    catboat.hoistSail(); // Hoist the sail on the CatBoat
    catboat.landHo();    // Land the CatBoat

    helicopter.changeAltitude(32000); // Change the altitude of the helicopter
    System.out.println("Current Altitude: " + helicopter.getAltitude()); // Display the current altitude

    car.accelerate(120); // Accelerate the Jeep
    System.out.println("Current Speed: " + car.getSpeed()); // Display the current speed of the Jeep
}

}


