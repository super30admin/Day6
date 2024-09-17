/*Algorithm:
    1. Traverse through the array of nums, if the number is 1 then increment count by 1 else decrement count by 1;
    2. If the count element is already in the hashmap, then assign length the max of previous length and index of the element in array - value paired with count key.
    3. If the count is not there in the hashmap, add it to the hashmap with count as key and index as i.
    
    Time Complexity: O(n);
    Space Complexity: O(n)
    
    Did the code run successfully on leetcode? Yes

*/

class Solution {
    public int findMaxLength(int[] nums) {
        int count =0;
        int length = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int i=0;
        for(int num: nums){
            if(num==1)
                count++;
            else
                count--;
            if(map.containsKey(count)){
                length = Math.max(length, i - map.get(count));
            }
            else{
                map.put(count,i);
            }
            i++;
        }
        return length;
    }
}