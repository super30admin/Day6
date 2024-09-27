//Problem1 (https://leetcode.com/problems/subarray-sum-equals-k/)
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :
//The concept of complement took so much time to understand.

// Your code here along with comments explaining your approach

import java.util.*;

public class SubArraySum {
    public int bruteForceFindSubArray(int[] array, int target) {
        int count = 0;
        for(int i=0;i<array.length;i++) {
            for(int j=i+1;j<array.length;j++){
                int sum =0;
                for(int k=i; k<j;k++){
                    sum += array[k];
                }
                if(sum == target) {
                    count++;
                }
            }
        }
        return count;
    }

    public int findSubArray(int[] array, int target) {
        int count = 0;
        int sum = 0;
        HashMap <Integer, Integer> differences = new HashMap <Integer, Integer> ();
        for(int i=0;i<array.length;i++) {
            sum += array[i]; //Increment the sum by traversing the each element
            if(target ==sum){ // if the element is same as the target. it is an individual array and we need to increment.
                count++;
            }
            int difference = sum - target; //If the difference existing in the map, we know the sum of those values would be target. So incrementing.
            if(differences.containsKey(difference)) {
                count += differences.get(difference);
            }
            int sumExistingValue = differences.getOrDefault(sum, 0);
            differences.put(sum,sumExistingValue+1);
        }
        return count;
    }

    public static void main(String [] args) {
        int[] array = new int[]{1,1,1};
        SubArraySum subArraySum = new SubArraySum();
        int subArrayCount = subArraySum.findSubArray(array, 2);
        System.out.println(subArrayCount);
    }

}

