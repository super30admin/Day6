/* 
Algorithm:
    1. Convert the string to character array. Traverse through the char array.
    2. If the character is there in the hash set, then remove the character from the hash set and add 2 to existing length.
    3. If the character is not there in the hash set, add the character to hashset. After the complete traversal if the hash set is not empty add 1 extra to the length.
    
    Time Complexity: O(n)
    Space Complexity: O(n)
    
    Did the code run on leetcode? Yes

*/

class Solution {
    public int longestPalindrome(String s) {
      int length=0;
        HashSet<Character> h = new HashSet<>();
        
        char[] charArr = s.toCharArray();
        
        for(char c: charArr){
            if(h.contains(c)){
                length+=2;
                h.remove(c);
            }
            else{
                h.add(c);
            }
        }
        length = h.isEmpty()?length: length+1;
        return length;
    
    }
    
}