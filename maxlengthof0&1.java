//Time complexity - O(N)+(O(N)-worst case)
//Space complexity O(1);
//Assume max as 0 initially
//Take a map and intialise the mapping  with 0:1 to cover the corner case.
//Traverse from beginning to the end by calculating the running sum at every index.
//If the map has the rsum key then check if  --value at the key rsum is greater than max. if yes max is updated
//else put the rsum key with corresponding index as a value to it in the map







class Solution {
    public int findMaxLength(int[] nums) {
        int rsum=0,max=0;
        HashMap<Integer,Integer>map = new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) rsum = rsum -1;
            else rsum=rsum+1;
            if(map.containsKey(rsum)){
                if(max<(i-map.get(rsum))) max=i-map.get(rsum);
            }
            else{
                map.put(rsum,i);
            }
        }
        return max;
    }
}