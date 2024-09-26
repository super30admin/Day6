//Problem: 560. Subarray Sum Equals K
/** 3 Pointer Approcach: 
 * Used cumulative sum approach with a Hashmap.
 * Our aim is to find CurrentCumulative - TARGT =  PreviousCumultiveSums occurances.
 * We will keep track of all all cumulatives occurances in HashMap and increase the count if encountered again.
 * We will take the count value for cumulative value for which -> CurrentCumulative - TARGT =  PreviousCumultiveSums exist. 
 * 
 * Intituion: 
 * 1. We can compute the cumulative sum of all previous values and current element, at each element of array.
 * 2. In case the{ {Cumulative Sum - TARGET} exist in HashMap - implies that from that element to current element TARGET K is added.
 * 3. We need to icrease count for all occurance of each unique sum value in HashMap as value.
 * 4. We will also enter a 0 entry with 1 index in HashMap to tackle 0.
 */ 
//
//time Complexity :
// O(N)

// Space Complexity :
// O(N)

// Did this code successfully run on Leetcode : YES.
// Any problem you faced while coding this : YES, it took time to comprehand & visualoze it in depth. 
//I am able to understand it gradulay but still not confident of getting it intutively in interviews.


public class Problem1_cumulativesum {
    public int subarraySum(int[] nums, int k) {
    
        Map<Integer, Integer> map = new HashMap();
        int sum = 0;
        int cumulative = 0;
        
        map.put(0,1);
        
        for(int n : nums){
          cumulative += n;
          sum += map.getOrDefault(cumulative-k, 0);
          map.put(cumulative, map.getOrDefault(cumulative, 0) + 1);
        }
        
        
        return sum;
    }
}