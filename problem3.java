//(https://leetcode.com/problems/longest-palindrome)
// Time Complexity : o(n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None
import java.util.HashMap;

public class problem3 {
    public static int longestPalindrome(String s) {

        int count=0;
        boolean flag=false;
        HashMap<Character, Integer> map= new HashMap<>();
        for(char c: s.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c: s.toCharArray())
        {
            if(map.get(c)%2==0)
            {
                count+=map.get(c);
            }
            else
            {
                flag=true;
                count+=map.get(c)-1;
            }
        }

        if(flag==true)
        {
            return count+1;
        }
        return count;


    }

    //using arrays
    public static int longestPalindrome1(String s) {

        int count=0;
        char[] set= new char[65];
        for(char c: s.toCharArray())
        {
            if (set[c-'A'] !=0)
            {
                count+=2;
            }
            else {
                set[c-'A']=c;
            }
        }
        if(count<s.length())
        {
            return count+1;
        }
        return count;
    }



        public static void main(String[] args)
    {
        int res= longestPalindrome("aaabbbcba");
        System.out.println(res);
    }
}
