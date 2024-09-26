import java.util.HashMap;
import java.util.HashSet;
//Subarray Sum Equals K
// Did this code successfully run on Leetcode : yes
//Time Complexity : O(N)
//Space Complexity : O(1)
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        //intial entry
        map.put(0,1);
        int rSum = 0;
        int result = 0;
        for(int i=0; i<nums.length; i++){
            //calculating running sum
            rSum+=nums[i];
            //if map contains rSum-k has occured before
            if(map.containsKey(rSum - k)) {
                //add to result
                result += map.get(rSum - k);
            }
            //doesnt contain rSum
             if(!map.containsKey(rSum)) {
                 //put into map
                 map.put(rSum,0);
             }
            //rewrite the value of running sum by adding 1
            map.put(rSum, map.getOrDefault(rSum , 0) + 1);
        }
        return result;
    }
}

//Contiguous Array
// Did this code successfully run on Leetcode : yes
//Time Complexity : O(N)
//Space Complexity : O(1)
class Solution1 {
    public int findMaxLength(int[] nums) {
    //running sum
    int rSum = 0;
    //Max length
    int max = 0;
    HashMap<Integer,Integer> map = new HashMap<>();
    //0 index is -1
    map.put(0,-1);
    
    for(int i=0; i<nums.length; i++){
        //if we come accross 1 then add 1 to rSum
        if(nums[i]==1) rSum+=1;
        //else subtract if we find 0
        else rSum-=1;
        //if the map already contains the sum and index 
        //find max between obtained length and previous
        //assign it to max 
        if(map.containsKey(rSum)){
            max = Math.max(max,i - map.get(rSum));
        }
        //if map doesnt contain then put it in map
        else{
        map.put(rSum,i);
        }
    }
        return max;
    }
}

//Longest Palindrome
// Did this code successfully run on Leetcode : yes
//Time Complexity : O(N)
//Space Complexity : O(1)
class Solution2 {
    public int longestPalindrome(String s) {
        if(s==null || s.length()==0) return 0;
        //Create HashSet of characters
        HashSet<Character> hs = new HashSet<Character>();
        //take a counter which has the count of number of pairs
        //for example
        //in abccccdd count will have cc--> c , cc-->c and dd--> d
        //hashset will have a & b
        int count = 0;
        for(int i=0; i<s.length(); i++){
            //if hashset contains character then remove it and increase count by 1
            if(hs.contains(s.charAt(i))){
                hs.remove(s.charAt(i));
                count++;
            }else{
                //else add to set
                hs.add(s.charAt(i));
            }
        }
        //if has set is not empty means there is or are characters that do not repeat
        //so add any one of letter with rest of the repeated pairs sorted in count
        //for example: abccccdd
        //[a,b] -> hashset
        //count c,c,d -> 3
        //3*2=6+1;
        if(!hs.isEmpty()) return count*2+1;
        //else return the count*2 
        return count*2;
    }
}