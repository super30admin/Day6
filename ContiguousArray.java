import java.util.HashMap;

class Solution {

    //Time Complexty: 0(n)
    //Space Complexity:0(n)
    //Did it successfully run on leetcode : Yes
    //Did you face any problems while coding: No
    //In short, explain your approach: I am using the concept og running sum to solve this problem. I have declared a hashmap
    //to store the sum of the particular index and the index of the 1st occurence. Hence if the count is encountered along the
    //traversal of the array, then i check if its present in the hashmap or not. If it is, then i check the distance from
    //current index to the 1st occurence is greater than the initial max subarray or not. If it is, update the max subarray
    //and then move forward. If the count is not present in my hashmap, then I go ahead and add the count along with it's index
    //in my hashmap

    public int findMaxLength(int[] nums) {
        if(nums == null || nums.length == 0){
            return -1;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int count = 0;
        map.put(0 , -1);
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                count--;
            }
            else{
                count++;
            }
            if(map.containsKey(count)){
                max = Math.max(max , i - map.get(count));
            }
            else{
                map.put(count , i);
            }
        }
        return max;
    }
}