//Base class Vehicle
class Vehicle {
    String brand;
    String model;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    public String description() {
        return "Vehicle: " + brand + " " + model;
    }
    
    public String startEngine() {
        return "Engine started";
    }
}

// Subclass Car
class Car extends Vehicle {
    public Car(String brand, String model) {
        super(brand, model);
    }
    @Override
    public String startEngine() {
        return brand + " " + model + ": Car engine started";
    }
}

//Subclass Bike
class Bike extends Vehicle {
    public Bike(String brand, String model) {
        super(brand, model);
    }
    @Override
    public String startEngine() {
        return brand + " " + model + " : Bike engine started";
    }
    public String pedal() {
        return brand + " " + model + " :pedaling the bike";
    }
}

//Subclass Truck
class Truck extends Vehicle {
    public Truck(String brand, String model) {
        super(brand, model);
    }

    @Override
    public String startEngine() {
        return brand + " " + model + " : Truck engine started";
    }

    //Defining the loadCargo method for the Truck subclass
    public String loadCargo() {
        return brand + " " + model + " :loading cargo into the truck";
    }
}

//Main class to run the program
public class Main {
    public static void main(String[] args) {
        //Creating instances of each subclass
        Car car = new Car ("Honda", "Civic");
        Bike bike = new Bike("Giant", "Escape 3");
        Truck truck = new Truck("Ford", "F-150");

        //Calling their methods and printing the output
        System.out.println(car.description());
        System.out.println(car.startEngine());

        System.out.println(bike.description());
        System.out.println(bike.startEngine());
        System.out.println(bike.pedal());

        System.out.println(truck.description());
        System.out.println(truck.startEngine());
        System.out.println(truck.loadCargo());
    }
}