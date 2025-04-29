public class function4 {
    public static void main(String[] args) {
        printFirstPatter();
    }

    public static void printFirstPatter() {
        int rows = 0;
        while (rows < 15) {
           System.out.print("*");

           int i = 0;
           while (i < rows) {
            System.out.print(" *");
               i++;
           }
           System.out.println();
           rows++;
        }
    }
}
