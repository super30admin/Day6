import java.util.HashMap;
import java.util.HashSet;

public class Hashing {
    //Time complexity: O(N)
    //Space complexity : O(N)
    //did this problem run on leetcode: yes
    // any doubt: no
    //409. Longest Palindrome
    //https://leetcode.com/problems/longest-palindrome/
    public int longestPalindrome(String s) {
        if(s== null || s.length()<=1) return s.length();
        int count=0;
        HashSet<Character> set = new HashSet<>();
        for(int i =0;i<s.length();i++){
            Character c = s.charAt(i);
            if(set.contains(c)){
                count = count +2;
                set.remove(c);

            }else{
                set.add(c);
            }

        }
        if(!set.isEmpty()) count++;
        return count;

    }

    //Time complexity: O(N)
    //Space complexity : O(N)
    //did this problem run on leetcode: yes
    // any doubt: no
    //525. Contiguous Array
    //https://leetcode.com/problems/contiguous-array/
    public int findMaxLength(int[] nums) {
        if(nums.length ==0) return 0;
        int rsum = 0;
        int max =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0, -1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                rsum--;
            }else{
                rsum++;
            }
            if(!map.containsKey(rsum)){
                map.put(rsum,i);
                
            }else{
                int length = i-map.get(rsum);
                if(length>max){
                    max = length;
                }
            }
        }
        return max;
    }
    //Time complexity: O(N)
    //Space complexity : O(N)
    //did this problem run on leetcode: yes
    // any doubt: no
    //https://leetcode.com/problems/subarray-sum-equals-k/
    //560. Subarray Sum Equals K
    public int subarraySum(int[] nums, int k) {
        if(nums.length ==0) return 0;
        int rsum = 0;
        int count =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0, 1);
        for(int i =0;i<nums.length;i++){
            rsum = rsum+nums[i];
            if(map.containsKey(rsum-k)){
                count=count+map.get(rsum-k);
            }
           
            if(!map.containsKey(rsum)){
                map.put(rsum,1);
            }else{
                map.put(rsum,map.get(rsum)+1);
            }
        }
        return count;
    }

}
