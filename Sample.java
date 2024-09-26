# Hashing-2

//working on LC# 325 i.e. Maximum Size Subarray Sum Equals k

## Problem2 (https://leetcode.com/problems/contiguous-array/)
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public int findMaxLength(int[] nums) {
        //int rSum[] = new int[nums.length];
        int max=0; int rSum=0;
        HashMap<Integer, Integer> hmap= new HashMap<>();
        hmap.put(0,-1);
        int complement=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                rSum+=1;
            }
            else{
                rSum-=1;
            }
            
            if(hmap.containsKey(rSum)){
                int val=hmap.get(rSum);
                complement=i-val;
                if(complement>max){
                    max=complement;
                }
            }
            else{
                hmap.put(rSum, i);
            }
        }
    return max;
    }
}


## Problem3 (https://leetcode.com/problems/longest-palindrome)
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO


// Your code here along with comments explaining your approach
class Solution {
    public int longestPalindrome(String s) {
        if(s==null || s.length()==0) return -1;
    
        HashSet<Character> hset = new HashSet<>();
        char[] ch = new char[s.length()]; 
        for (int i = 0; i < s.length(); i++) { 
            ch[i] = s.charAt(i); 
        } 

        int count=0;
        for(int i=0;i<s.length();i++){
            if(hset.contains(ch[i])){
                hset.remove(ch[i]);
                count+=2;
            }
            else{
                hset.add(ch[i]);
            }
        }
        if(!hset.isEmpty()){
            count+=1;
        
        }
        return count;
    }
}