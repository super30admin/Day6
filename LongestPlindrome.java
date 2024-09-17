//o(n) space and o(n) time
//passed all leetcode cases
//used approach discussed in class

class Solution {
    public int longestPalindrome(String s) {
        //edge
        if(s == null || s.length()==0) return 0;

        HashSet<Character> set = new HashSet<>();
        int count = 0;
        for(int i=0; i<s.length();i++){
            char place = s.charAt(i);
            if(set.contains(place)){
                count += 2;
                set.remove(place);
            } else{
                set.add(place);
            }
        }
        if(!set.isEmpty()) count++;
        return count;

    }
}