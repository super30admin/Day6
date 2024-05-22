import java.util.HashSet;
import java.util.Set;

class Solution {
    public int longestPalindrome(String s) {

        //Using HashSet
        Set<Character> set = new HashSet<>();
        int count = 0;

        for(char ch : s.toCharArray()) {
            if(set.contains(ch)) {
                count = count + 2;
                set.remove(ch);
            }

            else {
                set.add(ch);
            }
        }

        if(!set.isEmpty())
            count +=1;

        return count;
    }
}
