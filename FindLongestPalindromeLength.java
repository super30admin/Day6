// Time Complexity : O(n) where n is number of character in s
// Space Complexity : O(n) taken by aHashMap to maintain the Character frequencies
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : problem in figuring out the better solution


// Your code here along with comments explaining your approach
1. take an hashMap to maintain the each chars frequency
2. take a count and increase it by 2 if the frequency of any char reaches 2 
3. remove that char from hashMap.
4. in last check if hashmap still have some char then increase count by 1
5. finally return the char

class Solution {
    public int longestPalindrome(String s) {
        int count =0;
        
        HashMap<Character,Integer> set = new HashMap();
        
        for(Character c : s.toCharArray())
        {
            if(set.containsKey(c))
            {
                count = count+2;
                set.remove(c);
            }
            else
            {
                set.put(c,1);
            }
            
        }
        
        if(!set.isEmpty())
        {
            count++;
        }
        return count;
    }
}