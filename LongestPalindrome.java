import java.util.HashSet;
// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class LongestPalindrome{
    public static void main(String[] args){
        LongestPalindrome lp = new LongestPalindrome();
        int result=lp.longestPalindrome("abcucba");
        System.out.print("Result: " +result);
    }
    public int longestPalindrome(String s) {
        HashSet hs = new HashSet();//to store non-duplicates
        int count=0;

        char[] ch = s.toCharArray();

        //to find the duplicates and if present adding them to count.
        for(char c:ch){
            if(hs.contains(c)){
                hs.remove(c);//removes the exisiting value making the two characters in palindrome
                count+=2;
            }else{
                hs.add(c);//if no such value presents in set, simply add it and wait for it's duplicate to come.
            }
        }
        //if some values are present in set then that means they doesn't have any duplicates and can't form a palindrome.
        //count+1 for the one character that can be present at the center of the palindrome without repertition.
        return hs.isEmpty() ? count:count+1;

    }
}