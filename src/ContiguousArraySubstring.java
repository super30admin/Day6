// Time Complexity:     O(n)
// Space Complexity:    O(n)
// where n is length of given array
// Yes, this code ran successfully
// No, I didn't face any problem in this problem statement

import java.util.Map;
import java.util.HashMap;

public class ContiguousArraySubstring
{
    public static void main(String[] args) {

        int[] arr ={0,1,0};
        FindSubArr fs = new FindSubArr();
        System.out.println(fs.findMaxLength(arr));
    }
}
class FindSubArr {
    public int findMaxLength(int[] nums) {
        int length = 0 ;
        int sum = 0 ;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);                                                  // adding intial key, value pair

        for (int i=0; i<nums.length; i++)
        {
            sum += nums[i]==0 ? -1 : 1;                                 // maintaining sum of array elements
            if(map.containsKey(sum))
                length = Math.max(length, i-map.get(sum));              // updating length accordingly
            else
                map.put(sum, i);                                        // if map doesn't contain sum, index pair then adding it
        }
        return length;
    }
}