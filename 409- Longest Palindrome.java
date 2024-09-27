//Time Complexity=O(N)
//Space Complexity=O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No 


//Initially we are adding the element in the hashMap and if the element is repeated the we are removing that element that key and value pair from it and are incrementing count by 2. As if we have 2 character then it forms a palindrome of length 2. And at the end we are checking that whether the hashmap is empty or not as if there is/are elements in it then we are adding 1 to our count as we can add only single character of count 1 to create a palindrome 
class Solution {
    public int longestPalindrome(String s) {
     HashMap<Character,Integer> map=new HashMap<>();
        int count=0;
        
    for(int i=0;i<s.length();i++)
    {
        Character c=s.charAt(i);
        if(!map.containsKey(c))
        {
            map.put(c,1);
        }
        else
        {
            if(map.containsKey(c))
            {
                count+=2;
                map.remove(c);
            }
        }
    }
        if(!map.isEmpty())
        {
            count+=1;
        }
        return count;
    }
}