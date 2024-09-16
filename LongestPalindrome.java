// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

public class LongestPalindrome{
    public int longestPalindrome(String s) {

        if(s == null || s.length() == 0){
            return 0;
        }

        int count = 0;
        HashSet<Character> letters = new HashSet<>();

        for(int i = 0; i < s.length(); i++){
            //if the letter has not already been encountered, add to set
            if(!letters.contains(s.charAt(i))){
                letters.add(s.charAt(i));
            }
            else{
                //leter has been encountered, take both letters as a pair, and add them to count
                letters.remove(s.charAt(i));
                count+=2;
            }
        }
        //if extra letters
        if(letters.isEmpty() == false){
            return count + 1;
        }

        return count;
    }
}
