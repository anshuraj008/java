public class carr extends Vehiclee{
     private int noOfDoors;

    public carr() {
        super(4);
    }


    //Abstract Method
    @Override
    public void makeStartSound() {
        System.out.println("Vroom");

    }
}
