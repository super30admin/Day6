import java.util.*;
public class LongestPalindrome {
        public int longestPalindrome(String s) {
            int max =0;
            HashSet<Character> set = new HashSet<>();
            for(int i=0;i<s.length();i++){
                if(set.contains(s.charAt(i))){
                    set.remove(s.charAt(i));
                    max = max+2;
                }else{
                    set.add(s.charAt(i));
                }
            }
            return set.isEmpty() ? max : max+1;
        }
        public static void main(String[] args){
            LongestPalindrome l = new LongestPalindrome();
            String s = "abccccdd";
            String k = "bbbb";
            int z = l.longestPalindrome(s);
            int j = l.longestPalindrome(k);
            System.out.println(z + " "+s);
            System.out.println(j + " "+k);
        }
        // TC : iterating through entire array : length of the string : O(N)
        // SC : hashset for  auxilary space : O(N);
    }

