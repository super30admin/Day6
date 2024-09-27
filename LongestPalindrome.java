import java.util.HashMap;
import java.util.HashSet;

/*
Time Complexity: O(n)
Space Complexity: O(n)
Worked on Leetcode: Yes
Any difficulties: No

Approach:

 */
public class LongestPalindrome {
    public static int hashMapLongestPalindrome(String s){
        HashMap<Character, Integer> map = new HashMap<>();

        for(char c: s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }else{
                map.put(c, 1);
            }
        }
        int maxLen = 0;
        boolean oddChar = false;
        for(char c: map.keySet()){
            int freq = map.get(c);
            if(c%2 == 0){
                maxLen+=freq;
            }else{
                oddChar = true;
                maxLen+= (freq-1);
            }
        }

        if(oddChar){
            maxLen+=1;
        }
        return maxLen;
    }
    // implementation using hashset
    public static int hashSetLongestPalindrome(String s){
        HashSet<Character> set = new HashSet<>();
        int maxLen  = 0;
        for(char c: s.toCharArray()){
            if(set.contains(c)){
                set.remove(c);
                maxLen+=2;
            }else{
                set.add(c);
            }
        }
        if(set.size()>0){
            return maxLen+1;
        }
        return maxLen;
    }
    public static void main(String[] args){
        System.out.println("Longest Palindrome Size: "+ hashMapLongestPalindrome("abccccdd"));
        System.out.println("Longest Palindrome Size: "+ hashSetLongestPalindrome("abccccdd"));
    }
}
