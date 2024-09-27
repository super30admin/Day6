class Solution {
    public int longestPalindrome(String s) {
        
        HashMap<Character, Integer> charMap = new HashMap<>();
        for(int i=0;i<s.length();i++) {
            int count = charMap.containsKey(s.charAt(i)) ? charMap.get(s.charAt(i)) : 0;
            charMap.put(s.charAt(i), count + 1);
        }
        boolean oneOdd = true;
        int result =0;
        
        
        for(int value : charMap.values()){
            if(value % 2 ==0)
                result += value;
            
             else if( value % 2 == 1 ){
                 if(oneOdd){
                     oneOdd=false;
                result += value;
                 }
                 else
                    result += value -1;
             }
            
        }
        return result;
        
    }
}

//TC: O(N)
// space: O(n)
