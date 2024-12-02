//Time Complexity:O(N)
//Space Complexity:O(1)
//In this problem every character in the string is traversed through and if it is not present in the set, it is added to the string. If it is already present, the count is incremented by 2 and that particular character will be removed from the set. Finally if the set is not empty, we will add 1 to the count and return it. 
// This code was successfully executed and got accepted in leetcode.


class Solution {
    public int longestPalindrome(String s) {
        int count =0;
        HashSet<Character> h=new HashSet<Character>();
        for (int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!h.contains(c)){
                h.add(c);
            }
            else{
                count+=2;
                h.remove(c);
            }
            
        }
        if(!h.isEmpty()){
                count+=1;
            }
        return count;
    }
}