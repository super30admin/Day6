//Time Complexity:O(N)
//Space Complexity:O(N)
//In this problem, the count variable is incremented by 1 if 1 is encountered or incremented by -1 if 0 is encountered. If the count is already present in the hashmap, then maxlen is calculated to be the max value between the maxlen and the different between the index where the count was again encountered and the index when it was encountered previously. If the count is not present, it is added to the map along with the index. If count becomes 0 we will take the max length to be that index where it becomes 0 +1. 
//This code was successfully executed and got accepted in leetcode.


class Solution {
    public int findMaxLength(int[] nums) {
       int maxlen=0,count=0;
       HashMap<Integer,Integer> h=new HashMap<>();
       for(int i=0;i<nums.length;i++){
           count+=(nums[i]==1)?1:-1;
           if(count==0){
               maxlen=i+1;
           }
           if(h.containsKey(count)){
               maxlen=Math.max(maxlen,i-h.get(count));
           }
           else{
               h.put(count,i);
           }
                   
       }
       return maxlen;
    }
}