public class car extends Vehiclee{
     private int noOfDoors;

    public car() {
        super(4);
    }


    //Abstract Method
    @Override
    public void makeStartSound() {
        System.out.println("Vroom");

    }
}
