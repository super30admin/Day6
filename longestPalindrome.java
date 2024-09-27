

//Time Complexity : O(n)
//Space Complexity : O(n)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : Noclass Solution {
    public int longestPalindrome(String s) {
     //trying to check for pairs of characters and if the same character is encountered which is present in the hasmap, we can remove it and add 2 to the count which will be the result.   
        HashMap<Character,Integer> map1 = new HashMap<>();
        int count = 0;
        
        for(int i = 0; i < s.length(); i ++){
            
            if(!map1.containsKey(s.charAt(i))){
                
                map1.put(s.charAt(i), 1);
            }
            
            else{
                
                count ++;
                map1.remove(s.charAt(i));
                count ++;
            }
        }
        
        if(!map1.isEmpty()){
            
            count ++;
        }
        return count;
    }
}