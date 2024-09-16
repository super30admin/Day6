
// ===========================================Sub Array Sum================================================
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
//  - Sum of Sub array = k if the distance between two points in array is K. 
//  - Calculate running sum for the entire array and if running_sum - k is already available, then thats one sub array to be counted
// Your code here along with comments explaining your approach


class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums == null || nums.length ==0)
            return 0;
        
        int running_sum =0;
        int count =0;
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
        hm.put(0,1);
        for(int i =0; i< nums.length; i++){
            running_sum += nums[i];
            int diff = running_sum - k;
            if(hm.containsKey(diff))
                count += hm.get(diff);
                // hm.put(running_sum,1);
            hm.put(running_sum, hm.getOrDefault(running_sum,0)+1);
            //     if(hm.containsKey(running_sum)){
            //     hm.put(running_sum,hm.get(running_sum)+1);
            // }else{
            //     hm.put(running_sum,1);
            // }
        }
        return count;
    }
}


// =================================Longest Palaindrome=================================

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No
// Your code here along with comments explaining your approach
class Solution {
    public int longestPalindrome(String s) {
        
        HashSet<Character> hs = new HashSet<Character>();
        int count = 0;
        for(int i = 0; i< s.length(); i++){
            if(hs.contains(s.charAt(i))){
                hs.remove(s.charAt(i));
                count++;
            }else{
                hs.add(s.charAt(i));
            }
        }
        if(hs.isEmpty())
                return count*2;
            else
                return count*2+1;
        
    }
}

// ======================= No of Continous Array in binary Array=====================

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No
// Your code here along with comments explaining your approach



class Solution {
    public int findMaxLength(int[] nums) {
        if(nums ==null || nums.length == 0)
            return -1;
        
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>(); // Hash with Running sum and index of first occurence
        int len = nums.length;
        int max=0, count = 0;
        hashMap.put(0,-1); 
        for(int i = 0; i< len; i++){
            count += nums[i] ==0? -1:1;
            if(hashMap.containsKey(count)){
                max = Math.max(max,i - hashMap.get(count)); // If the running sum is available then get the previous index(value) and 
                                                           //  check if the difference of current index to get maximum size of sub array                                                                     
            }else{
                hashMap.put(count, i);  // Add the running sum first time with its initial occurence index
            }
            
        }
        return max;
    }
}
