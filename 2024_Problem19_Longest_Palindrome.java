//409. Longest Palindrome - https://leetcode.com/problems/longest-palindrome/description/
//Time Complexity: O(n)
//Space Complexity: O(1)

//HashSet
class Solution {
    public int longestPalindrome(String s) {
        //base case
        if(s == null || s.length() == 0){
            return 0;
        }
        HashSet<Character> set = new HashSet<>();
        int count=0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(set.contains(c)){
                set.remove(c);
                count = count+2;
            } else {
                set.add(c);
            }
        }
        if(!set.isEmpty()){
            count++;
        }
        return count;
    }
}

//HashMap
class Solution {
    public int longestPalindrome(String s) {
        //base case
        if(s == null || s.length() == 0){
            return 0;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        int length = 0;
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        boolean hasOddFrequency = false;
        for (int count : map.values()) {
            if (count % 2 == 0) {
                length += count;
            } else {
                length += count - 1;
                hasOddFrequency = true;
            }
        }
        if (hasOddFrequency) {
            length += 1;
        }
        return length;
    }
}