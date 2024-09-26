
// Time Complexity : O(1) --> Single Pass
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Yes


// Your code here along with comments explaining your approach

class longestPallindrom {
    public int longestPalindrome(String s) {
         if(s==null || s.length()==0)
            return 0;
        
        HashSet<Character> sSet=new HashSet<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!sSet.contains(c)){
                sSet.add(c);
            }
            else{
                count+=2;
                sSet.remove(c);
            }
        }
            if(!sSet.isEmpty()){
                return count+1;
            }
        return count;
    }
}