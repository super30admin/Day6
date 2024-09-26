//Time complexity is O(n2)
//Space complexity is O(n)
//able to submit the code in leetcode
class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int[] sum = new int[n+1];
        for(int i=0;i<n;i++){
            sum[i+1]=sum[i]+nums[i];
        }
        int result = 0;
        for(int i=0;i<n;i++){
            for(int j= n-1;j>=i;j--){
                if((sum[j+1]-sum[i])==k)
                {
                    result = result+1;
                }
            }
        }
        return result;
    }
}
