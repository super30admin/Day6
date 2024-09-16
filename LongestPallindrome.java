//Time Complexity: O(n)
//Space Complexity: O(n)

import java.util.HashMap;
import java.util.Map;

public class LongestPallindrome {
    public static int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i)))
            {
               map.put(s.charAt(i), map.get(s.charAt(i))+1); 
            }
            else{
                map.put(s.charAt(i),1);
            }
        }
        int sum = 0;
        System.out.println(map);
        // Adding all the values by dividing it by 2 and doubling it
        // Now, checking if the sum is even and the map value is odd then we increment sum by 1 
        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            sum += entry.getValue() / 2 * 2;
            if(sum % 2 == 0 && entry.getValue() % 2 == 1 ){
                sum++;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(longestPalindrome("sadasdasdgasjdgjasgdhsagdjasdkasgdk"));
    }
}