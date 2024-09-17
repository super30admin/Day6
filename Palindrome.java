import java.util.HashSet;
//tc:O(N)
//sc:O(1)
public class Palindrome {

        public int longestPalindrome(String s) {
            HashSet<Character>set = new HashSet<>();
            int count = 0;
            for(int i=0; i<s.length();i++)
            {
                char c = s.charAt(i);
                if(!set.contains(c))
                {
                    set.add(c);
    
                }
                else{
                    set.remove(c);
                    count+=2;
                }
    
            }
            if(!set.isEmpty())
            {
                count++;
            }
            return count;
        }
    
    
}
