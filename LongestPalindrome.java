class LongestPalindrome {
    public int longestPalindrome(String s) {
        int count = 0;
        Set<Character> set = new HashSet<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(set.contains(c)){
                count+=2;
                set.remove(c);
            }else {
                set.add(c);
            }
        }
        if(set.size()!=0 ){
             count++;
        }
        return count;
    }
}
