
/**
Leet Code Submitted : YES
Time Complexity : O(N)
Space Complexity : O(1)

The idea is to keep track (count) of number of 1's and 0's at each position in HashMap. Since, we want MAX sub-array using runLength we update if its less than current max count.
This idea is tricky and needs little practice and understanding.
**/

class Solution {
    public int findMaxLength(int[] nums) {
     
        int runLength = 0;
        int count = 0;
        
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,-1);
        
        for(int i = 0; i< nums.length; i++){
            if(nums[i] == 1)
                count = count + 1;
            else
                count = count - 1;
            if(hm.containsKey(count)){
                if(runLength < (i-hm.get(count)) ){
                    runLength = i - hm.get(count);
                }
            }else{
                hm.put(count,i);
            }
        }
        
        return runLength;
    }
}

