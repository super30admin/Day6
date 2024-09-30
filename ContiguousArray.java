// We will be using a Hashmap to store all the running sum of each index in the array of binary numbers. We will adding -1 when we encouter a zero and 1 when we see a one. While finding the running sums if we find the same running sum to be present in the we will find the difference between indices of the current rsum and the one that is already present in the array and then update the maxlength appropriately. 

// Time complexity: O(n)
// Space Complexity: O(n).

import java.util.HashMap;

public class ContiguousArray {
    public int findMaxLength(int[] nums) {
        if(nums.length<=1 || nums == null) return 0;
        
        //logic
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxLength = 0;
        int rSum = 0;
        map.put(0,-1); 
        for(int i= 0; i< nums.length; i++){
            if(nums[i] == 0){
                rSum -= 1;
            } else rSum +=1;
            if(!map.containsKey(rSum)){
                map.put(rSum, i);
            } else {
                maxLength = Math.max(i - map.get(rSum), maxLength);
            }
        
    }
    return maxLength;
        
    }
}
