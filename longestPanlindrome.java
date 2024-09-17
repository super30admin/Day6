class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        int count=0;
        Character ch;
        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
            if(hm.containsKey(ch)){
                count=count+2;
                hm.remove(s.charAt(i));
            }else{
                hm.put(ch,1)   ;
            }
        }
        if(!hm.isEmpty()){
            count=count+1;
        }
        return count;
    }
}