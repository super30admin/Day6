//Problem3 (https://leetcode.com/problems/longest-palindrome)
//T:O(N)
//S:O(N)
//

class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        int size = 0;
        int mid = 0;

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue()%2==0){
                size += entry.getValue();
            }else{
                mid = 1;
                size += entry.getValue()-1;
            }
        }

        return size+mid;
    }
}