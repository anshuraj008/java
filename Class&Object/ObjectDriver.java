
public class ObjectDriver {
    public static void main(String[] args) {
        Car myCar = new Car(); // create a new object of Car
        myCar.addFuel(6);
        myCar.drive();
        myCar.drive();
        myCar.drive();
        myCar.addFuel(3);
        myCar.drive();
        System.out.println(myCar.getCurrentFuelLevel());


        // Car swift = new Car();
        // swift.addFuel(6);
    }
}
