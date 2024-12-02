//****LONGEST PALINDROME****
// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Y
// Any problem you faced while coding this : N

class Solution {
    public int longestPalindrome(String s) {
Set<Character> set= new HashSet<>();
int count=0;
        for(int i=0;i<s.length();i++)
        {
            char ch= s.charAt(i);
            if(set.contains(ch))
            {
                count=count+2;
                set.remove(ch);
            }
            else
            {
                set.add(ch);
            }
        }
        
        if(!set.isEmpty())
        {
            count=count+1;
        }
        
        return count;
    }
}




//****CONTIGIOUS SUBARRAY****
// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : Y
// Any problem you faced while coding this : N

class Solution {
    public int findMaxLength(int[] nums) {
        //Hashmap of type - (rSum, Index);
        HashMap <Integer, Integer> map =new HashMap<>();
        map.put(0,-1);
        int rSum=0;
        int max=0;
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0) 
            {
                rSum--;
            }
            else
            {
                rSum++;
            }
            
            if(map.containsKey(rSum))
            {
                int x=i-map.get(rSum);
                max=Math.max(max, x);
            }
            else
            {
                map.put(rSum, i);
            }
        }
       return max; 
    }
}



//****SUBARRAY SUM EQUALS K****
// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : Y
// Any problem you faced while coding this : N

class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map= new HashMap<>();
        map.put(0,1);
        int result=0;
        int rSum=0;
        
        for(int i=0;i<nums.length;i++)
        {
            rSum += nums[i];
            if(map.containsKey(rSum-k))
            {
                result +=map.get(rSum-k);
            }
            
                if(map.containsKey(rSum))
                {
                    map.put(rSum, map.get(rSum)+1);
                }
                else
                {
                    map.put(rSum, 1);
                }
            
        }
        return result;
    }
}




