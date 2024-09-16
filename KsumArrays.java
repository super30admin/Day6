//Time Complexity: O(n).
//Space Complexity: O(n).
//Does this run on leetcode: Yes
//Any problem solving this question:Coming up with logic. 

//This problem can be solved using running sum technique, other than this we can think of different solution like sliding window. Key idea is the Math property. 




class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0;
        int cnt = 0;
        HashMap<Integer, Integer> kMap = new HashMap<Integer, Integer>();
        kMap.put(0,1);
            
        for(int i = 0 ; i < nums.length; i++){
            
            sum = sum + nums[i];
            
            if(kMap.containsKey(sum-k)){
                 cnt = cnt + kMap.get(sum-k);
            }
            
            if(kMap.containsKey(sum)){
                kMap.put(sum,kMap.get(sum)+1);
            }
            else{
                kMap.put(sum,1);
            }
        }
       return cnt; 
    }
}