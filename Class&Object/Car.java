
public class Car {
    //properties of objects
    //instance variables
    int noOfWheels;
    String color;
    float price;
    float currentFuelInLiters;
    int noOfSeats;
    int maxSpeed;


    //---------Parameter constructor------------
    // Car(String color){
    //     color ="black";
    //     noOfWheels = 4;
    //     maxSpeed = 100;
    //     currentFuelInLiters = 50;
    //     noOfSeats = 5;
    // }


//---------Default constructor------------
    // Car(){
    // this(color :"black");
    // noOfWheels = 4;
    // maxSpeed = 100;
    // }

    

    // instance methods, attributes
    public void drive(){
        if (currentFuelInLiters <= 0){
            System.out.println("Car is out of fuel...");
        } else if (currentFuelInLiters < 5) {
            System.out.println("Car is in reserved mode, please refuel");
        } else {
            System.out.println("Car is driving...");
            currentFuelInLiters--;
        }
    }

    public void stop(){
        System.out.println("Car is stopped...");
        currentFuelInLiters++;
    }

    public void addFuel(float fuel){
        currentFuelInLiters += fuel;
    }

    public float getCurrentFuelLevel(){
        return currentFuelInLiters;
    }
}
