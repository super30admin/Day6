Applications			Library
Binary-Search-2			Movies
CLionProjects			Music
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int sum=0;
        int count=0;
        if(nums.length<1) return 0;
        else if(nums.length==1){
            if(nums[0]==k)  return k ;
            else return 0;
        }

        for(int i=0;i<nums.length;i++){
            sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                if(sum==k)  count++;
            }
        }
        return count;
    }
}
