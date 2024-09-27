import java.util.*;

//time complexity is - o(1)
//Space Complexity is - o(1)

class Solution {
    public int longestPalindrome(String s) {

        //edge case: Check if the string is null or its length is equal to zero
        if(s == null || s.length() == 0){
            return -1;
        }
        int count = 0;
        HashSet<Character> hset = new HashSet<>();
        //check if the character of the string exist in the hashset, if yes
        //increase the count by 2 ( one for exsiting character and one for charcter being compared)
        //if charcter doesn't exist in hset, add it to hset
        for(int i = 0; i < s.length(); i++){
            char h = s.charAt(i);
            if(hset.contains(h)){
                count = count + 2;
                hset.remove(h);
            }else{
                hset.add(h);
            }
        }
        if(!hset.isEmpty()){
            count = count + 1;     
        }
        return count;
    }
}