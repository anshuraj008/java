

public class learningIf {
    public static void main(String[] args) {
        boolean isMale = true;

        String name = "Anshu";

        int age = 22;

        if (isMale) {
            System.out.println("Male\t" + name);
        } else {
            System.out.println("Female\t" + name);
        }

        if (age > 18) {
            System.out.println("You can vote");
        } else {
            System.out.println("You cannot vote");
        }

        if (name.equals("Anshu")) {
            System.out.println("Name is Anshu");
        } else {
            System.out.println("Name is not Anshu");
        }
    }
}
