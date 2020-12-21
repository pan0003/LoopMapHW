package LoopHW; //This is where I have declared my package//

import java.util.*; //This is important somehow

public class LoopPart2 {
    private String Vehicle;

    HashMap<String, String> vehiclesIHave = new HashMap<String, String>();

    public void vehicleHave() {
        //I will now add the model and make of the cars that I have to sell//
        vehiclesIHave.put("Sienna", "Toyota");
        vehiclesIHave.put("Tundra", "Toyota");
        vehiclesIHave.put("Camry", "Toyota");
        vehiclesIHave.put("F-150", "Ford");
        vehiclesIHave.put("Focus", "Ford");
        vehiclesIHave.put("Accord", "Honda");
        vehiclesIHave.put("Odyssey", "Honda");
        vehiclesIHave.put("Pilot", "Honda");
    }

    public void getVehicles() {
        Scanner whatVehicle = new Scanner(System.in);
        System.out.println("Welcome to Andrew's Hopefully Good AutomoBYLES!");
        System.out.println("What model car do you want?");
        Vehicle = whatVehicle.next();
        whatVehicle.close();
        if (vehiclesIHave.containsValue(Vehicle)) {
            System.out.printf("You're in luck! Walk over there to find our %s models", Vehicle);
        } else
            System.out.printf("Sorry not sorry, we don't have %s models. Get lost!", Vehicle);
    }

    public static void main(String[] args) throws Exception {
        LoopPart2 vehicles = new LoopPart2();
        vehicles.vehicleHave();
        vehicles.getVehicles();
    }
    
}
