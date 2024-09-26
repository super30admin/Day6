// we just iterate over the given string. we know that if the number of occurance of character is even we can then form palindrome but if its odd then we  
// can only use it once to make odd length palindrome. i've used a hashset in this method
class Solution {
    public int longestPalindrome(String s) {
        if(s == null || s.length() == 0) {
            return 0;
        }
        int count = 0;
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(set.contains(c)) {
                count += 2;
                set.remove(c);
            }
            else {
                set.add(c);
            }      
        }
        if(!set.isEmpty()) {
                count ++;
            }
        return count;
    }
}