// Time Complexity :O(n) n-length of the array
// Space Complexity :O(n) 
// Did this code successfully run on Leetcode :yes 
// Any problem you faced while coding this :-
class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);// default value so that initial range (starting at 0) of contiguous subarray isn't missed
        int rsum=0;
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0) // if element is 0 then reduce running sum by 1 else increase by 1
                rsum-=1;
            else
                rsum+=1;
            if(map.containsKey(rsum)) // each sum is stored with their first occurrence index as value in the K,V pair
            {
                int length=i-map.get(rsum); // difference between start index and end index gives the range
                /* if(length==6) // If asked to return range of any particular length
                    System.out.println(map.get(rsum)+1 + "-" + i); */
                max=Math.max(max,length); // Maximum length is stored
            }else{
                map.put(rsum,i);
            }
        }
        return max;
    }
}