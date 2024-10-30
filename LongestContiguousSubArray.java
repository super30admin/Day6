// Time Complexity : O(n)
// Space Complexity : O(n) 
// Approach : Maintain a hashmap of rsum as key and value as index where you got that runningSum. If you come across the same running sum at other index that means elements // between current index and the old index can form contiguous array and difference between these indices is length of the subarray. 
class Solution {
    public int findMaxLength(int[] nums) {
       int length = 0;
       int rSum = 0;
       HashMap<Integer,Integer> map = new HashMap<>();
       int start=0;
       int end=0;
       map.put(0,-1);
       // [0,1,0] nums [0,1]
       // [-1,0,0] rsum [-1,0]
       // [0,1,2] index [0,1]
       for(int i =0;i<nums.length;i++){
            rSum+=(nums[i]==1)? 1:-1; // -1 0 -1 --- -1 0
            if(map.containsKey(rSum)){
                if(length < i-map.get(rSum)){
                    length = Math.max(length, i-map.get(rSum)); // 2-0 = 2 --- // 1-(-1) = 2
                    start = map.get(rSum) + 1;
                    end=i;
                }

            } else{
                map.put(rSum,i); // {-1:0,0:1 } {0:-1,-1:0}
            }
       } 
       System.out.println(start + " " + end);

       return length;
    }
}

// Brute Force
// Time Complexity : O(n*2)
// Space Complexity : O(1) # only two variables Zeros and Ones
// Approach : BruteForce Approach with time limit exceeded.
class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        int maxLength = 0;
        // outerloop
        for (int start = 0; start<n;start++){
            int countZero = 0;
            int countOne = 0;
            // Inner Loop
            for (int end = start;end<n;end++){
                // count zero's and one's
                if(nums[end] == 0){
                    countZero++;
                } else if (nums[end]==1){
                    countOne++;
                }

                if(countZero == countOne){
                    int currentLength = end-start+1;
                    maxLength = Math.max(maxLength,currentLength);
                }
            }
        }
        return maxLength;
    }
}