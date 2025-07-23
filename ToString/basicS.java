

public class basicS {
    int noOfWheels;
    int noOfSeats;
    int noOfDoors;
    int noOfEngine;
    int maxSpeed;
    String name;
    String modelNo;

    public basicS(int noOfWheels, int noOfSeats, int noOfDoors, int noOfEngine, int maxSpeed, String name, String modelNo) {
        this.noOfWheels = 4;
        this.noOfSeats = 5;
        this.noOfDoors = 4;
        this.noOfEngine = 1;
        this.maxSpeed = 100;
        this.name = "Suzuki";
        this.modelNo = "2018";
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "my car name is: " + name;
    }

    public static void main(String[] args) {
        basicS swift = new basicS(0, 0, 0, 
        0, 0, null, null);

        System.out.println(swift.toString());
    }
}
