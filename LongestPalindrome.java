//Time Complexity: O(n)
//Space Complexity: O(1)
import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {
    public static int longestPalindrome(String s) {

        int result = 0;
        int highestOdd = 0;
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for(int i = 0; i<s.length();i++){
            char c = s.charAt(i);
            hashMap.put(c, hashMap.getOrDefault(c,0)+1);
        }

        for(Map.Entry<Character,Integer> entry : hashMap.entrySet()){
            if(entry.getValue()%2==0){
                result = result + entry.getValue();
            }
            else{
                result = result + entry.getValue() - 1;
                highestOdd = 1;
            }
        }

        return result + highestOdd;

    }

    public static void main(String[] args){
        int result = longestPalindrome("agsheyyyddbnbb");
        System.out.println("The longest palindrome possible is: " + result);
    }
}
