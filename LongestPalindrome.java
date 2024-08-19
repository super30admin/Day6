import java.util.HashSet;
import java.util.Set;

public class LongestPalindrome {
    /**
     even length - every char should have matching counterpart
     odd length - middle char can be without the counterpart

     */


    public int longestPalindrome(String s) {
        if(s.length()==0 || s.equals(null)) return -1;
        Set<Character> set = new HashSet<>();
        int count =0;
        /**
         Iterate through string if we see char in set, add 2 to the count and delete the char from set.
         If set is empty return count. else return count+1
         time - o(n)
         space -0(1)

         */

        for(int i=0; i<s.length(); i++){
            if(set.contains(s.charAt(i))){
                count = count+2;
                set.remove(s.charAt(i));
            }else{
                set.add(s.charAt(i));
            }
        }
        if(set.isEmpty()){
            return count;
        }else {
            return count+1;
        }

    }
}
