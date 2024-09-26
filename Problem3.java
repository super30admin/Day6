// Time Complexity : 0(N), as we have to iterate over the string
// Space Complexity : O(1) , total possible characters would be constant
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

import java.util.HashSet;

public class Problem3 {
    public int longestPalindrome(String s) {


        //creating a hashmap to keep a count of frequency of characters
        HashSet<Character> set = new HashSet<>();

        //variable to count the frequency
        int count =0;

        for(int i=0; i<s.length(); i++){

            char ch = s.charAt(i);
            if(set.contains(ch)){

                //increasing the count by 2 if character is present
                count+=2;

                set.remove(ch);
            }
            else{
                set.add(ch);
            }
        }
        if(!set.isEmpty()){
            //increasing the count if set is not empty at the end
            count++;
        }
        return count;


    }
}
