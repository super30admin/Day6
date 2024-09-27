// TC: O(n)
// SC: O(1) The hash set will only hold 26 chars in worst case scenario. That's why O(1)
class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<>();
        int i, n, count = 0;
        n = s.length();
        for(i=0; i<n; i++) {
            Character c = s.charAt(i);
            if(set.contains(c)) {
                set.remove(c);
                count+=2;
            } else {
                set.add(c);
            }
        }
        if(!set.isEmpty()) {
            count += 1;
        }
        return count;
    }
}