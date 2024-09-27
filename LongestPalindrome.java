class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> hs = new HashSet<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(hs.contains(s.charAt(i))){
                count = count+2;
                hs.remove(s.charAt(i));
            }
            else
                hs.add(s.charAt(i));
        }
        if(hs.size()>0)
            count++;
        return count;
    }
}
