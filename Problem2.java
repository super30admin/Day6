// Time Complexity :findMaxLength: O(n) , n is the number elements in array
// Space Complexity :0(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : nothing

import java.util.HashMap;

public class Problem2 {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int rSum=0;
        int length=0;
        map.put(0,-1);
        for(int i=0; i<nums.length-1;i++){
            if(nums[i]==0) rSum--;
            else rSum++;

            if(map.containsKey(rSum)){
                length=Math.max(length, i-map.get(rSum));
            }else {
                map.put(rSum,i);
            }
        }

        return length;
    }

    public static void main(String args[]) {
            Problem2 problem2 = new Problem2();
        int[] nums= new int[15];
        nums[0]=1;
        nums[1]=0;
        nums[2]=1;
        nums[3]=0;
        nums[4]=1;
        nums[5]=0;
        nums[6]=1;
        nums[7]=0;nums[11]=1;
        nums[8]=0;nums[12]=1;
        nums[9]=0;nums[13]=1;
        nums[10]=0;nums[14]=1;


        System.out.println("maximum length of contigues subarray is "+problem2.findMaxLength(nums));

    }
}
