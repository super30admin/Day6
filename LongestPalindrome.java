class Solution {
    public int longestPalindrome(String s) {
        //edge case
        if(s == null || s.length() == 0) return 0;
        //populate all the characters 
        HashSet<Character> storage = new HashSet<Character>();
        int longestPalindromecount = 0;
        for(int i = 0 ;i<s.length();i++){
        char c = s.charAt(i);
        
        if(storage.contains(c)){
            longestPalindromecount += 2;  // for palidrome repeated means count 2 for an element
            storage.remove(c);
        }else{
            storage.add(c);
        } }    
        if(!storage.isEmpty()){          // if storage still contains some values then pick 1 as 1 letter will be not repeated in permutation
            longestPalindromecount  +=  1;
        }
        return longestPalindromecount;
    }  }
    
/*
Time Complexity :O(n)
Space Complexity :O(1)    
*/