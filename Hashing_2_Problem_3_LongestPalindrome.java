import java.util.HashSet;

//Time Complexity : O(n)
//Space Complexity : O(1) Fixed Number of Characters in Hashset
// Run Successfully on LeetCode
// Problems : No Problem

/*
Here we will be using hashset for storing the character that have
occured only odd number of times. It it gets to an even number, 
we'll add 2 into the count and remove the element from the hashset.
If we still have odd number of characters left, we will be adding 
1 to count
*/


public class Hashing_2_Problem_3_LongestPalindrome {
    public static int longestPalindrome(String s) {
        if(s==null || s.length()==0)return 0;
        HashSet<Character> hs = new HashSet<>();
        int count = 0;
        for(int i=0;i<s.length();i++)
        {
            if(hs.contains(s.charAt(i)))
            {
                count+=2;
                hs.remove(s.charAt(i));
            }
            else
            {
                hs.add(s.charAt(i));
            }
        }
        if(!hs.isEmpty())
        {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "abccccdd";
        System.out.println(longestPalindrome(s));


    }

}
