
// Time Complexity :O(1)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach

class ContiguousArray {

    public int findMaxLength(int[] nums) {
        
        HashMap<Integer, Integer> map = new HashMap<>(); //As I have search so I used HashMap
        int rSum = 0; int max = 0;
        map.put(0,-1);
        int start = 0; int end = 0;
        for(int i =0; i<nums.length;i++){
            if(nums[i]==0) rSum--;
            else rSum++;
            if(map.containsKey(rSum)){
                max = Math.max(max, i-map.get(rSum));
            }
            else{
                map.put(rSum,i);
            }
        }
            
    return max;
    
}
}
        

        
    