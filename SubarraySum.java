// Time Complexity : O(n) n is the no of elements in the array
// Space Complexity : O(n) storing the elements in the hashmap
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
It is based on the fact that
if sum at two different points in the array differ by the target,
then it can be inferred that the count of the elements in the middle is equal to the target
 */

class SubarraySum {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int sum=0;
        int count=0;
        for(int num:nums){
            sum=sum+num;
            if(map.containsKey(sum-k)){
                count=count+map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
