//Time complexity: O(n)
//Space complexity:O(n) where n is maximum of 26
//Compiled on leetcode.

class Solution {
    public int longestPalindrome(String s) {			//maximum length of palindrome is possible if we have a char repeating using this logic to get the longest palindrome.
        
        HashSet<Character> set =new HashSet<>();		//If a character is available in set we remove the character if not we add. When removing we increment counter by 2.
        int out=0;
        for(int i=0;i<s.length();i++)
        {
            if(set.contains(s.charAt(i)))
            {
                set.remove(s.charAt(i));
                out+=2;
            }
            else
                set.add(s.charAt(i));
        }
        /*HashMap<Character, Integer> map=new HashMap<>();
        int out=0;
        for(int i=0;i<s.length();i++)
        {
            if(!map.containsKey(s.charAt(i)))
                map.put(s.charAt(i),1);
            else
                if(map.get(s.charAt(i))+1==2)
                {
                    map.put(s.charAt(i),0);
                    out+=2;
                }
                else
                    map.put(s.charAt(i),map.get(s.charAt(i))+1);
        }
        
        /*for(int len : map.values())
        {
            if(len%2==0)
                out+=len;
            else
                out+=(len-1);
        }*/
        if(out+1<=s.length())			//if count+1 is less than or equal to string length returns out+1;
        return out+1;
        else
           return s.length();			//else length - if string has only one character repeating even number of times, condition fails.
    }
    
}