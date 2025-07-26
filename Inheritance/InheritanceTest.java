
public class InheritanceTest {

    public static void main(String[] args) {
    Vehicle vehicle = new Vehicle();
    vehicle.commute();
    System.out.println(vehicle.toString());
    System.out.println(vehicle.getClass());
    System.out.println(vehicle.hashCode());


    TwoWheeler two = new TwoWheeler();
    two.balance();
    two.commute();   
    
    MotorCycle mot = new MotorCycle();
    mot.balance();
    mot.commute();
    mot.start();   
    }
}
