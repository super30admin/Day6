/*
    Time Complexity : O(n)
    Space Complexity : O(1)
*/
class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        
        int ans = 0;
        boolean isFirstOdd = false;
        for(int val : map.values()){
            if(val%2==0){
                ans = ans + val;
            }else{
                if(isFirstOdd){
                    ans = ans + (val - 1);
                    
                }else{
                    ans = ans + val;
                    isFirstOdd = true;
                }
            }
        }
        
        return ans;
    }
    
}
