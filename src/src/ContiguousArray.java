import java.util.HashMap;
import java.util.Map;

//TC : O(n) where n is the length of the string given
//SC : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

//The approach is to increment count everytime we get 1 and decrement everytime we get 0.
//So if count ==0  then it means equal number of zeroes and ones from start till that index.
//But if two indices have same count then that also implies that there are equal number of ones between them
//hence we use map to store the count --> index mapping and if we see count is already present then we get the index
//and store the length (currentIndex - map.get(count)) if it is greater than maxLength
public class ContiguousArray {

    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int maxlen = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            count = count + (nums[i] == 1 ? 1 : -1);
            if (map.containsKey(count)) {
                maxlen = Math.max(maxlen, i - map.get(count));
            } else {
                map.put(count, i);
            }
        }
        return maxlen;
    }
}
