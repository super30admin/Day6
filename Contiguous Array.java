// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Create a HashMap with entry (-1,0). Update the array with the recurring sums
// and iterate over the array and for every element check if it is present in 
// HashMap and if yes then find the distance between both indices and Update
// length if length is less than the distance. If element is not present in 
// HashMap then add it to the HashMap with respective index. Finally return the
// length

class Solution {
    HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();
    public int findMaxLength(int[] nums) {
        m.put(0,-1);
        int sum = 0;
        int length = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                sum += -1;
            }
            sum += nums[i];
            nums[i] = sum;
        }
        for(int j=0;j<nums.length;j++){
            if(m.containsKey(nums[j])){
                if(length < j-m.get(nums[j])){
                    length = j-m.get(nums[j]);
                }
            }
            else{
                m.put(nums[j],j);
            }
        }
        return length;
    }
}