/*
Time Complexity -->
O(n)

Space Complexity -->
O(1) since only alphabets are stored

Approach -->
1. Create a set
2. Whenever encountering a new character add to set
3. if the char is already present in the set remove and incerrement by 2
4. Check if set is empty if not increement count by 1
*/

class Solution {
    public int longestPalindrome(String s) {
        if (s.length()==1){
            return 1;
        }
        
        //Create HashSet
        HashSet<Character> set = new HashSet<>();
        int count = 0;// Keep a count
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(set.contains(c)){
                set.remove(c);
                count+=2;
                
            }//if
            else{
                set.add(c);
            }
        }//for
        
        if (! set.isEmpty()){
            
            count+=1;
            
            
        }
        
        return count;
        
    }
}