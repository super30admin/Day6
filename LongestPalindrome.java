// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
public class LongestPalindrome {
    public int longestPalindrome(String s) {
        Set<Character> hset = new HashSet<>();
        int count =0;

        for(int i=0; i<s.length(); i++){
            Character ch = s.charAt(i);

            //if hashset already contains the character, then it's even, add 2 to the existing count and remove it from the set
            if(hset.contains(ch)) {
                count+=2;
                hset.remove(ch);
            } else { //add the character to the set if it is not present already
                hset.add(ch);
            }
        }
        //If there are odd no. of characters, hset will not be empty. So, add 1 to the existing count.
        if(!hset.isEmpty()){
            count+=1;
        }
        return count;
    }
}