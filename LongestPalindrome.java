// Time Complexity : 0(n)
// Space Complexity : 0(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class LongestPalindrome {
    public int longestPalindrome(String s) {

        int result = 0;
        HashSet<Character> set = new HashSet<Character>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!(set.contains(ch))){        
               set.add(ch);
            }else{
                result+=2;
                set.remove(ch);
            }


        }

        if(!(set.isEmpty())){
            result++;
        }

         return result;
   
    }

}
