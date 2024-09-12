public class LongestPallindrom {
    public int longestPalindrome(String s) {
        HashSet<Character> hs = new HashSet<>();
        
        for(int i=0; i<s.length(); i++){
            if(hs.contains(s.charAt(i))){
                hs.remove(s.charAt(i));
            }
            else{
                hs.add(s.charAt(i));
            }
        }
        if(hs.size() > 0){
            return s.length() - hs.size()+1;
        }
        return s.length();
    }
}
