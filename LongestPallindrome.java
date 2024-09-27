// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No
// Longest Pallindrome
class Solution {
    public int longestPalindrome(String s) {
        Set<Character> set = new HashSet<>();
        int count = 0;
        for(int i=0;i<s.length();i++) {
            if(set.contains(s.charAt(i))) {
                set.remove(s.charAt(i));
                count = count + 1;
            }
            else {
                set.add(s.charAt(i));
            }
        }
        return set.size() > 0 ? 2*count + 1: 2*count;
    }
}

class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int count = 0;
        boolean odd = false;
        for(int i=0;i<s.length();i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }
        for(char ch: map.keySet()) {
            if(map.get(ch)%2 !=0) {
                count = count + map.get(ch)/2;
                odd = true;
            }
            else {
                count = count + map.get(ch)/2;
            }
        }
        return odd == true ? 2* count + 1: 2*count;
    }
}
