// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Main {

    public static int longestPalindrome(String s) {

        // we are going to make map for storing the character and its frequency.
        int[] map = new int[256];

        int result = 0;

        // traverse through each character in a string s to store frequency of each
        // character
        for (int i = 0; i < s.length(); i++) {
            map[s.charAt(i)]++;
        }

        // we are going to get how many pairs may be possible in this loop and store new
        // value in map after extracting that pairs
        for (int i = 0; i < map.length; i++) {
            result += 2 * (map[i] / 2);
            map[i] = map[i] % 2;
        }

        // if any one element available in the map after extracting pairs. so, we can
        // put it in the middle so we increase result by 1;
        for (int i = 0; i < map.length; i++) {
            if (map[i] > 0) {
                result++;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "abccccdd";
        System.out.println("longest Palindroms is: " + longestPalindrome(s));
    }
}