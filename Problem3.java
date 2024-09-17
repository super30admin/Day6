// Time Complexity : o(n)-> no of chars in string
// Space Complexity : o(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : 

//consider chars which have even number of occurences and consider one char which has odd number of occurences, 
//and sum it-gives maxLength of palindrome

class Solution {
    public int longestPalindrome(String s) {
       HashMap<Character, Integer> hm =new HashMap();//contains chars and its occurences
        int  max=0;
       for(int i =0; i<s.length();i++)
       {
           char c= s.charAt(i);
           if(hm.containsKey(c))
           {
               hm.put(c,hm.get(c)+1);
           }
           else
           {
               hm.put(c,1);
           }
       }
        boolean addedOddNumberedCharFlag= false;
         for (Map.Entry mapElement : hm.entrySet()) {
             
            int v= (int)mapElement.getValue();
             max+= v/2*2;
            if(max%2==0 && v%2==1)
                                    //odd no of occurences of chars in pal, can occur 
                                    //if i have even occurences of other chars 
            {
                max++;
            }
            
            
        }
        return max;
    }
}