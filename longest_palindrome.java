//TimeComplexity O(n)
//SpaceComplexity O(1) Total Characters Lowercase + uppercase letters (26+26) = 52 which is constant
class Solution {
    public int longestPalindrome(String s) {
      HashSet<Character> set = new HashSet<>();
        int count = 0;
        for(int i = 0 ; i < s.length(); i++){
            if(set.contains(s.charAt(i))){
                count += 2;
                set.remove(s.charAt(i));
            }else{
                set.add(s.charAt(i));
            }
        }
        
        if(!set.isEmpty()){
            count++;
        }
        return count;
        
    }
}
