//Time Complexity : O(n) - Traversal through all letters of String
//Space Complexity : O(1) - Since we are taking string so only constant letters will be present

// Approcah:
//     Create a HashSet and loop through each letter in the string.
//     For the first entry of any given letter, add it to HashSet.
//     Else if the letter is already in the set then remove it occurence from the set and increment the count by 2.
//     Lastly, Check if there is any entry present in the set, if so increament the count by 1 to make palindrom string of odd length

class Solution {
    public int longestPalindrome(String s) {
        //Edge Condition to see if the string is null
        if(s==null || s.length()<1) return 0;
        else if(s.length() == 1) return 1;
        
        //Declare HashSet
        Set<Character> hs = new HashSet<>();
        int count = 0;
        
        //Loop through each letter in the string
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(hs.contains(c)){
                hs.remove(c);
                count += 2;
            } else{
                hs.add(c);
            }
        }
        
        if(!hs.isEmpty()) count = count+1;
        return count;
    }
}