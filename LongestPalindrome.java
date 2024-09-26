/*

Thought Process: We count the number of characters in a hashmap. For all the even count, add to the result. For all the odd count, set odd flag to true, add count-1 to result. Finally if flag was true return result + 1 ( To include any single character) else return result.

T.C -> 2 Pass O(N) where N is the length of the String s
S.C -> O(N) to store characters, but the number of characters could be only upper / lower case letters i.e 52 letters in total. Therefore we have space as O(1) and not O(N)

*/
import java.util.*;
class LongestPalindrome {
    public int longestPalindrome(String s) {
        if(s.length() == 0) return 0;
        int result = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(Character c : s.toCharArray()){
            map.put(c , map.getOrDefault(c, 0)+1);
        }
        
        Iterator itr = map.entrySet().iterator();
        boolean flag = false;
        while(itr.hasNext()){
            Map.Entry<Character, Integer> ele = (Map.Entry) itr.next();
            if(ele.getValue() % 2 == 1){
                flag = true;
                
                // Mistakes committed -> Forgot to add even count of odd char counts
                result += ele.getValue() - 1;
            }
            else
                result += ele.getValue();
        }
        if(flag) return result+1;
        else return result;
    }
}