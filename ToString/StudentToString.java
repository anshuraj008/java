public class StudentToString {
    String name;
    int age;
    String address;
    String rollNo;

    public StudentToString(String name, int age, String address, String rollNo) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.rollNo = rollNo;
    }


    //toString() 
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Student Details:{name:" + name
                                  + ", age:" + age
                                    + ", address:" + address
                                      + ", rollNo:" + rollNo
                                         + "}";
    }

    public static void main(String[] args) {
        StudentToString s1 = new StudentToString("Anshu Raj", 21, "Pune", "1234567890");
        System.out.println(s1);
    }
     
}
