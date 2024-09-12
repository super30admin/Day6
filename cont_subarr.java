import java.util.*;
class Solp {
    public int findMaxLength(int[] nums) {
        /*
        Time complexity: O(n)
        Space complexity: O(n)
        */
        
        // initialize a hashmap
        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
        // initially max_len and curr_sum will be 0
        int max_len = 0;
        int currsum = 0;
        
        // traverse the nums array
        for(int x = 0; x < nums.length; x ++) {
            // if the value in the array is 0 then increment currsum by 1
            if (nums[x] == 0){
                currsum += 1;
            }
            // if the value in the array is 1 then decrement currsum by 1
            else {
                currsum -= 1;
            }
            // initial value in the hashmap will 0 for currsum and start index will be at -1
            hmap.put(0, -1);
            
            // check if the currsum is present in hashmap
            if (hmap.containsKey(currsum)) {
                // start index will be the value for that currsum key
                int start = hmap.get(currsum);
                // end will be current index of the element
                int end = x;
                
                // update the max_len if the new length is greater than the prev max_len value
                max_len = Math.max(max_len, end - start);
                
            }
            else {
                // if the currsum value is not present in hmao then add that value to the hashmap
                hmap.put(currsum, x);
            }
            
            
            
        }
        // return the max_len as the solution
        return max_len;
        
    }

    public static void main(String[] args) {
        Solp solution = new Solp();
        int[] arr = {1,1,1,0,1,0,0};
        System.out.println(solution.findMaxLength(arr));
    }
}