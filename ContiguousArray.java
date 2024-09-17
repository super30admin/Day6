//time complexity : O(n) the entire array is traversed only once
//space complexity : O(n) 
//executed on leetcode : yes
//approach :  we make use of a HashMap to store the entries in the form of (sum,index. 
//We make an entry for sum in the mapmap whenever the sum is encountered first, and later on use the correspoding index to find the length of the largest subarray with equal no. of zeros and ones when the same sum is encountered again.


import java.util.*;
class contiguousArray {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int max_length = 0;
        map.put(0,-1);
        for(int i=0;i<nums.length;++i)
        {
            if(nums[i]==0) sum-=1;
            else sum+=1;
            if(!map.containsKey(sum)) map.put(sum,i);
            else max_length = Math.max(max_length,i-map.get(sum));
        }
        return max_length;
        
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,1,0,0,1,1,1,0,0,0,1,0};
        contiguousArray obj = new contiguousArray();
        System.out.println("max length of subarray with equal 0s and 1s: "+obj.findMaxLength(nums));
    }
}