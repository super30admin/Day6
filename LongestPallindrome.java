/*
    First Solution (Method name : longestPalindrome)
    Time Complexity : O(N)
    Space Complexity : O(1)

    is working on leetcode :  YES
*/
public class LongestPallindrome {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch, 0);
            }
            map.put(ch,map.get(ch) +1);
        }
        int count =0;
        
        for(Character ch: map.keySet()){
            int val = map.get(ch);
            count += val/2 * 2;
        }
        if( count == s.length()){
            return count;
        }else{
            return count+1;    
        }
            
    }
    public int longest_pallindrom_hashset(String s){
        HashSet<Character> set = new HashSet<>();
        int count =0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!set.contains(ch)){
                set.add(ch);
            }else{
                set.remove(ch);
                count+=2;
            }
        }
        if(count ==  s.length()){
            return count;
        }else{
            return count+1;
        }
        
    }

}class LongestPallindrome {
    
}