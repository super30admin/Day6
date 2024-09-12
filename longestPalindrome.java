//TC = O(n);
//SC = O(n);
class Solution {
    public int longestPalindrome(String s) {
        
        HashSet<Character> set = new HashSet<>();
        int count =0;
        for(int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i))){
                set.remove(s.charAt(i));
                count=count+2;
            }
            else{
                set.add(s.charAt(i));
            }
        }
        
        return set.isEmpty()?count:count+1;
    }
}