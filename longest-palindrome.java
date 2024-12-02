//TC: O(N)
//SC: O(1)
class Solution {
    public int longestPalindrome(String s) {
        Set<Character> sSet = new HashSet<>();
        int count = 0;
        for(int i=0; i<s.length(); i++) {
            if(!sSet.contains(s.charAt(i))) {
                sSet.add(s.charAt(i));
            }else {
                sSet.remove(s.charAt(i));
                count = count + 2;
            }
        }
        if(!sSet.isEmpty()) {
            return count+1;
        }else {
            return count;
        }
    }
}