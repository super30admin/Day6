import java.util.HashMap;

class SubarraySumEqualK {

    //Time Complexty: 0(n)
    //Space Complexity:0(n)
    //Did it successfully run on leetcode : Yes
    //Did you face any problems while coding: No
    //In short, explain your approach: I am calculating the running sum of at each iteration of the hashmap. Also keeping
    //a total variable to store each subarray that is equal to k. So, If rsum - k is present in the hashmap(as it indicates
    // if the value has been encountered previously in the hashmap, then the sum from that index to current index is 7 which
    // is our target), I am increasing the value of total by the value of the running sum's key's value. Then I am checking if
    //running sum is present in the hashmap or not. If it is, then updating the previous value of the running sum by 1 and if
    //not then adding the running sum as key and its occurence i.e. 1 as value

    public int subarraySum(int[] nums, int k) {
        if(nums.length == 0 || nums == null){
            return 0;
        }
        int rsum = 0;
        int total = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i = 0; i < nums.length; i++){
            rsum = rsum + nums[i];
            if(map.containsKey(rsum - k)){
                total = total + map.get(rsum-k);
            }
            if(map.containsKey(rsum)){
                map.put(rsum, map.get(rsum)+1);
            }
            else{
                map.put(rsum, 1);
            }
        }
        return total;
    }
}