//time complexity: o(n)


class Solution {
    public int longestPalindrome(String s) {
        if(s == null || s.length() == 0) return 0;
        HashSet<Character> Pal_set = new HashSet<>();
        int count = 0;
        
        for(int i =0;i < s.length() ; i++){
            char c = s.charAt(i);
            if(Pal_set.contains(c)){
                count += 2;
                Pal_set.remove(c);
                
            }else{
                Pal_set.add(c);
            }
        }if(!Pal_set.isEmpty()){
            count ++;
        }
        
        return count;
        
        
    }
}
