/**
 Approach: Using running sum and a hash map

 Working:
 Adding map.put(0, -1) for handling edge case
 Calculate the running sum in the array if encountered 0 add -1, if encountered 1 add 1
 check if the map contains the running sum in the map
 determine the max with current max and the current seen index minus last seen index
 else // not found in hash map
 add rsum as key and the current index as value
 return max


 Time Complexity: O(n)
 Space Complexity: O(n) //worst case if the all the values in the array it one with no rsum repeats

 */

class ContiguousArray {
    public int findMaxLength(int[] nums) {

        int sum = 0;
        int max = 0;
        HashMap<Integer, Integer>  map = new HashMap<>();
        map.put(sum, -1);
        for(int i=0;i< nums.length; i++) {

            sum+= (nums[i] == 1?1:-1);

            if(map.containsKey(sum)) {

                int index = map.get(sum);
                int len = i-index;

                if(len>max) {
                    max = len;
                }
            }else {
                map.put(sum, i);
            }

        }
        return max;
    }
}