// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
import java.util.HashMap;

public class LongestPalindrome {
    public static int longestPalindrome(String s) {
        if(s.length()==1)
            return 1;
        else{
            HashMap<Character,Integer> map = new HashMap<>();
            for(char c:s.toCharArray()){
                if(!map.containsKey(c))
                    map.put(c,1);
                else{
                    map.put(c,map.get(c)+1);
                }
            }
            int result=0;
            int odd = 0,i=0;
            for(Character c:map.keySet()){
                if(map.get(c)%2==0)
                    result = result+map.get(c);
                else{
                    odd = odd+map.get(c);
                    i++;
                }
            }
            if(odd==0)
                return result;
            else
                return result+odd-(i-1);

        }
    }

    public static void main(String[] args) {
        String s = "civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";
        System.out.println(longestPalindrome(s));
    }
}
