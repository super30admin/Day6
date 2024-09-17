// 409 Longest Palindrome
// solved on leetcode
// Time Complexity - O(n)
// Space complexity -O(n)
class Solution {
    public int longestPalindrome(String s) {
        
        HashSet<Character> hashset = new HashSet();
        int result=0;
        for(int i=0;i<s.length();i++){
            
            if(hashset.contains(s.charAt(i))){
                result+=2;
                hashset.remove(s.charAt(i));
            }else{
                hashset.add(s.charAt(i));
            }
        }
        if(!hashset.isEmpty()){
            result+=1;
        }
        return result;
        
        
    }
}