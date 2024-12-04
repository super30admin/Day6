//idea is based on running sum x is sum1, y is sum2, z is total sum z = x+y, so y = z-x, meaning if at any point in time
//running sum is already there means y = z-x that means y array is balanced equal no. of 0 and 1, using hashmap to 
//keep track of inital index of rsum to find max len.
//tc- O(n) sc- O(n)
class Solution {
    public int findMaxLength(int[] nums) {

        if(nums == null || nums.length <= 1) return 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        //map.put(0,-1);//runningsum : earliest index for edge case of [0101] initially making rsum 0, so that id we
        // find 0 rSum in future, that is whole contiguous arrat till 0 so curr index -1 would be max length

        int rSum = 0;
        int max = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0) rSum--;//calculating rsum if 0 -1
            else{
                rSum++;// if 1 plus 1
            }
            if(rSum == 0) max = i+1;//alternative for map.put(0,-1);
            if(map.containsKey(rSum)){
                max = Math.max(max, i - map.get(rSum));//calculating max len substracting rsum initial index from curr i
            }else{
                map.put(rSum, i);//if not hashmap already put the initial index
            }
        }
        return max;

    }
}