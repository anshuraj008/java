import java.util.*;

public class IndianCoin {
    public static void main(String[] args) {
        Integer coins[] = {1, 2, 5, 10, 20, 50, 100, 200, 500, 2000};

        Arrays.sort(coins, Comparator.reverseOrder());

        int countOfCoins = 0; 
        int amount = 590; // Example amount
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < coins.length; i++) {
            while (amount >= coins[i]) {
                amount -= coins[i];
                countOfCoins++;
                ans.add(coins[i]);
            }
        }
        System.out.println("Minimum coins required: " + countOfCoins);
        System.out.println("Coins used: " + ans);

        for(int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }
}
