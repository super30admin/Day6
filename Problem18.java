//Time Complexity: O(n)
//Space Complexity: O(n)
//Did it run on leetcode: Yes
//Problems faced any?: No

import java.util.*;
class Problem18 {
     int longestPalindrome(String s) {
        if(s.length()==1)
            return 1;
        int res=0;
        HashSet<Character> set = new HashSet<>();

        for(int i=0; i<s.length(); i++){
            if(!set.contains(s.charAt(i)))
                set.add(s.charAt(i));
            else{
                res += 2;
                set.remove(s.charAt(i));
            }
        }
        if(set.size()!=0)
            res += 1;

        return res;
    }

    public static void main(String[] args){
        Problem18 p = new Problem18();
        int result = p.longestPalindrome("ccc");
        System.out.println(result);
    }
}