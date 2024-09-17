/*
Time Complexity --> 
O(n) 

Space Complexity -->
O(n)

Approach -->
1. Create hashmap
2. Whenever encounter 0 decreement count by -1
3. Whenever encounter 1 increement count by 1
4. if the count value is present in the hashmap we have encountered same number of 0 and 1 so calculate the length and check if this is greatter than max_length
5. return maxlength
*/

class Solution {
    public int findMaxLength(int[] nums) {
        if (nums.length==1){
            return 0;
        }//if
        
        int count = 0;
        int max_l = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        
        for(int i=0;i<nums.length;i++){
            if (nums[i]==0){
                count-=1;
            }//if
            else{
                count+=1;
            }
            
            if(map.containsKey(count)){
                
                int val = map.get(count);
                if((i-val)>max_l){
                    max_l = (i-val);
                }
                
            }//if
            
            else{
                map.put(count, i);
            }
            
        }//for
        
        return max_l;
    }
}