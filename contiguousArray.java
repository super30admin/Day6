//Time Complexity : O(n) as we have to traverse whole array
//Space Complexity : O(n) i.e. storing array elements
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

import java.util.*;

public class contiguousArray {

    public static int findMaxLength(int[] nums) {
        if(nums.length == 0 || nums == null) return 0;
        
        HashMap<Integer, Integer> map1= new HashMap<>();
        int rsum=0;
        int max=0;
        map1.put(0, -1); // 0, 1, 0, 1
        
        //{rsum, index}
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] == 1)
            {
                rsum++; //if 1 then add 1 to rsum
            }
            else{
                rsum--;  // if 0 then decrease rsum by 1 
            }
            if(map1.containsKey(rsum))  // if rsum is present in HashMap
            {
                max=Math.max(max, i- map1.get(rsum));  //find the max between existing max and (index-same rsum's index) 
            }
            else{
                map1.put(rsum, i);  //otherwise put (rsum,index) in hashmap
            }
        }
        return max;  //return max
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num= new int[] {1,0,0,0,1,1,1,0,0};

		int result=findMaxLength(num);
		System.out.println("The no. of subarrays with k is:"+ result);
	}

}
