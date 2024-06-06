import java.util.HashMap;
import java.util.Map;

//time - O(n)
//space - O(1) because at the most we will have 56 entries for lower+uppercase letters
public class LongestPalindrome {
    public int longestPalindrome(String s) {
        if(s==null || s.length()==0) return 0;
        int len = 0;
        boolean oddUsed = false;
        //Map to count frequency of characters
        Map<Character,Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue()%2 == 0){
                len += entry.getValue();
            } else {
                len += entry.getValue()-1;
                if(!oddUsed){
                    len+=1;
                    oddUsed = true;
                }
            }
        }

        return len;
    }
}
