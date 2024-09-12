// Time Complexity : O(N)
// Space Complexity :O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
public int findMaxLength(int[] nums) {
    if(nums == null || nums.length ==0) return 0; // if null then just return
    HashMap<Integer,Integer> map = new HashMap<>(); //map<rSum,Index>
    int max =0;
    int rSum=0;
    map.put(0,-1); // for edge condition like [0,1] or [0,1,1,0]
    
    for(int i=0;i<nums.length;i++){ // iterating thru the array
        if(nums[i]==1){ // creating running Sum
            rSum++; // if equal to 1 then increase by 1
        }else {
            rSum--; // if equal to 0 then decrease by 1
        }
        if(map.containsKey(rSum)){ // if the maps contains the rSum then finding the max
            max = Math.max(max, i - map.get(rSum));
        } else {
            map.put(rSum,i); // if map doesn't contains the rSum then updating it in the HashMap
        }
    }
    
    return max; // returning max
}