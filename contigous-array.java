//running sum pattern is used
//Time Complexity: O(n), where n is the length of the array nums
//Space Complexity: O(n)
//running on leetcode: yes
class Solution {
    public int findMaxLength(int[] nums) {
        //base case
        if (nums==null || nums.length==0)
        {
            return 0;
        }
        //take a variable count, ++1 at every 1 and --1 at every 0
        int count = 0;
        //length of contigous array, return variable
        int max=0;
        //key is the count and value is the corresponding index
        HashMap<Integer, Integer> map= new HashMap<>();
        //count is 0 for the index -1
        map.put(0,-1);
        for (int i=0; i < nums.length; i++)
        {
            if (nums[i]==0)
            {
                count--;
            }
            else//if nums[i]==1
            {
                count++;
            }
            //map Doesn't contain the key count
            if (!map.containsKey(count))
            {
                //add the cound and the index
                map.put(count, i);
            }
            else
            {
                //map contains the count key
                //take the previous index on which the same count value was entered
                //subtract it from the current index (i)
                //compare previous max and difference calculated and update to the greater value
                max = Math.max(max, (i-map.get(count)));
            }
        }
            return max;                   
    }
}
