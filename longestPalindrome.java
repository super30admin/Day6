import java.util.HashSet;

public class longestPalindrome {

    public static int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<>();
        int res = 0;
        for(int i = 0; i< s.length();i++){
            char c = s.charAt(i);
            if(set.contains(c)){
                res+=2;
                set.remove(c);
            }else{
                set.add(c);
            }
        }
        if(!set.isEmpty()){
            res += 1;
        }
        return res;
    }

    public static void main(String[] args){
        System.out.println( longestPalindrome("abccccdd"));
    }

}
