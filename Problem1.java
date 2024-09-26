// Idea is to keep running sum as key & # of times we got that sum as value in hashmap
// if running sum - given k is found as count, we increment count by 1
// return total count
// time complexity: O(n) where n number of integers in array

class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> myCuSum = new HashMap();
        int myCuCount = 0;
        
        myCuSum.put(0, 1);
        int runSum = 0;

        for (int index=0; index < nums.length; index++) {
            
            runSum = runSum + nums[index];
            int val = runSum - k;
            
            if (myCuSum.containsKey(val)) {
                myCuCount += myCuSum.get(val);
            } 
            
            if (myCuSum.containsKey(runSum)) {
                myCuSum.put(runSum, myCuSum.get(runSum)+1);
            } else {
                myCuSum.put(runSum, 1);
            }
        }
        return myCuCount;
    }
}
