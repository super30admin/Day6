// Time Complexity : O(1)
// Space Complexity : O(1);
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

import java.util.*;

public class Problem3 {
    public static int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int count = 0;
        int maxOdd = Integer.MIN_VALUE;
        for (int i = 0; i < s.length(); i++) {
            char sC = s.charAt(i);
            map.put(sC, map.getOrDefault(sC, 0) + 1);
        }
        for (int x : map.values()) {
            if (x % 2 == 0) {
                count += x;
            } else {
                count += (x - 1);
                if (x > maxOdd) {
                    maxOdd = x;
                }
            }
        }
        if (maxOdd > 0) {
            count += 1;
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";
        System.out.println(longestPalindrome(s));
    }
}
