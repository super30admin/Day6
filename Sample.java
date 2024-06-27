// Time Complexity : O(n) iterated through all the elements in array
// Space Complexity : O(n) if running sum is different at each element we will have to store n elements in hashmap. 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Brainstormed during class and implemented same solution.


// Your code here along with comments explaining your approach
// Main idea here is we will keep running sum as key in hashmap. In this first we will iterate through all elements in the array. 
// If map already contains running sum we will increase the count of the running sum by one and if it is already not there then we will add it map with count 1. 
// To get the count of sub arrays which has sum k we will check running sum - k is present in the map or not and if it is present we will increase count 
// by that number.
class Solution {
    public int subarraySum(int[] nums, int k) {
        
        if (nums == null || nums.length == 0) {
            return 0;
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        int rSum = 0;
        int count = 0;

        for(int i = 0; i < nums.length; i++) {
            rSum = rSum + nums[i];

            if (map.containsKey(rSum - k)) {
                count = count + map.get(rSum - k);
            }

            if (map.containsKey(rSum)) {
                map.put(rSum, map.get(rSum) + 1);
            } else {
                map.put(rSum, 1);
            }
        }

        return count;

    }
}



// Time Complexity : O(n) iterated through all the elements in array
// Space Complexity : O(n) if running sum is different at each element we will have to store n elements in hashmap.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Brainstormed during class and implemented same solution.


// Your code here along with comments explaining your approach
// In this problem we have just 0s or 1s. If it is a first time then we will add running sum with it's index and we will store the maximum index difference in max.
// If the element is 0 we will decrease running sum by 1 and if element is 1 we will increase running sum by 1. 
// If we already have running sum stored in the map then we will check the current index - running sum index is more than current max then we will update it. 
class Solution {
    public int findMaxLength(int[] nums) {
        
        if (nums == null || nums.length == 0) {
            return 0;
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, -1);

        int rSum = 0;
        int max = 0;

        for(int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                rSum = rSum - 1;
            } else {
                rSum = rSum + 1;
            }

            if(map.containsKey(rSum)) {
                max = Math.max(max, i - map.get(rSum));
            } else {
                map.put(rSum, i);
            }
        }

        return max;
    }
}



// Time Complexity : O(n) iterated through all the elements in array
// Space Complexity : O(n) if we have all different elements in the array
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Brainstormed during class and implemented same solution.


// Your code here along with comments explaining your approach
// A very simple approach for this problem is we will add a new element in hashset and remove element if it is already there in the set.
// Everytime we remove the element from set we will add 2 to the count as it will be added to palindrome string. If the set is not empty then we can add one 
// element at the middle of the string and increase count by 1. 
class Solution {
    public int longestPalindrome(String s) {
        
        if (s == null || s.length() == 0) {
            return 0;
        }
        
        HashSet<Character> set = new HashSet<>();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(set.contains(c)) {
                count = count + 2;
                set.remove(c);
            } else {
                set.add(c);
            }
        }

        if(!set.isEmpty()) {
            count = count + 1;
        }

        return count;
    }
}