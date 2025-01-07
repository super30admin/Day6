import java.util.HashMap;

public class ContiguousArray {
    //time complexity: O(n)
    //space complexity: O(n)
    public int findMaxLength(int[] nums) {
    HashMap <Integer, Integer> map = new HashMap<>();
    map.put (0,-1);
    int max = 0;
    int[] rSum = new int[nums.length];
        int sum =0;
        for (int i = 0;i< nums.length; i++){
             rSum[i] =  (nums[i] ==0)?--sum : ++sum;
            if (!map.containsKey(rSum[i])){
                map.put(rSum[i], i);
            } else {
                max = Math.max(max, i - map.get(rSum[i]));
            }
    }  

    return max;  
    }
    public static void main(String[] args) {
        ContiguousArray ca = new ContiguousArray();
        System.out.println(ca.findMaxLength(new int[]{1,1,0,0,1,1,0}));
    }
}
