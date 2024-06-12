/*
Time Complexity: O(n)
Space Complexity: O(n)
*/
import java.util.HashMap;
class Solution {
    public int subarraySum(int[] nums, int k) {
    HashMap<Integer,Integer> a=new HashMap<Integer,Integer>();
    if(nums.length==1){
        if(nums[0]!=0&&k==0){
            return 0;
        }
    }
    a.put(0,1);
    int sum=0;
    int presentvalue;
    int count=0;
    for(int i=0;i<nums.length;i++){
    presentvalue=nums[i];
    sum=sum+presentvalue;
    if(a.containsKey(sum-k)){
    count=count+a.get(sum-k);
    }
    if(a.containsKey(sum)){
    a.put(sum,(a.get(sum)+1));
    }
    else{
    a.put(sum,1);
    }
    }
    return count;
    }
}