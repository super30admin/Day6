/*time complexity:O(n)
Space Complexity:O(n)
*/
import java.util.*;
class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> a=new HashMap<Integer,Integer>();
        a.put(0,-1);
        int count=0;
        int maximumlength=0;
        for(int i=0;i<nums.length;i++){
        if(nums[i]==0){
            count--;
        }
        else{
         count++;
        }
        if(a.containsKey(count)) {
        if(maximumlength<(i-a.get(count))) {
        maximumlength=(i-a.get(count));	
        }
        }
        else {
        	a.put(count,i);
        }
        }
        return maximumlength;
}
}