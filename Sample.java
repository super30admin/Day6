// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach


//Subarray sum problem
//running sum pattern
//time complexity o(n)
//space complexity o(n)
class Solution {
    public int subarraySum(int[] nums, int k) 
    {
        if(nums == null || nums.length == 0)
            return 0;
        HashMap<Integer,Integer>map = new HashMap<>();
        map.put(0,1);
        
        int rsum = 0, count = 0;
        for(int i=0; i< nums.length; i++){
            rsum += nums[i];
            int compliment = rsum - k;
            if(map.containsKey(compliment))
            {
                count = count + map.get(compliment);
            }
            map.put(rsum,map.getOrDefault(rsum,0)+1);
        }
        return count;
    }
}

//running sum pattern
//time complexity o(n)
//space complexity o(n)
class Solution {
    public int findMaxLength(int[] nums) 
    {
        int maxlen = 0;
        if(nums == null || nums.length == 0)
            return 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,-1);
        int runningSum = 0;
        
        for(int i=0; i<nums.length;i++)
        {
            if(nums[i] == 1){
                runningSum++;
            }
            else{
                runningSum--;
            }
            if(hm.containsKey(runningSum))
            {
                int len = i - hm.get(runningSum);
                maxlen = Math.max(len,maxlen);
            }
            else
                hm.put(runningSum,i);
        }
        return maxlen;
    }
}

//Bruteforce pf finding max length sub array with balanced 1's and 0's
//Time Complexity o(n pow 2)
//space complexity o(1)
class Solution {
    public int findMaxLength(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;
        
        int maxlen =0;

        for(int start=0; start<nums.length;start++)
        {
            int zeroes = 0, ones = 0;
            for(int end = start; end<nums.length; end++){
                if(nums[end]==1)
                    ones++;
                else
                    zeroes++;
                if(ones == zeroes){
                    maxlen = Math.max(maxlen, end - start + 1);
                }
            }
        }
        return maxlen;
    }
}

//Longest Palindrome
//time complexity o(n)
// space complexity o(1)
class Solution {
    public int longestPalindrome(String s) {
        if(s == null || s.length()==0)
            return -1;
        int count=0;
        HashSet<Character> hs = new HashSet<>();
        for(int i=0; i<s.length(); i++){
            if(!hs.contains(s.charAt(i))){
                hs.add(s.charAt(i));
            }
            else{
                count = count +2;
                hs.remove(s.charAt(i));
            }
        }
        if(!hs.isEmpty())
            count++;
        return count;
    }
}
