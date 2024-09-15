class Solution {
    // Time complexity: O(n)
    // Space complexity: O(n)
    public int longestPalindrome(String s) {
        Set<Character> set = new HashSet<>();
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(set.contains(c)){
                count = count + 2;
                set.remove(c);
            }else{
                set.add(c);
            }
        }
        if(!set.isEmpty()){
            count = count + 1;
        }
        return count;
    }
}