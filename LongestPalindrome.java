//time - O(n)
//space - O(1)
class Solution {
    public int longestPalindrome(String s) {
        if(s==null || s.length()==0) return 0;
        int count = 0;
        HashSet<Character> set = new HashSet<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(set.contains(ch)){
                count+=2;
                set.remove(ch);
            }
            else set.add(ch);
        }

        if(set.size() > 0) count++;

        return count;
    }
}