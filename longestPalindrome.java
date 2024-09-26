// TC : O(N)
// SC : O(N)

class Solution {
    public int longestPalindrome(String s) {
        Set<Character> set =new HashSet<>();
        int count=0;
        for(int i=0; i< s.length(); i++){
            if(set.contains(s.charAt(i))){
                count++;
                set.remove(s.charAt(i));
            }
            else{
                set.add(s.charAt(i));
                   
               }
               
        }
        if(set.isEmpty()) return 2*count;
        return 2*count +1;
    }
}
