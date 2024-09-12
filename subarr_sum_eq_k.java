import java.util.*;
class Sol {
    public int subarraySum(int[] nums, int k) {
        
        /*
        Time complexity: O(n)
        Space complextiy: O(n)
        */
        
        // initializing the hashmap
        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
        
        int count = 0;
        int currsum = 0;
        // initially when currsum is 0 there is only one sub-arr(i.e empty)
        hmap.put(0, 1);
        
        // traverse the array
        for(int x : nums) {
            // update currsum and compliment value
            currsum += x;
            int compliment = currsum - k;
            
            // check if the hashmap contains the compliment value as key
            if (hmap.containsKey(compliment)) {
                // update the count with the value for that particular key
                count += hmap.get(compliment);
            }
            // check if the hashmap contains the currsum as key
            if (hmap.containsKey(currsum)) {
                // increment the key value by 1
                hmap.put(currsum, hmap.get(currsum) + 1);
            }
            else {
                // add that currsum to the hashmap
                hmap.put(currsum, 1);
            }
        }
        // return the total count
        return count;
    }

    public static void main(String[] args) {
        Sol solution = new Sol();
        int[] arr = {1,1,1};
        System.out.println(solution.subarraySum(arr, 2));
    }
}