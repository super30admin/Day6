# Hashing-2

## Problem1 (https://leetcode.com/problems/subarray-sum-equals-k/)
class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums==null || nums.length==0)
        {
            return 0;
        }
        int rsum=0,count=0;
        HashMap<Integer, Integer> sMap=new HashMap<>();
        sMap.put(0,1);
        for(int i=0;i<nums.length;i++)
        {
            rsum=rsum+nums[i];
            int s=rsum-k;
                if(sMap.containsKey(s))
                {
                    count=count+sMap.get(s);
                }
            if(!sMap.containsKey(rsum))
                sMap.put(rsum,1);
            else
                sMap.put(rsum,sMap.getOrDefault(rsum,0)+1);
        }
        return count;
    }
}
// Time Complexity :o(n)
// Space Complexity :o(1)
// Did this code successfully run on Leetcode : YES 
// Any problem you faced while coding this : NO 






## Problem2 (https://leetcode.com/problems/contiguous-array/)
class Solution {
    public int findMaxLength(int[] nums) {
        if(nums==null && nums.length==0)
            return 0;
        HashMap<Integer,Integer> cMap = new HashMap();
        cMap.put(0,-1);
        int rSum=0;
        int Count=0;
        for(int i=0;i<nums.length;i++)
        {
          rSum =(nums[i]==0)? rSum-1: rSum+1;
            
            if(!cMap.containsKey(rSum))
                cMap.put(rSum,i);
            else
                Count = Math.max(Count,i-cMap.get(rSum));
        }
        return Count ;
        
    }
}

// Time Complexity :o(n)
// Space Complexity :o(1)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this :No






## Problem3 (https://leetcode.com/problems/longest-palindrome)
class Solution {
    public int longestPalindrome(String s) {
        int count=0;
        if(s.length()==0 || s==null)
        {
            return 0;
        }
        HashSet<Character> pSet=new HashSet<>();
        char[] arr=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            if(!pSet.contains(arr[i]))
            {
                pSet.add(arr[i]);
            }
            else 
            {
                count+=2;
                pSet.remove(arr[i]);
            }
            
            
        }
         if(!(pSet.isEmpty()))
             {
                count++;
             }
       
        return count;
    }
}
// Time Complexity :o(n)
// Space Complexity :o(1)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this :NO



