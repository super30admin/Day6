    //Time Complexity - O(n)
//Space Complexiity - O(n)
//Did it run on leetcode -yes
//Did you face any problem?-
//  Intially I wasn't able to figure the base condn of storing in hashmap

class Solution {
    public int findMaxLength(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;
        int sum = 0;
        int maxLength = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                sum+=-1;
            }
            else{
                sum+=1;
            }

            if(!map.containsKey(sum))
                map.put(sum,i);
            else
                  maxLength = Math.max(maxLength,i- map.get(sum));
             
        }
        return maxLength;
        
 }
}  