
// Abstract Class
public abstract class Vehiclee {
    
    private int noOfTires;

    public abstract void makeStartSound();

    public Vehiclee(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    public int getNoOfTires() {
        return noOfTires;
    }

    public void setNoOfTires(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    public void commute() {
        System.out.println("Going....");
    }
}
