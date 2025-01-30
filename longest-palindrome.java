// Time Complexity : O(n^2)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach: 
//I used a **HashMap** for this approach due to its **O(1) lookup time**,
// which allows efficient checking of whether a character already exists in the map.
// If the character is found, its count is simply incremented by one. If the character is not found,
// it's added to the map with an initial count of one. In the second loop, I process the character frequencies: for characters with even counts, 
//I add their count to the total and remove the key from the map. For characters with odd counts, I subtract 1 from the count (to make it even), add that value to the total, and set the map value for that character to 1. Finally, if there are any characters left in the HashMap (i.e., characters with odd counts),
// I increment the count by one to account for the central character in the palindrome.
class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> sMap=new HashMap<Character,Integer>();
        int count=0;
        if(s.length() == 0){
            return 0;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!sMap.containsKey(ch)){
                sMap.put(ch,1);
            }else{
       sMap.put(ch,sMap.get(ch)+1);
            }
            
        }
         for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(sMap.containsKey(ch)){
          if((sMap.get(ch))%2 == 0){
               count=count+sMap.get(ch);
               sMap.remove(ch);
            }else{
               
                int c=sMap.get(ch);
                count=count+c-1;
                   sMap.put(ch,1);
            }
        }
            }
            if(!sMap.isEmpty()){
                count++;
            }
          
        return count;
        
    }
}

//solution-2
// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach: I used a HashSet to store characters as I iterate through the string.
// Whenever a character is encountered again, I check if it already exists in the HashSet. 
//If it does, I increment the count by 2 and remove that character from the set. This way, 
//I account for pairs of characters that can be placed symmetrically in the palindrome. Finally, 
//if the HashSet is not empty at the end of the loop, it means there is at least one character with an odd count. In this case, I increment the count by one to account for a character that can be placed at the center of the palindrome.

class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> mySet=new HashSet<Character>();
        int count=0;
        if(s.length() == 0){
            return 0;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!mySet.contains(ch)){
                mySet.add(ch);
            }else{
             mySet.remove(ch);
             count=count+2;
            }
        }
            if(!mySet.isEmpty()){
                count++;
            }
          
        return count;
        
    }
}