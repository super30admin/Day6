time complexity: O(n)
space complexity: O(n)

class Solution {
    public int longestPalindrome(String s) {
        int count = 0; //count to 0
        HashSet<Character> data = new HashSet<Character>(); //creating a hashset
        for (int i = 0; i < s.length(); i ++) {
            char c = s.charAt(i); // putting into c
            if (data.contains(c)) {  //if the hashset contains c, then increment count by 2
                count += 2;
                data.remove(c); //then remove the character
            }
            else {
                data.add(c); //else add to the hashset
            }
        }
        if (data.size() > 0) { 
            count ++;
        }
        return count; //return count
    }
}