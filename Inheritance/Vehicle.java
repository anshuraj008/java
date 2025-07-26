

public class Vehicle{
    private int numberOfTires;

    public void setNumberOfTires(int numberOfTires) {
        this.numberOfTires = numberOfTires;
    }


    //selfDefine
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Vehicle no of tires is : %d\n" + numberOfTires;
    }


    public void commute() {
        System.out.printf("I am going from place A to B using %d tries\n", numberOfTires);
    }
}
