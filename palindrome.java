//time complexity:O(n)
//space complexity:O(1)
class Solution {
    public int longestPalindrome(String s) {
        Set<Character> set=new HashSet();
        int count=0;
        for(char c : s.toCharArray()){
            if(set.contains(c)){
                count+=2;
                set.remove(c);
            }
            else{
                set.add(c);
            }
        }
        if(set.isEmpty())return count;
        return count+1;
    }
}