//Algo: using running sum of array
//TC:O(N)
//SC:O(N) HashMap length

public class Solution {
    public int SubarraySum(int[] nums, int k) {
        int rSum = 0;
        int count = 0;
        Dictionary<int,int> map = new Dictionary<int,int>();
        map.Add(0,1);
        
        for(int i=0;i<nums.Length;i++){
            rSum+=nums[i];
            
            int targetDiff = rSum-k;
            
            if(map.ContainsKey(targetDiff)){
                count+=map[targetDiff];
            }
            
            if(!map.ContainsKey(rSum)){
                map.Add(rSum,1);
            }else{
                map[rSum]= map[rSum]+1;
            }
        }
        
        return count;
    }
}