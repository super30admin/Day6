/** 
Store frequency in a char array
When freq is event add to count
When freq is odd store freq -1/ set boolean flag true that an odd value was encountered.

Time complexity - O(n) Space Complexity - O(1)
*/


class Solution {
    public int longestPalindrome(String s) {
        if(s.length()==1) return 1;
        char[] charArray = new char[60];
        int count =0;
   
        for(char c : s.toCharArray()){
           
            if(charArray[c-'A']!=0){
                count+=2;
               charArray[c-'A']=0; 
            }
            else 
                charArray[c-'A']=c;
        }

        for(char f : charArray){
            //check if even
            if(f != 0) {
                count+=1;
                return count;
            }  
        }
        return count;
    }
}