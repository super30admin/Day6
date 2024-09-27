// Time Complexity:     O(n)
// Space Complexity:    O(n)
// where n is length of given string
// Yes, this code ran successfully
// No, I didn't face any problem in this problem statement


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PalindromeLength
{
    public static void main(String[] args) {
        FindPalLength fpl = new FindPalLength();
        String s = "abccccdd";
        System.out.println(fpl.longestPalindrome(s));
    }
}

class FindPalLength {
    public int longestPalindrome(String s) {

        Set<Character> set = new HashSet<>();
        int length = 0;
        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);                                           // taking characters from string one by one
            if(set.contains(c))                                             // character already added to set
            {
                set.remove(c);                                              // then remove it as it's the pair we need
                length += 2;                                                // and increment length by 2 as we have a pair of character
            }
            else                                                            // new character
            {
                set.add(c);                                                 // then add it to set
            }
        }
        return length + (set.isEmpty() ? 0 : 1);                            // if any character left which is the case of odd number of it

// ****************************** Another Approach ******************************
//        Map<Character,Integer> map = new HashMap<>();
//        for(int i=0; i<s.length(); i++)
//        {
//            char c = s.charAt(i);
//            map.put(c,map.getOrDefault(c,0)+1);
//        }
//        int length = 0;
//        boolean isOddVal = false;
//        for(Map.Entry<Character,Integer> entry : map.entrySet())
//        {
//            int val = entry.getValue();
//            if(val%2 == 0)
//                length += val;
//            else {
//                length += val - 1;
//                isOddVal = true;
//            }
//        }
//        return length + (isOddVal ? 1 : 0);
    }
}