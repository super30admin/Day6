class Solution {
    public int longestPalindrome(String s) {
        if( s == null || s.length()==0){
            return 0;
        }
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        char c;
        for(int i =0; i < s.length(); i++){
            c = s.charAt(i);
            if(set.contains(c)){
                count += 2;
                set.remove(c);
            }
            else{
                set.add(c);
            }
        }
        return set.size()>0 ? count+1 : count;
    }
}

//TC=> O(n) where n is the length of the string s
//SC => O(n) where n is the length of the string s
