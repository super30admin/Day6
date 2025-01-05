import java.util.HashMap;

//TC = O(n)
//SC = O(n)
//Calcute the max length of contiguous subarray
class contiguousArray {
    public int findMaxLength(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int max = 0;
        HashMap<Integer,Integer> map = new HashMap<> ();
        int rSum = 0;
        map.put(0,-1);
        for(int i = 0;i<nums.length;i++){
            //if you encounter 0 then add -1 to rsum 1 if encounter 1
            if(nums[i] == 0){
                rSum--;
            }
            else if(nums[i] == 1){
                rSum++;
            }
            //if the map already have the rsum calcute the max of rsum you encounter at present index to the first encountered rsum which will get the max length.
            if(map.containsKey(rSum)){
                max = Math.max(max,(i-map.get(rSum)));
            }
            else{
                map.put(rSum,i);
            }
        }
        return max;
    }
}