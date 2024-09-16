// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :Nil


package leetcode;
import java.util.HashMap;


//to count the number of sub array
public class Faang17 {
    public int subarraySum(int[] nums, int k) {
    HashMap <Integer,Integer> map =new HashMap<>();
    map.put(0,1);
    int rSum = 0;
    int count =0;

    for(int i = 0;i<nums.length;i++){
        rSum = rSum + nums[i];
        if(map.containsKey(rSum-k)){
            count = count + map.get(rSum-k);
        }
        map.put(rSum, map.getOrDefault(rSum,0)+1);
    }
    return count;
}
    public static void main(String[] args) {
        int[] nums ={1,2};
        Faang17 object = new Faang17();
        int k=1;
        System.out.println(object.subarraySum(nums,k)) ;
    }
}
