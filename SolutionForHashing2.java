/**
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * 
 *  using HashMap to count running sum at every index.
 * For every index which has currentSum we check if (currentSum - k) exists in the Map.
 * If  present,  increment the result with the number of times (currentSum -k) encountered in hashmap.
 */
class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums == null || nums.length == 0)
        {
            return 0;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int cnt = 0;
        int rSum = 0;
        map.put(0,1);
        for(int i = 0; i < nums.length; i ++)
        {
            rSum = rSum + nums[i];
            if(map.containsKey(rSum -k)) {
                cnt = cnt + map.get(rSum - k);
            }
            map.put(rSum, map.getOrDefault(rSum, 0) + 1);
        }
        return cnt;
    }
}


// Contiguous Array
/**
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * 
 * Approach: computed the running sum in the array while iterating.
 * If value of "0" is encountered, we subtract 1 from the current sum. and for "1" we add 1 to the current sum.
 * If the current sum at every index is not found in the hashmap, we add it to the hashmap.
 * If current sum is found in the map, we compute the max length and update accordingly.
 */
class Solution {
    public int findMaxLength(int[] nums) {
        if (nums == null || nums.length == 0 || nums.length ==1)
        {
            return 0;
        }
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int rSum = 0;
        map.put(0,-1);

        for (int i =0; i< nums.length; i ++)
        {
            if(nums[i] == 0) 
            {
                rSum--;
            }
            else if(nums[i] == 1)
            {
                rSum++;
            }
            if(map.containsKey(rSum)) {
                max = Math.max(max, (i - map.get(rSum)));
            }
            else {
                map.put(rSum, 1);
            }
        }
    
        return max;
}
}

//Palindrome
/**
 * Time Complexity: O(n) where n is the length of the string.
 * Space Complexity: O(1)
 * 
 * Approach: Used a hashset to keep track of repeating characters.
 * If the character is not found in hashset, we add it. else, add 2 to the count and remove the element from the set.
 * At end of iteration if the set is not empty, we add 1 to the count. 
 */
class Solution {
    public int longestPalindrome(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }

        HashSet<Character> set = new HashSet<>();
        int cnt=0;
        for(int i =0; i < s.length(); i ++)
        {
            char c = s.charAt(i);
            if(set.contains(c)) {
                cnt = cnt +2;
                set.remove(c);
            }
            else {
                set.add(c);
            }
        }
        if(!set.isEmpty()) {
            cnt++;
        }
        return cnt;
    }
}



