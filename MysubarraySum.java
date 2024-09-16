import java.util.HashMap;

/*******
## Problem1 (https://leetcode.com/problems/subarray-sum-equals-k/)

Time Complexity :   O (n^2) 
Space Complexity :  O (n) 
Did this code successfully run on Leetcode :    Yes (560. Subarray Sum Equals K)
Any problem you faced while coding this :       No
*******/

class MysubarraySum {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int rSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        map.put(0, 1);
        
        for(int i = 0; i< nums.length; i++){
            rSum = rSum + nums[i];
            
            int sub = rSum - k;
            if(map.containsKey(sub)){
                count = count + map.get(sub);    
            }
            if(!map.containsKey(rSum)){
                map.put(rSum, 0);
            }
            map.put(rSum, map.get(rSum) + 1);
        }
        
        return count;
    }

    public static void main(String args[]) 
    { 
        MysubarraySum obj = new MysubarraySum();
        int[] nums = {1 ,1, 1};
        int k = 2;
        System.out.println(obj.subarraySum(nums, k));
    }
}
