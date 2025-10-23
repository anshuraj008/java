import java.util.*;

public class ChocoPrblm {
    public static void main(String[] args) {
        int n = 6, m = 4; // 6 rows and 4 columns
        Integer costVer[] = {1, 2, 5, 10}; //m-1 cuts
        Integer costHor[] = {1, 2, 3, 4, 5, 6}; //n-1 cuts

        // Sort in descending order
        Arrays.sort(costVer, Comparator.reverseOrder());
        Arrays.sort(costHor, Comparator.reverseOrder());

        int h = 0, v = 0;
        int hp = 1, vp = 1;
        int cost = 0;

        while(h < costHor.length && v < costVer.length){
            if(costHor[h] >= costVer[v]){ // horizontal cut
                cost += costHor[h] * vp;
                hp++;
                h++;
            } else { // vertical cut
                cost += costVer[v] * hp;
                vp++;
                v++;
            }
        }

        while(h < costHor.length){
            cost += costHor[h] * vp;
            hp++;
            h++;
        }

        while(v < costVer.length){
            cost += costVer[v] * hp;
            vp++;
            v++;
        }

        System.out.println("The minimum cost to cut the chocolate is: " + cost);
    }
}
 