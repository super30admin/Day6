// Time Complexity :o(n).
// Space Complexity :0(n).
// Did this code successfully run on Leetcode :failed at egde cases.
// Any problem you faced while coding this :yes, at edge casess. or when array length is 3.


// Your code here along with comments explaining your approach;-storing in hashmap and checking consequitive places for alterante 0s and 1s and updating counter variable for 0 and counter varible for1 and after while loop returning counter1+counter2.








import java.util.HashMap;
import java.util.ArrayList;
class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> a=new HashMap<>();
        ArrayList<Integer> List=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            a.put(i,nums[i]);
        }
        
        int counter1=0;
        int counter2=0;
        int j=0;
        if(nums.length==2){
            if(((a.get(0)==0)&&(a.get(1)==1))||((a.get(0)==1)&&(a.get(1)==0))){
                return 2;
            }
        }
        while(j<nums.length-1){
            if(((a.get(j)==0)&&(a.get(j+1)==0))||((a.get(j)==1)&&(a.get(j+1)==0))){
                counter1=counter1+1;
                counter2=counter2+1;
            }
            j=j+1;
            
        }
        int x=counter1+counter2;
    return x;}
}