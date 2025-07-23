public class stringTest {
public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("First\t");
    sb.append(45);
    sb.append(", Second\t");
    sb.append(45.56);
    System.out.println(sb.toString());
}
}
