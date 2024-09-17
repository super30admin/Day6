//Time Complexity: O(N)
//Space Complexity:O(1)
class Solution {
    public int longestPalindrome(String s) {
       if(s == null || s.length() == 0) return 0;
        HashSet<Character> hs = new HashSet<>();
        int counter = 0;
        for(int i=0; i<s.length();i++){
            char c= s.charAt(i);
            if(hs.contains(c)){
                counter = counter+2;
                hs.remove(c);
            }else{
               hs.add(c);
                }
            }
            if(!hs.isEmpty())
                counter++;
                return counter;
    }
}