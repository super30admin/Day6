import java.util.HashMap;
import java.util.HashSet;

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach


/*
 * 1. Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.

Letters are case sensitive, for example, "Aa" is not considered a palindrome here.
 */
class Solution {
    public int longestPalindrome(String s) {
        if(s == null || s.length() == 0) return 0;
        HashSet<Character> hs = new HashSet<>();
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            char chr = s.charAt(i);
            if(hs.contains(chr)){
                count += 2;
                hs.remove(chr);
            }
            else{
                hs.add(chr);
            }
        }
        if(!hs.isEmpty())
            count++;
        return count;
    }
}

//Time Complexity : O(n)
//Space Complexity : O(n)
//Did this code successfully run on Leetcode : yes
//Any problem you faced while coding this :


//Your code here along with comments explaining your approach
/*
 * Using of running sum pattern
 */

/*
 * 2. Given a binary array, find the maximum length of a contiguous subarray with equal number of 0 and 1.
 */
class Solution2 {
    public int findMaxLength(int[] nums) {
        if(nums.length == 0 || nums == null) return 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int rSum = 0;
        map.put(0,-1);
        
        for(int i = 0; i<nums.length; i++){
            rSum = nums[i] == 0? rSum - 1 : rSum + 1;
            if(map.containsKey(rSum)){
                max = Math.max(max, i - map.get(rSum));
            }
            else{
                map.put(rSum,i);    
            }
        }
        return max;
    }
}

//Time Complexity : O(n)
//Space Complexity : O(n)
//Did this code successfully run on Leetcode : yes
//Any problem you faced while coding this :

//Your code here along with comments explaining your approach
/*
* Using of running sum pattern
*/

/*
 * 3. Subarray sum = k
 */

class Solution3 {
    public int subarraySum(int[] nums, int k) {
        if(nums.length == 0 || nums == null) return 0;
        int rSum = 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i = 0; i < nums.length; i++){
            rSum += nums[i];
            int compliment = rSum - k;
            if(map.containsKey(compliment)){
                count += map.get(compliment);
            }
            if(map.containsKey(rSum)){
                map.put(rSum, map.get(rSum)+1 );
            }
            else{
                map.put(rSum,1);
            }
        }
        return count;
    }
}