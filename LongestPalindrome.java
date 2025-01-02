// Time Complexity : O(n) where n is length of string
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


package Hashing2;
import java.util.HashSet;
/*
Add elements to hashset, if set contains ele then just remove existing and increment count by 2
 */
class LongestPalindrome {
    public int longestPalindrome(String s) {
        if(s==null||s.length()==0){
            return 0;
        }
        if(s.length()==1){
            return 1;
        }
        int count =0;
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i))){
                set.remove(s.charAt(i));
                count+=2;
            } else {
                set.add(s.charAt(i));
            }
        }
        if(!set.isEmpty()){
            return count+1;
        } else {
            return count;
        }
    }

    public static void main(String[] args) {
        String s = "abccccddddc";
        LongestPalindrome obj = new LongestPalindrome();
        System.out.println(obj.longestPalindrome(s));
    }
}