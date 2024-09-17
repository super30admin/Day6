import java.util.HashMap;
//Time Complexity : O(n)
//Space Complexity : O(n) where n=length of the array
// Run Successfully on LeetCode
// Problems : Understanding the edge case : 0 on -1st index

/*
Here we will be storing the value of aggregate sum in hashmap with its index
If that sum repeated somewhere in the array, the difference of last occurence and
current occurence will be the size of the array we need which is equal number of 0s and 1s
 */


public class Hashing_2_Problem_2_ContiguousArray {
    public static int findMaxLength(int[] nums) {
        if(nums==null || nums.length ==0) return 0;
        int maxCount = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,-1);
        int runningSum = 0;
        for(int i=0; i < nums.length ; i++)
        {
            int toAdd = (nums[i]==0) ? -1 : 1;
            runningSum +=toAdd;
            if(hm.containsKey(runningSum))
            {
                maxCount = Math.max(i - hm.get(runningSum),maxCount);
            }
            else
            {
                hm.put(runningSum,i);
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,0,1};
        System.out.println(findMaxLength(arr));
    }
}
