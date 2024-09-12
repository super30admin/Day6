//Time complexity O(n)
//Space COmplexity O(n)
class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxlen = 0, count = 0;
        for(int i =0; i< nums.length; i++)
        {
            //Increment by 1 if 1 decremengt by 1 if 0
            count +=(nums[i] == 1)?1:-1;
            //Array from index 0 to i has equal number of zeros and ones
            if(count == 0)
            {
                maxlen =  i+1;
            }
            if(map.containsKey(count))
            {
                maxlen = Math.max(maxlen, i - map.get(count));
            }
            else
                map.put(count,i);
        }
        return maxlen;
    }
}