class Solution {
    public int findMaxLength(int[] nums) {
        
        HashMap<Integer,Integer> hmap = new HashMap<>();
        int sum1 = 0,max_length = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1)
            sum1 = sum1 + nums[i];
            else
                sum1 = sum1 - 1;
            if(sum1 == 0){
                max_length = Math.max(max_length,(i-0) + 1);
            }
            else if(hmap.containsKey(sum1)){
                max_length = Math.max(max_length,(i-hmap.get(sum1)));
            }
            else{
                hmap.put(sum1,i);
            }
        }
        
        return max_length;
    }
}

// Time Complexity: O(n) We are traversing the array only once
