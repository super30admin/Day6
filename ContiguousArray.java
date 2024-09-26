package S30.Hashing_2;

// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

import java.util.HashMap;

public class ContiguousArray {

    //Finding the max length subarray
    public int findMaxLength(int[] nums) {
        if(nums == null || nums.length == 0) return 0;

        HashMap<Integer,Integer> map = new HashMap<>();
        int maxLen = 0;
        int prefixSum = 0;
        map.put(0,-1); // handle edge scenario to account for initial array starting from 0
        for(int i = 0; i < nums.length; i++){
            prefixSum = nums[i] == 0 ? prefixSum-1 : prefixSum+1;
            if(map.containsKey(prefixSum)){
                maxLen = Math.max(maxLen, i - map.get(prefixSum));
            }else{
                map.put(prefixSum,i);
            }

        }

        return maxLen;
    }

    //Follow up: Printing the longest contiguous array
    public void printMaxContiguousArray(int[] nums) {
        if(nums == null || nums.length == 0) return;

        HashMap<Integer,Integer> map = new HashMap<>();
        int maxLen = 0;
        int startIdx = -1;
        int endIdx = -1;
        int prefixSum = 0;
        map.put(0,-1); // handle edge scenario to account for initial array starting from 0
        for(int i = 0; i < nums.length; i++){
            prefixSum = nums[i] == 0 ? prefixSum-1 : prefixSum+1;
            if(map.containsKey(prefixSum)){
                if(i - map.get(prefixSum) > maxLen){
                    maxLen = i - map.get(prefixSum);
                    startIdx = map.get(prefixSum)+1;
                    endIdx = i;
                }

            }else{
                map.put(prefixSum,i);
            }

        }

        System.out.print("Array: [ ");
        for(int j = startIdx; j <= endIdx; j++){
            System.out.print(nums[j] + " ");
        }
        System.out.print("]");

    }

    public static void main(String[] args) {
        ContiguousArray test = new ContiguousArray();
        System.out.println(test.findMaxLength(new int[]{0,1,1,0,0,1,1}));

        test.printMaxContiguousArray(new int[]{0,1,1,0,0,1,1});
    }
}
