// Time:O(n)
// Space:O(n)
// Issues: Minor syntax error

class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        
        for(int i = 0; i < s.length(); i++){
            if(set.contains(s.charAt(i))){
                set.remove(s.charAt(i));
                count = count + 2;
            }
            else set.add(s.charAt(i));
        }
        if(set.size() != 0){
            count++;
        }
        return count;
    }
}