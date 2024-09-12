//Regular O(n^2) approach;

class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0; 
        int newSum=0;
        for(int i=0;i<nums.length;i++){
            newSum=nums[i];
            if(newSum==k){
                count=count+1;
            }
            for(int j=i+1;j<nums.length;j++){
                newSum=newSum+nums[j];
                if(newSum==k){
                    count=count+1;
                }else if(newSum<k || newSum>k){
                    continue;   //any contnue/break will not work;
                }
            } 
        }
        return count;
    }
}
