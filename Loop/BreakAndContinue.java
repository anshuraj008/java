public class BreakAndContinue {
    public static void main(String[] args) {
        System.out.println("Before loop");

        for (int i = 0; i < 100; i++) {
            if (i == 50) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("Out of loop");

            for (int i = 1; i < 100; i++) {
            if (i == 50) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("Out of loop");
    }
}
