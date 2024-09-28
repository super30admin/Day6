// Time Complexity :O(N) where n is the length of the string
// Space Complexity :O(N) 
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach:Stored the sum of the elements as we traverse the array as key and 
//the numberof times it occurs as value in a hashmap. As we traverse the array, check if the sum-k value is present as key in the hashmap, if it is present add its
// occurences to the count. return the count.



class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums==null||nums.length==0)
            return 0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int countOfArrays=0;int sum=0;
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];            
            if(map.containsKey(sum-k))
                countOfArrays+=map.get(sum-k);
            if(map.containsKey(sum))
                map.put(sum,map.get(sum)+1);
            else
                map.put(sum,1);
        }
        return countOfArrays;
    }
}