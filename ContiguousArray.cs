//Algo: using running sum caluclation
//TC: O(N)
//SC: O(N) //HashMap Len
public class Solution {
    public int FindMaxLength(int[] nums) {
        int rSum = 0;
        int max = 0;
        
        Dictionary<int,int> map = new Dictionary<int,int>();
        map.Add(0,-1);
        for(int i=0;i<nums.Length;i++){
            rSum += nums[i] == 1 ? 1 : -1;
            
            if(map.ContainsKey(rSum)){
                int len = i - map[rSum];
                max = Math.Max(len,max);
            }else{
                map.Add(rSum,i);
            }
        }
        
        return max;
    }
}