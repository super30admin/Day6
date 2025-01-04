import java.util.HashMap;
import java.util.Map;

public class Solution3 {
public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int length = 0;

        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        boolean hasodd = false;

        for(Map.Entry<Character, Integer> item : map.entrySet()){
            if(item.getValue() % 2 == 0){
                length += item.getValue();
            }
            else{
                length += item.getValue() - 1;
                hasodd = true;
            }
        }
        if(hasodd){
            length = length + 1;
        }
        return length;
    }
}
