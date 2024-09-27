class Solution {
    public int longestPalindrome(String s) {
        if(s == null || s.length()==0){
            return 0;
        }
    int count=0;
     HashSet<Character> hs = new HashSet<>();
        for(int i=0; i<s.length();i++){
            if(hs.contains(s.charAt(i))){
                count=count+2;
                hs.remove(s.charAt(i));
            }
            else{
                hs.add(s.charAt(i));
            }
        }
        if(hs.size()>0){
            return count+1;
        }
        return count;
        
    }
}