//The approach here is making use of hashset to find the pairs.
//If a character occurs once, it is added to the hashset, and if it occurs again, increase the count by 2 and remove the character from the HashSet.
//Finally check if the hashset is empty, if yes, the we can return the count and if not, then we can increase the count by 1 because one of them can be added as a middle element in the palindrome.
//Time Complexity: O(n)
//Space Complexity: O(1) //because we are storing at max 52 alphabets(lower and upper cases)
import java.util.HashSet;

class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> charSet = new HashSet<>();
        int count = 0;
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if(!charSet.contains(c)){
                charSet.add(c);
            } else{
                count = count + 2;
                charSet.remove(c);
            }
        }
        if(!charSet.isEmpty()){
            return count + 1;
        } else {
            return count;
        }
    }
}