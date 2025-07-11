public class ForEach {
    public static void main(String[] args) {
        String[] names = new String[] {
            "Anshu", "Raj", "Rahul", "Rohan"
        };
        // printNames(names);
        printNamesForEach(names);
    }
    
    // public static void printNames(String[] names) {
    //     for (int i = 0; i < names.length; i++) {
    //         System.out.println(names[i]);
    //     }
    // }

    public static void printNamesForEach(String[] names) {
        for (String name : names) {
            System.out.println(name);
        }
    }
}
