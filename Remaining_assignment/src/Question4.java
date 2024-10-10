class Vehicle {
    protected String registrationNumber;
    protected String brand;

    public Vehicle(String registrationNumber, String brand) {
        this.registrationNumber = registrationNumber;
        this.brand = brand;
    }

    public double calculateParkingFee() {
        return 0.0;
    }

    public void displayVehicleDetails() {
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Brand: " + brand);
    }
}

class Car extends Vehicle {
    private int numDoors;

    public Car(String registrationNumber, String brand, int numDoors) {
        super(registrationNumber, brand);
        this.numDoors = numDoors;
    }

    @Override
    public double calculateParkingFee() {
        return 20.0;  // Assuming a flat rate for cars
    }

    @Override
    public void displayVehicleDetails() {
        super.displayVehicleDetails();
        System.out.println("Number of Doors: " + numDoors);
    }
}
class Motorcycle extends Vehicle {
    private String engineType;

    // Constructor for Motorcycle class
    public Motorcycle(String registrationNumber, String brand, String engineType) {
        super(registrationNumber, brand);
        this.engineType = engineType;
    }

    // Override the method to calculate parking fee for motorcycles
    @Override
    public double calculateParkingFee() {
        return 10.0;  // Assuming a lower flat rate for motorcycles
    }

    // Display motorcycle details
    @Override
    public void displayVehicleDetails() {
        super.displayVehicleDetails();
        System.out.println("Engine Type: " + engineType);
    }
}

public class Question4 {
    public static void main(String[] args) {
        // Create an instance of Car
        Car car = new Car("ABC123", "Toyota", 4);
        System.out.println("Car Details:");
        car.displayVehicleDetails();
        System.out.println("Parking Fee for Car: $" + car.calculateParkingFee());

        System.out.println("----------------------------");

        // Create an instance of Motorcycle
        Motorcycle motorcycle = new Motorcycle("XYZ987", "Harley Davidson", "V-Twin");
        System.out.println("Motorcycle Details:");
        motorcycle.displayVehicleDetails();
        System.out.println("Parking Fee for Motorcycle: $" + motorcycle.calculateParkingFee());
    }
}


