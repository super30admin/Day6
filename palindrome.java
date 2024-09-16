// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

public class palindrome {
        public int longestPalindrome(String s) {
            int max = 0;
            HashSet<Character> hashSet = new HashSet<>();
            for(int i=0; i<=s.length()-1; i++){
                if(!hashSet.contains(s.charAt(i))){
                    hashSet.add(s.charAt(i));
                }else{
                    hashSet.remove(s.charAt(i));
                    max+=2;
                }
            }
            if(!hashSet.isEmpty()) max+=1;
            return max;
        }
    }
    
