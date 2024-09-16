class LongestPalindrome {
    public int longestPalindrome(String s) {
        HashSet<Character> chars = new HashSet<>();
        int count = 0;
        for(char c : s.toCharArray()){
            if(chars.contains(c)){
                count += 2;
                chars.remove(c);
            }
            else{
                chars.add(c);
            }
        }
        if(chars.size() > 0)
            count++;
        return count;
    }
}