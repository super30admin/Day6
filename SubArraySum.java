class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i<nums.length; i ++){
            for(int j = i+1; j<= nums.length; j++){
                int sum = 0;
                for (int temp = i; temp< j ; i++)
                    sum += nums[temp];
                if(sum == k)
                    count++;
            }
        }
        return count;
    }
}