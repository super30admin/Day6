import java.util.HashSet;

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        if(s== null || s.length()==0)
            return 0;
        HashSet<Character> set = new HashSet();
        int count = 0;
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(set.contains(c))
            {
                count+=2;
                set.remove(c);
            }
            else
                set.add(c);
        }
        if(!set.isEmpty())
        {
            count+=1;
        }
        return count;

    }
    public static void main(String args[])
    {
        String s = "abccccdd";
        LongestPalindrome ob = new LongestPalindrome();
        System.out.println(ob.longestPalindrome(s));
    }
}

//timecomplexity is O(N)
//space complexity is O(1)