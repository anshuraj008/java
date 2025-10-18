public class GridWays {
    public static int gridWays(int i, int j, int n, int m){
        //base case
        if(i == n-1 && j == m-1){ //code for last cell
            return 1;
        } else if(i == n || j == m){ //code for out of boundary  
            return 0;
        }

        //move downwards
        int downWays = gridWays(i + 1, j, n, m);
        //move right
        int rightWays = gridWays(i, j + 1, n, m);

        return downWays + rightWays;
    }
    public static void main(String args[]) {
        int n = 3, m = 3;
        System.out.println("Total ways to reach the end: " + gridWays(0, 0, n, m));
    }
}
