
public class Person {
    private String name;
    private int age;
    private String gender;
    

    //Constractor
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Person)){
            return false;
        }
        Person per = (Person) obj;
        return per.name.equals(name) && 
        per.age == age && 
        per.gender.equals(gender);
    }

    @Override
    public int hashCode() {
        return (int) Math.round(age);
    }
    

    //getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("name='").append(name).append('\'').append(", ");
        sb.append("age=").append(age).append(", ");
        sb.append("gender='").append(gender).append('\'').append('}');
        return sb.toString();
    }
}
