//tc  O(n)
//sc  O(n)

class Solution {
    public int findMaxLength(int[] nums) {
        
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(0,-1);
        int sum = 0;
        int maxlen = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                sum = sum + (-1);
            }
            else if(nums[i]==1){
                sum = sum + 1;
            }
            
            if(hashMap.containsKey(sum-0)){
                maxlen = Math.max(maxlen, i-(hashMap.get(sum-0)));
            }
          hashMap.putIfAbsent(sum, i);
            
        }
        return maxlen;
         
    }
}