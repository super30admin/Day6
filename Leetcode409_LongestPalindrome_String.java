
//approach - add values to Hashmap and keep checking if it contains the value. 
//if value present in Set, len == len+2; and remove value from the set , so we have got all the even occrrances this way. //At last just check if set is not empty, means it has odd occurrances, so add +1

//time - O(n) -- traversing through string
//space - O(1)

class Solution {
    public int longestPalindrome(String s) {

        if (s == null)
            return 0;
        if (s.length() == 1)
            return 1;

        int len = 0;
        Set<Character> set = new HashSet();
        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                len = len + 2;
                set.remove(s.charAt(i));
            } else {
                set.add(s.charAt(i));
            }
        }
        if (set.size() > 0)
            return len + 1;

        return len;

    }
}