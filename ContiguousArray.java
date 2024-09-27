import java.util.*;
// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class ContiguousArray{
    public static void main(String[] args){
        ContiguousArray ca = new ContiguousArray();
        int[] ar={1,0,0,1,1,0,1};
        int result=ca.findMaxLength(ar);
        System.out.print("Result: " +result);
    }
    public int findMaxLength(int[] nums) {
        int sum=0;
        int length=0;
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();//for storing the respective sums and indices
        for(int i=0;i<nums.length;i++){
            //adding -1 for 1 and +1 for 0 to sum
            if(nums[i]==1) sum+=-1;
            if(nums[i]==0) sum+=1;
            if(sum==0) length = i+1;//that means equal 0's and 1's from the starting of the array and hence length = index+1
            if(hm.containsKey(sum)){
                length = Math.max(i-hm.get(sum),length);//finding the previous occurance of the sum mean from then we have equal 0's and 1's and hence find the path.
            }else{
                hm.put(sum,i);//if not found put in the map for the reference
            }

        }
        return length;//returning max length
    }
}