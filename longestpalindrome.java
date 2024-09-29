class Solution {
    public int longestPalindrome(String s) {
        if(s==null || s.length()==0) return 0;
        HashSet<Character> set = new HashSet<>();
        int count=0,i=0;
        while(i<s.length()){
            Character c = s.charAt(i);
            if(set.contains(c)){
                count+=2;
                set.remove(c);
            }
            else{
                set.add(c);
            }
            i++;
        }
        if(count<s.length()) count++;
        return count;
    }
}
