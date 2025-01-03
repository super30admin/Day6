// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach


// Hashing longest palindrome

// Time complexity:O(n)
// Space complexity: constant time
class Solution {
    public int longestPalindrome(String s) {

        int max=0;
        Map<Character, Integer> count = new HashMap<Character, Integer>();
        for (int i =0;i<s.length();i++) {
            if (!count.containsKey(s.charAt(i)))  {
                count.put(s.charAt(i), 1);
            } else {
                max=max+2;
                count.remove(s.charAt(i));
            }
        }
        if (!count.isEmpty()) {
            max = max +1;
        }
        return max;
    }
}



// contiguous subarray
// Time complexity :O(n)
// Space complexity:O(n)
class Solution {
    public int findMaxLength(int[] nums) { 
        int rsum =0;
        int max = 0;
        Map<Integer, Integer> maps = new HashMap<Integer, Integer>();
        maps.put(0,-1);
        for (int i =0;i<nums.length;i++) {
            if (nums[i] == 0) {
                rsum++;
            } 
            if (nums[i] == 1) {
                rsum--;
            }
            if (!maps.containsKey(rsum)) {
                maps.put(rsum, i);
            } else {
                // difference is calculated to get the length 
                if (max < (i-maps.get(rsum))) {
                    max = (i-maps.get(rsum));
                }
            }
        }
        return max;
    }
}


// subarray sum equals k 

//Time complexity:O(n)
// Space complexity:O(n)


class Solution {
    int rsum=0;
    int count=0;
    Map<Integer,Integer> mapcount = new HashMap<Integer, Integer>();

    public int subarraySum(int[] nums, int k) {
        mapcount.put(0,1);
        for (int i=0;i<nums.length;i++) {
            rsum = rsum + nums[i];
            if(!mapcount.containsKey(rsum-k)) {
                mapcount.put(rsum, mapcount.getOrDefault(rsum,0)+1);
            } else {
                System.out.println(rsum-k);
                count = count + mapcount.get(rsum-k);
                mapcount.put(rsum, mapcount.getOrDefault(rsum,0)+1);
                
                System.out.println(count);
            } 

        }
        return count;
    }
}
