
//Time Comlexity - O(1) - total 52 characters O(56) can be calculated as O(1)
//Space Complexity - O(1)


class Solution {
    public int longestPalindrome(String s) {
        
        Set<Character> set = new HashSet<Character>();
        int count = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(set.contains(c)){
                set.remove(c);
                count = count+2;
            }
            else{
                set.add(c);
            }
            
        }
        if(!set.isEmpty()){
            count ++;
        }
        return count ;
        
    }
    
}
