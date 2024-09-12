class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> hmap = new HashMap<>();
        int len =0;
        for(int i =0; i<s.length(); i++){
            char x = s.charAt(i);
            if(hmap.containsKey(x)){
                len +=2;
                hmap.remove(x);
            }else{
                hmap.put(x,1);
            }
            
        }
        if(hmap.isEmpty()){
            return len;
        }
        else 
            return len+1;
}}

//TC:O(n) n is length of the string
//SC: O(n)
