// Time Complexity : O(N)
// Space Complexity : O(N)

// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
We will use sum variable, hashmap for already seen sum-value

If we get 0, sum will be reduce by 1 and if we get 1 sum will be increase by 1

If map contains current sum-value 
If so ==> Check the diffrence of last happened sum's index and current index -> WHICHEVER is larger, will become the max-length.

Otherwise we will put that new sum-value into map with current index as value

Return max-length at last

*/


class Solution2 {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int sum = 0, max = 0;
        
        map.put(0,-1);
        
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                sum += 1;
            }
            else{
                sum -= 1;
            }
            
            if(map.containsKey(sum)){
                max = Math.max(max, i - map.get(sum));
            }else{
                map.put(sum, i);
            }
        }
                               
                               
        return max;
    }
}


// public class Problem2_ContinuousArray{
//     public static void main(String[] args){

//     }
// }