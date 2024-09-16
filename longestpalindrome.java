class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer>map = new HashMap<>();
        int max=0,i;
        for(i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                max+=2;
                map.remove(s.charAt(i));
                
            }
            else{
                map.put(s.charAt(i),1);
            }
        }
        if(!map.isEmpty()) return max+1;
        return max;
    }
}