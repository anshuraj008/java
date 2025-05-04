public class twoDimensional {
    public static void main(String[] args) {
        
        int[][] myArr = new int[2][3];
        myArr[0][0] = 1;
        myArr[0][1] = 2;
        myArr[0][2] = 3;
        myArr[1][0] = 4;
        myArr[1][1] = 5;
        myArr[1][2] = 6;
        System.out.println(myArr[0][1]);
        System.out.println(myArr[1][2]);

        int[][] arr = {{1,2,4},{5,6,8},{7,8,9}}; //3 x 3
        System.out.println(arr.length);

        //Traverse the array
        int i = 0;
        while (i < arr.length) {
            int j = 0;
            while (j < arr[i].length) {
                System.out.print(arr[i][j] + "");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
