// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> hs = new HashSet<>();
        int count = 0;
        for(int i=0;i<s.length();i++) {
            char curr = s.charAt(i);
            if(hs.isEmpty() || !hs.contains(curr))
                hs.add(curr);
            else {
                //when found a match, remove it from hashSet
                //so that we will only have distinct element left at the end
                hs.remove(curr);
                count += 2;
            }
        }
        //when character is pending in hashSet post find the palindrome match,
        //we return the palidrome match count + 1 for the non-pair elements
        return hs.size() >=1 ? count+1 : count;
    }
}

// To build the palindrome string out of the existing approach
//class Solution {
//    public String longestPalindrome(String s) {
//        HashSet<Character> hs = new HashSet<>();
//        StringBuilder left = new StringBuilder();
//        for(int i=0;i<s.length();i++) {
//            char curr = s.charAt(i);
//            if(hs.isEmpty() || !hs.contains(curr))
//                hs.add(curr);
//            else {
//                hs.remove(curr);
//                left.append(curr);
//            }
//        }
//        if(hs.size() >=1) {
//            StringBuilder right = new StringBuilder(left).reverse();
//            left.append(hs.toArray()[0]);
//            left.append(right);
//        }
//        return left;
//    }
//}