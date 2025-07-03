public class Course {
    static int maxCapacity = 100;
    String courseName;
    int enrollments;

    String[] enrolledStudents;

    Course(String courseName) {
        this.courseName = courseName;
        this.enrollments = 0;
        this.enrolledStudents = new String[maxCapacity];
    }

    static void setMaxCapacity(int maxCapacity) {
        Course.maxCapacity = maxCapacity;
    }

    void enrollStudent(String studentName){
         enrolledStudents[enrollments++] = studentName;
         enrollments++;
    }

    void unenrollStudent(String studentName){
         System.out.println("Student removed");
         enrollments--;
    }


        public static void main(String[] args) {
            Course course = new Course("Java");
            course.enrollStudent("Anshu");
            course.enrollStudent("Raj");
            course.enrollStudent("Anshu");

        Course myCourse = new Course("Java");
        System.out.println(myCourse.enrollments);
        System.out.println(myCourse.enrolledStudents[0]);
        System.out.println(myCourse.enrolledStudents[1]);
        System.out.println(myCourse.enrolledStudents[2]);
        System.out.println(myCourse.enrolledStudents[3]);
        System.out.println(myCourse.enrolledStudents[4]);

    }
}
