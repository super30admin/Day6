// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

// Used a hashset for this
class Solution {
    public int longestPalindrome(String s) {
        int n = s.length();
        HashSet<Character> mp = new HashSet<>();
        int cont = 0;
        for(int i=0; i<n; i++){
           if(!mp.contains(s.charAt(i))){
               mp.add(s.charAt(i));
           }
            else{
                cont = cont + 2;
                mp.remove(s.charAt(i));
            }
        }
        if(!mp.isEmpty()){
            cont = cont + 1;
        }
        return cont;
        
        
    }
}