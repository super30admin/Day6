import java.util.*;
// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class SubarraySum{
    public static void main(String[] args){
        SubarraySum sa = new SubarraySum();
        int[] ar={1,0,0,1,1,0,1};
        int result=sa.subarraySum(ar,3);
        System.out.print("Result: " +result);
    }
    public int subarraySum(int[] nums, int k) {

        int sum=0;
        int count=0;
        /*Calculate sums > at each sum find the complement > if complement exists in hm take that count and add to existing count > if sum exists in hm increase the no. of subarrays else add that new sum > return count*/
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();//for storing respective sums and their no. of subarrays
        hm.put(0,1);//for 0 subarray
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];//adding all numbers
            int complement = sum-k;//finding the complement to know how much is needed to reach k
            if(hm.containsKey(complement)){
                count+=hm.get(complement);
            }
            if(!hm.containsKey(sum)){
                hm.put(sum,1);//updating the map with the first occurance of the sum.
            }
            else{
                hm.put(sum,hm.get(sum)+1);//updating the map with the next occurance of sum
            }
        }
        return count;
    }
}