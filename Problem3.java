//Time complexity: O(N)
//Space complexity : O(N)
//did this problem run on leetcode: yes
// any questions?: no
//409. Longest Palindrome
//https://leetcode.com/problems/longest-palindrome/
class Solution {
    public int longestPalindrome(String s) {
        //we can use hashmap or hashset
        HashMap<Character,Integer> smap = new HashMap<>();
        int count = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            //if that char is not present add that charc to map
            if(!smap.containsKey(c)){
               smap.put(c,1); 
            }
            //if that char is already present increment count by 2 cc and remove that charc from map
            else{
                count += 2;
                smap.remove(c);
            }
        }
        //if hash map is not empty left with {a,b} as cc -2 cc-2 dd-2 total 6 we can take single char from array to make it longest palindrome
        if(!smap.isEmpty())count++;
        return count;
    }
}