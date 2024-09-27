// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
// Solution 1 
class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        
        HashMap<Integer, Integer> map = new HashMap();
        int runningSum = 0;
        map.put(0, 1);
        
        if(nums.length == 1 && k == nums[0]) {
            return 1;
        }
        
       for(int i=0;i<nums.length;i++)//travesing the array 
       {
           runningSum+=nums[i];
           
           if(map.containsKey(runningSum-k))
           {
               count+=map.get(runningSum-k);  
           }
           
           map.put(runningSum,map.getOrDefault(runningSum,0)+1);
       }
        return count;
    }
}


// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Solution 2
class Solution {
    public int findMaxLength(int[] nums) {
        
        HashMap<Integer, Integer> map = new HashMap();
        map.put(0, -1);
        int runningSum = 0;
        int max = 0;
        
        
        for(int i = 0; i < nums.length; i++) {
            
            if(nums[i] == 1) {
                runningSum = runningSum + 1;
            } else {
                runningSum = runningSum -1;
            }
            
            if(!map.containsKey(runningSum)) {
                map.put(runningSum, i);
            } else {
                max = Math.max(max,i - map.get(runningSum));
            }
        }
        return max;
    }
}

// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Solution 3
class Solution {
    public int longestPalindrome(String s) {
        int[] freq = new int[60];
        int sum = 0;
        
        for(int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'A']++;
        }
        
        for(int i = 0; i < freq.length; i++) {
            if(freq[i] % 2 != 0 && freq[i] != 0) {
                sum = sum + freq[i] - 1;
            } else {
                sum = sum + freq[i];
            }
        }
        if(sum != s.length() && sum % 2 ==0) {
            return sum + 1;
        } else {
            return sum;
        }
    }
}