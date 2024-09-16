// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :Nil

package leetcode;

import java.util.HashMap;

class Faang18{
    public int findMaxLength(int[] nums) {
        HashMap <Integer,Integer> map =new HashMap<>();
        map.put(0,-1);
        int rSum = 0;
        int min =0;
        int len =0;
        int max = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==0){
                rSum--;
            }else{
                rSum++;
            }
            if(!map.containsKey(rSum)){
                map.put(rSum,i);
            }else{
                len = map.get(rSum)-i;
                if(len>max){max=len;}
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums ={0,1};
        Faang18 object = new Faang18();
        object.findMaxLength(nums) ;
    }
}