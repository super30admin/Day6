
//Problem 1
// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums==null || nums.length==0)
        {
            return 0;
        }
        int rSum=0;
        int cnt=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(rSum,1);
        for(int i=0;i<nums.length;i++)
        {
            rSum=rSum+nums[i];
            if(map.containsKey(rSum-k)){
                cnt=cnt+map.get(rSum-k);
            }
            map.put(rSum,map.getOrDefault(rSum,0)+1);

        }
        return cnt;
    }
}
//Problem 2
// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :No
class Solution {
    public int findMaxLength(int[] nums) {
        if(nums==null || nums.length==0)
        {
            return 0;

        }
        HashMap<Integer,Integer> map=new HashMap<>();
        int rSum=0;
        int max=0;
        map.put(rSum,-1);
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                rSum=rSum+1;
            }
            else{
                rSum=rSum-1;

            }
            if(map.containsKey(rSum))
            {
                max=Math.max(max,i-map.get(rSum));
            }
            else{
                map.put(rSum,i);
            }
        }
       return max; 
    }
}
//Problem 3
// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :No
class Solution {
    public int longestPalindrome(String s) {
        if(s==null || s.length()==0) return 0;
        int count=0;
        HashSet<Character> set= new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(set.contains(c))
            {
                count=count+2;
                set.remove(c);
            }
            else{
                set.add(c);
            }
        }
        if(!set.isEmpty())
        {
            count=count+1;
        }
        return count;
    }
}