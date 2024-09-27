class Solution {
    public int findMaxLength(int[] nums) {
      int n = nums.length;
    int[] scoreArray = new int[n];
    int score = 0;
    for(int i = 0; i < n; i++){
        if(nums[i] == 0){
            score--;
        }else{
            score++;
        }
        scoreArray[i] = score;
    }
    
    int ans = 0;
    HashMap<Integer, Integer> lastOcc = new HashMap<>();
    lastOcc.put(0, -1);
    for(int i = 0; i < n; i++){
        int currScore = scoreArray[i];
        if(lastOcc.containsKey(currScore)){
            ans = Math.max(ans, i - lastOcc.get(currScore));
        }else{
            lastOcc.put(currScore, i);
        }
    }
    
    return ans;
}
}
