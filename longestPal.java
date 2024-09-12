//time complexity O(n)
//space complexity O(1)

class Solution {
    public int longestPalindrome(String s) {
        //edge
        if(s == null || s.length() == 0) return -1;
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(!set.contains(c)){
                set.add(c);
            } else {
                set.remove(c);
                count += 2;
            }
        }
        if(!set.isEmpty()){
            count++;
        }
        return count;
    }
}
