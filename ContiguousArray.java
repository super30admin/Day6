// Time Complexity : O(n) - one for loop running throughout the input array
// Space Complexity : O(n) - to store running sum at every index in the Hash map
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None


// Your code here along with comments explaining your approach
import java.util.*;
class ContiguousArray {
    public int findMaxLength(int[] nums) {
        if(nums == null || nums.length == 0) return 0; //edge case if input array is empty
        int runSum = 0; 
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);   //default value in the map if running sum 0 encountered 
        for(int i = 0; i < nums.length; i++)
        {  
            if(nums[i] == 0) runSum -= 1; //if element is 0 , add -1 to the sum
            else runSum += 1; //if element is 1, add 1 to the sum
            if(!map.containsKey(runSum))
            {  //add running sum with its found index if not already present
                map.put(runSum, i);
            }
            else{
                max = Math.max(max, i - map.get(runSum));  //if running sum exists, update max value
            }
            
        }
        return max;
        }
}

//Class Main
class Main
{
    public static void main(String[] args)
    {
    ContiguousArray obj = new ContiguousArray();
    int[] input = {0,1,0};
    System.out.print("Length of the longest Subarray for the input {0,1,0} - "  + obj.findMaxLength(input) + "\n");
    }
}