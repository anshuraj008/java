public class ArrayToString {
    public static void main(String[] args) {
        String[] arr = new String[] {
            "My", "name", "is", "Anshu", "Raj",
             "And", "studing", "Java"
        };

        StringBuilder sb = new StringBuilder();
        for (String str : arr) {
            sb.append(str).append(" ");
        }
        String result = sb.toString().trim();
        System.out.println(result);
    }
}
