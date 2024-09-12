import java.util.HashMap;
/**
 * Time: O(n)
 * Space: O(n) //When all values are equal
 * LeetCode Accepted: Yes
 * Problems faced: Understanding the algorithm took sometime
 */
public class ContiguousArray {
	public static int findMaxLength(int[] nums) {
        int max=0, counter=0;
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        //Increment counter by 1 if ele is 1
        //Decrement counter by 1 if ele is 0
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1){
                counter++;
            } else {
                counter--;
            }
            //Counter becomes zero when there are equal number of 0s and 1s in the array until that particular index staring from the first
            if(counter == 0){
                max = i+1;
            }
            //HashMap stores the counter that occurred for the first time and its index
            //When the same counter is encountered again the diff value gives the longest length of array
            if(!hm.containsKey(counter)){
                hm.put(counter, i);
            } else {
                max = Math.max(i-hm.get(counter), max);
            }
            
        }
        return max;
    }
	public static void main(String[] args) {
		int[] nums = {1,0,0};
		System.out.println(findMaxLength(nums));
	}

}
