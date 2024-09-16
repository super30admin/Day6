// Time Complexity : O(n) where n is the length of input
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach



public class LongestPalindrome {
        public int longestPalindrome(String s) {

            int count =0;
            HashSet<Character> set = new HashSet<>();

            for(int i=0; i<s.length() ; i++){
                char c = s.charAt(i);

                //check if character is present in set already ornot
                if(set.contains(c)){
                    count +=2;
                    set.remove(c);
                }
                else{ //if character already not present, then just add to set
                    set.add(c);
                }
            }
            //return count+1 if set is not-empty i.e.,there are some characters with value 1 which can only be inserted in middle to form palindrome
            if(!set.isEmpty()){
                count++;
            }
            return count;
        }
}
