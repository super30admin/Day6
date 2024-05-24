// Time Complexity: O(n)
// Space Complexity: O(n)
import java.util.*;
public class Palindrome {
        public int longestPalindrome(String s) {
            if(s.length()==0 || s==null)
            {
                return 0;
            }
            int count=0;
            HashSet<Character> set= new HashSet<Character>();
            for(int i=0; i<s.length();i++)
            {
                char c= s.charAt(i);
                if(set.contains(c))
                {
                    count=count+2;
                    set.remove(c);
                }
                else
                {
                    set.add(c);
                }
            }
            if(!set.isEmpty())
            {
                count+=1;
            }
            return count;
        }
        public static void main(String[] args) {
            Palindrome p= new Palindrome();
            System.out.println(p.longestPalindrome("abbd"));
        }
    }

