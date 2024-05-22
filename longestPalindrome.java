/*
 * Approach: count occurences of a character in the string and maintain a hashMap
 * with character as key and count as value
 * 
 * Add characters from input string to the hashSet, every time we have duplicates we add
 * count 2 and delete the character from hashSet. 
 * All characters with odd number of occurences are in the hashSet, to capture the next
 * pair of characters, all even number of occurences have 2 added to the count
 * 
 * If the hashSet is not empty add 1 to the count total since we iterated over the input string

 * Time Complexity: O(n) - n being length of the string
 * Space complexity: O(1) - constant hashSet size, 26 lower case letters or limited numbers since we are using hashSets
 */


 class Solution {
    public int longestPalindrome(String s) {
        
        if(s == null || s.length() == 0) return 0;

        int ct = 0;
        HashSet<Character> set= new HashSet<>();

        // add characters from input string to the hashSet, every time we add
        for(int i = 0;i < s.length(); i ++){
            char c = s.charAt(i);
            if(set.contains(c)){
                ct = ct + 2;
                set.remove(c);
            } else {
                set.add(c);
            }
        }
        if(!set.isEmpty()) ct++;
        return ct;
    }
}