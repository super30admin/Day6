// Using palindrome features to match equal characters to left and right
// Time complexity of O(n)

class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> charSet = new HashSet<Character>();
        int result = 0;

        for(int i=0; i< s.length(); i++){
            char currChar = s.charAt(i);
            if(charSet.contains(currChar)){
                result += 2;
                charSet.remove(currChar);
            }
            else{
                charSet.add(currChar);
            }
        }

        if(charSet.isEmpty()){
            return result;
        }
        else return result + 1;
    }
}