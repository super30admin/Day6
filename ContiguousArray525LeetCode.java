//time complexity : O(n) n=length of nums
//space complexity ; O(1)
//I don't face any problems
//runs successfully on leetcode




import java.util.HashMap;
import java.util.Map;

public class ContiguousArray525LeetCode {

    public int findMaxLength(int[] nums) {
        int maxLength = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();            //creating hashmap
        map.put(0 , -1);                                        //put 0 as key -1 as value to get the length
        for(int i = 0; i<nums.length; i++){
            sum += (nums[i]==0 ? -1 : 1);                       //calculate cumulative sum take 0 as -1 and 1 as 1
            if(map.containsKey(sum - 0)){                       //calculate if sum is present in map or not
                maxLength = Math.max(maxLength, i-map.get(sum));    //calculate maxlength
            }
            else{
                map.put(sum, i);                            //if sum not present in the map, put sum and index in the map
            }
        }
        return maxLength;
    }

}
