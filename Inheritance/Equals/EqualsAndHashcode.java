
public class EqualsAndHashcode {
    public static void main(String[] args) {
      Person person1 = new Person("Anshu", 24, "Male");
      Person person2 = new Person("Anshu", 24, "Male");

      if (person1.equals(person2)) { //==
          System.out.println("Person1 and Person2 are equal");
      } else {
          System.out.println("Person1 and Person2 are not equal");
      }
    }
}
