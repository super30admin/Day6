//Time Complexity - O(n)
//Space Complexity - O(1)
// This solution worked on LeetCode

class Solution {
    public int longestPalindrome(String s) {
        int count =0;                               //count will keep track of the length of the longest palindrome that can be created
        HashSet<Character> hs = new HashSet<>();      //Use HashSet that will maintain the unique characters
        for(char c: s.toCharArray()){
            if(hs.contains(c)){         //if HashSet contains that character already than remove it and add 2 to the count
                hs.remove(c);
                count +=2;
            }
            else{
                hs.add(c);      //if HashSet does not contain that character already
            }
        }
        if(!hs.isEmpty())   count+=1;     // If there are still elements in the HashSet one of them can be added at the middle of the palindrome
        return count;
    }
}
