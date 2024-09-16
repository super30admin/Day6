class Solution {
    public int longestPalindrome(String s) {
        if(s==null || s.length() == 0) return 0;
        int count = 0;
        HashSet<Character> hs = new HashSet<>();
        for(int i=0; i<s.length();i++){
            char c = s.charAt(i);
            if(hs.contains(c)){
                count+=2;
                hs.remove(c);
            } else {
                hs.add(c);
            }
        }
        if(!hs.isEmpty()){
            count+=1;
        }
        return count;
    }
}