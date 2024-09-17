/*
 Time Complexity - O(n) where n is length of string
 Space Complexity - O(1) as charset at max might contain 52 characters - 26 lowercase,26 uppercase characters
 Has it passed all testcases on leetcode? - yes
*/
/*
A string is palindrome when it reads the same from both the ends.For an even length string it to be a palindrome, 
there should be equal occurences(pair) of the character on both the ends. For an odd length string, there should be equal occurences of
chars on both the ends plus one additional character. To solve this problem in 1-pass , as we iterate through the array add the 
first occurence of a character in hashset and upon encountering it for the second time increase the palindromLength as a pair of 
same character is encountered. Also remove it from hashset so that subsequent pairs of the same character can be found if any.
After iterating through the entire string, if the set still has any elements - we could use one of the element from it to make a
odd length palindrome.
 */
public class LongestPalindrome {
    public int longestPalindrome(String s) {
        if(s == null || s.length() == 0) return 0;
        HashSet<Character> charSet = new HashSet<>();
        int palindromeLength = 0;
        
        for(int i =0; i < s.length();i++){
            char c = s.charAt(i);
            if(charSet.contains(s.charAt(i))){
                palindromeLength += 2;
                charSet.remove(c);
            }
            else{
                charSet.add(c);
            }
        }
        
        if(!charSet.isEmpty())
            palindromeLength++;
        return palindromeLength;
    }
}
