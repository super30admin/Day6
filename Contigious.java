//Time complexity : O(n)
//Space Complexity : O(n)
// Did the code run in leetcode : yes

class Contigious {
    public int findMaxLength(int[] nums) {
        if(nums.length == 0 || nums == null || nums.length ==1){
            return 0;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int max =  0;
        int rsum = 0;
        map.put(0,-1);
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                rsum--;
            }
            else if(nums[i] == 1){
                rsum++;
            }
            if(map.containsKey(rsum)){
                max = Math.max(max , (i-map.get(rsum)));
            }
            else{
                map.put(rsum,i);
            }
        }
        return max;
    }
}