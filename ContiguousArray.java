class Solution {
    public int findMaxLength(int[] nums) {
        int maxlen =0;
        int currsum = 0;
        HashMap<Integer, Integer> hmap = new HashMap<>();
        hmap.put(0,-1);
        for(int x=0; x<nums.length; x++){
            if(nums[x] ==0){
                currsum +=1;
            }
            else
                currsum -=1;
            if(hmap.containsKey(currsum)){
                maxlen = Math.max(maxlen, x- hmap.get(currsum));
            }else
            {
                hmap.put(currsum, x);
            }
        }
        return maxlen;
        
    }
}

//TC:O(n)
//SC:O(n)
