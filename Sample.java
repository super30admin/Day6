// Problem1 (https://leetcode.com/problems/subarray-sum-equals-k/)
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None


// Your code here along with comments explaining your approach

class Solution {
    public int subarraySum(int[] nums, int k) {
        //RunningSum Algo
        HashMap<Integer, Integer> map = new HashMap<>(); // Stores rSum and no of subarrays found for that sum
        int rSum=0; //RunningSum Algo
        int count=0; // to count no of subarrays
        map.put(0,1); // put dummy value so that we don't miss the first subarray  
        for(int i=0;i<nums.length;i++)
        {
            rSum = rSum + nums[i]; // find running sum for the value
           
            int compliment = rSum - k; // first find compliment(diff) by subtracting target from the sum
            if(map.containsKey(compliment)) // if this diff is present in the map
            {
               count += map.get(compliment); // we can get the target so we increment count by the number of subarrays corresponding to the difference (rSum)
            }
            
            // to put rSum in map
            if(!map.containsKey(rSum)) // if it does not contain rSum
            {
                map.put(rSum, 0); // put it
            }
             map.put(rSum, map.get(rSum)+1); // get the value and increment by 1 to denote 1 subrarray added
                
            
        }
        
        return count; // no of subarrays that make target value
        
    }
}


// Problem2 (https://leetcode.com/problems/contiguous-array/)
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None


// Your code here along with comments explaining your approach

class Solution {
    public int findMaxLength(int[] nums) {
        //RunningSum Algo
      HashMap<Integer, Integer> map = new HashMap<>(); // stores rSum and its index
      map.put(0,-1); // put dummy value so that we don't miss the first contiguous array 
        int rSum=0; // RunningSum
        int max=0; //to update the max length found
        
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]==1) rSum++; // if we encounter 1 in array, increment by 1
            else rSum--; // if we encounter 0 in array, decrement by 1
            
            if(!map.containsKey(rSum)) // if the map does not contain the sum found
                map.put(rSum,i); // put it in the map along with index to use the index later to find the longest subarray
            
            else // if rSum present
            {
                int distance = i - (map.get(rSum)); // find distance i.e subtract the index at the first index at which rSum was found from current index
                // we get the same rSum values when there has been equal no of increments and decrements 
                
                if(max < distance) // update the max value if the found distance is greater than the max found till now
                    max = distance;
            }
                
        }
       return max; 
    }
}


// Problem3 (https://leetcode.com/problems/longest-palindrome)
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None


// Your code here along with comments explaining your approach

class Solution {
    public int longestPalindrome(String s) {
  // create a hashset to store the character if not already present in the set, otherwise remove and increase count by 2 (conidering both values of the pair) since we found a pair and we need pairs to form a palindrome string

 // if the set contains any element at the end i.e is not empty, increase count by 1 as it can be used as the middle element and the string will be a palindrome such as in abcba, c is the element
        
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            if(!set.contains(c))
                set.add(c);
            else
            {
                set.remove(c);
                count += 2;
                
            }
        }
        
        if(!set.isEmpty())
            count++;
        
        return count;
    }
}