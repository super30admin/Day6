// Time complexity: O(n)
// Space complexity: O(n)
class SolutionThree {
    public int longestPalindrome(String s) {
        if(s.length() < 1 || s.length() > 1010){
            return 0;
        }
        
        int count = 0;
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if(set.contains(c)){
                count = count+2;
                set.remove(c);
            }
            else{
                set.add(c);
            }
        }
        
        if(!set.isEmpty()){
            count = count + 1;
        }
        
        return count;
    }
}
