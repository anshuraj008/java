
public class basic {
    public static void main(String[] args) {

        // int [] myArr = new int[5];
        // myArr[0] = 10;
        // myArr[1] = 20;
        // myArr[2] = 30;
        // myArr[3] = 40;
        // myArr[4] = 50;
        int[] myArr = {10,20,30,40,50};

        // System.out.println(myArr[0]);
        // System.out.println(myArr[1]);
        // System.out.println(myArr[2]);
        // System.out.println(myArr[3]);
        // System.out.println(myArr[4]);

        //Array NumbersTraversal
        int index = 0;
        while(index < myArr.length){
            System.out.println(myArr[index]);
            index++;
        }

        
        //Array String Traversal
        String[] strArr = new String[4];
        strArr[0] = "Anshu";
        strArr[1] = "Raj";
        strArr[2] = "Kumar";
        strArr[3] = "Sharma";
        System.out.println(strArr[0]);
        
        String[] strArr2 = {"First","Second","Third"};
        System.out.println(strArr2[1]);

        System.out.println("Array Size: "+strArr.length);
        System.out.println("Array Size: "+strArr2.length);
    }
}
