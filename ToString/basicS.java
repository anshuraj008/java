

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

    // @Override
    // public String toString() {
    //     // TODO Auto-generated method stub
    //     return "my car name is: " + name;
    // }


    // String concat (+)
    @Override
    public String toString() {
        return "basicS{" +
                "noOfWheels=" + noOfWheels +
                ", noOfSeats=" + noOfSeats +
                ", noOfDoors=" + noOfDoors +
                ", noOfEngine=" + noOfEngine +
                ", maxSpeed=" + maxSpeed +
                ", name='" + name + '\'' +
                ", modelNo='" + modelNo + '\'' +
                '}';
    }
    

    // StringBuilder
    public String toString2() {
        final StringBuilder sb = new StringBuilder("basicS{");
        sb.append("noOfWheels=").append(noOfWheels);
        sb.append(", noOfSeats=").append(noOfSeats);
        sb.append(", noOfDoors=").append(noOfDoors);
        sb.append(", noOfEngine=").append(noOfEngine);
        sb.append(", maxSpeed=").append(maxSpeed);
        sb.append(", name='").append(name).append("'");
        sb.append(", modelNo='").append(modelNo).append("'");
        sb.append('}');
        return sb.toString();
    }



    public static void main(String[] args) {
        basicS swift = new basicS(0, 0, 0, 
        0, 0, null, null);

        System.out.println(swift.toString());
    }
}
