public class Solution{
 public int longestPalindrome(String  str){
        char[] chars= str.toCharArray();
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(Character c: chars){
            if(map.containsKey(c)) map.put(c,map.get(c)+1);
            else map.put(c,1);
        }
        int ct=0;
        for(Character c: map.keySet()){
           ct+=map.get(c)/2; 
        }
        return ct*2<chars.length?ct*2+1:ct*2;
    } 
}
