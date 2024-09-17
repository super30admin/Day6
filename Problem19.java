import java.util.*;

/**
 * https://leetcode.com/problems/longest-palindrome/
 * github readme Problem3
 * time complexity: O(n) + O(26) => O(n)
 * space complexity: O(26) => O(1)
 * Did this code successfully run on Leetcode : yes
 * Any problem you faced while coding this : no
 * 
 * 1. Store occurence of each letter in hashMap
 * 
 * Ex. a b c d d d e d e l
 * HashMap
 * a : 1
 * b : 1
 * c : 1
 * d : 4
 * e : 2
 * l : 1
 * 
 * 2. Iterate the HashMap and 
 *      if value is even, add the value
 *      if value is odd, add value-1
 * 
 * 3. Iterate thru the values and check if 
 */
public class Problem19{
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(!map.containsKey(c)){
                map.put(c, 1);
            } else {
                int count = map.get(c) + 1;
                map.put(c, count);                
            }

        }
        
        int result = 0;
        
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            
            if(value%2 == 0){
                result += value;
                 entry.setValue(0);
            } else {
                result += value-1;
            }
        }
        
        for(var v: map.values()){
            if(v%2!=0){
                result++;
                break;
            }
        }
                
        return result;
    }

    public static void main(String[] args) {
        
    }
}

/**
 * time: O(n)
 * space: O(1)
 * Did this code successfully run on Leetcode : yes
 * Any problem you faced while coding this : no
 */
class Problem19Approach1{
    public int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<>();
        int result = 0;
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(!set.contains(c)){
                set.add(c);
            } else {
                result += 2;
                set.remove(c);
            }
        }
        
        if(!set.isEmpty()) result += 1;
           
        return result;
    }
}