import java.util.*;

class Solution {
    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        Solution sol = new Solution();
        System.out.println(sol.longestConsecutive(nums));
    }
    
    public int longestConsecutive(int[] nums) {
        int longestLength=0;
        HashMap<Integer, Boolean> exploredMap=new HashMap<>();

        for(int num : nums){
            exploredMap.put(num, Boolean.FALSE);
        }

        for(int num : nums){
            int currentLength = 1;
            int nextNum = num+1;
            while(exploredMap.containsKey(nextNum) && exploredMap.get(nextNum) == false){
                currentLength++;
                exploredMap.put(nextNum, Boolean.TRUE);
                nextNum++;
            }

            int prevNum = num-1;
            while(exploredMap.containsKey(prevNum) && !exploredMap.get(prevNum)){
                currentLength++;
                exploredMap.put(prevNum, Boolean.TRUE);
                prevNum--;
            }
            longestLength=Math.max(longestLength, currentLength);
        }
        return longestLength;
    }
}