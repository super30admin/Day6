// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
class Problem2 {
    public static void main(String args[]) {
        int[] nums = new int[0,1,1,0,1,0];
        //Create a Hashmap to store the running sum with least index where the sum was encountered
        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
        //this is an edge case to handle first sub array i.e first two elements
        map.put(0,-1);
        int max = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            // the running sum is calculated based on 0 and 1s
            if (nums[i] == 0){
                sum-=1;
            }
            else {
                 
                sum +=1;
            }
            
            if(map.containsKey(sum)) {
                // if the sum was encountered previously, then try to calculate the difference between the index when it
                // was first encountered vs the present index. The current max value is compared to store the max object.
                max = Math.max(max, i - map.get(sum));
            }
            else {
                // if sum was not encountered then store it in HashMap
                 map.put(sum,i);
            }
        }
        System.out.println(max);
    }
}