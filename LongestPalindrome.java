/*Time complexity : O(n)
Space complexity :O(1)
Approach: Seeing the pairs of characters if all of them are in pair then palindrome formed would be
of even length
- if any extra charcater is present we can form odd length palindrome
-checking thorugh hashset and every time a pair is found increasing the length by 2
-if at last any char is remaining increasing length by 1
 */
import java.util.HashSet;

public class LongestPalindrome {
    public static int longPalindrome(String str){
        HashSet<Character> set = new HashSet<>();
        int len = 0;
        for(char c : str.toCharArray()){
            if(set.contains(c)){
                len += 2;
                set.remove(c);
            }else{
                set.add(c);
            }
        }
        if(!set.isEmpty()){
            len += 1;
        }
        return len;
        
    }
    public static void main(String args[]){
        System.out.println(longPalindrome("abbccdeff"));
        System.out.println(longPalindrome("aaabbccde"));
        System.out.println(longPalindrome("abb"));
        System.out.println(longPalindrome("h"));

    }
}