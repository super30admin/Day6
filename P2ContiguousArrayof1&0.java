// Before Class 
// Time Complexity : O(n^3)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :No
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
// filling the array with -1 
// looping and keeping track if the sum is 0 then calculate j-i and store it in max
// due to its time complexity the code didn't got accepted due to a hude nums array

class Solution {
    public int findMaxLength(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                nums[i] = -1;
            }
        }
        int max = Integer.MIN_VALUE;
        int count = 0;
        for(int i=0;i<nums.length-1;i++){
            //System.out.println("For i : " + i);
            int current  = nums[i];
            int j = i+1;
            //System.out.println(" value of j outside :"+ j);
            while(j<nums.length){
                //System.out.println("Before :" + current);
                
                current = current + nums[j];
                if(current == 0){
                    count = j-i;
                }
                //System.out.println("Now :"+current);
                
                j++;
            }
            //System.out.println("Final Count :"+count);

            max = Math.max(count, max); 
            count = 0;
        }
        return max<=0? 0 : max+1;
    }
}

// After Class 
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
// A hashmap and running sum implementation 
// store the first occurrence of the running sum as value inside the hashmap to calculate the max subarray 

class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, -1);
        int max = 0;
        int rSum = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                rSum--;
            }else{
                rSum++;
            }
            if(hm.containsKey(rSum)){
                max = Math.max(max, i-hm.get(rSum)); 
            }else{
                hm.put(rSum, i);
            }
        }
        return max;
    }
}