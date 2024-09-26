//Q - Longest Palindrome
// Time Complexity : O(n) , n is the size of array
// Space Complexity : O(1)-because alphabets size is fixed and there will be only 52 characters(uppercase and lowercase)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*

2) One Pass : -> O(n) 
             Using Set, just iterate over the array and add the character to the set. If character already exists in the set just increment count counter by 2 and remove that element from the set.
             Before returning the count just check if set is not empty means there are single characters, just increment the count by 1 and return. If the set is empty just return the count. 

2) Two Pass : Using HashMap -> O(2n)
           1) Create A frequency Map for storing frequencies of the characters and bool oddCount for checking if there is odd frequency while iterating over the frequency map. 
           2) Iterate over the frequency map and perform following steps:
                    a) If frequency is even, then just add its value to the global count
                    b) Else if frequency-1 !=0 and add frequency-1 value to the global count and make oddCount = true
                    c) ELse set odd count to true;
                    
                   

*/

import java.util.*;
class Solution16 {
    public int longestPalindrome(String s) {
        
        if(s==null || s.length()==0){
            return 0;
        }
        
        //Using Set One Pass
        Set<Character> set = new HashSet<>();
        int count =0;
        
        for(int i=0;i<s.length();i++){
             if(set.contains(s.charAt(i))){
                 count += 2;
                 set.remove(s.charAt(i));
             }else{
                 set.add(s.charAt(i));
             }  
        }
        
        return set.size()==0 ? count:count+1;
        
        /* Using map --> Two Pass
        Map<Character,Integer> freqMap = new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            freqMap.put(s.charAt(i),freqMap.getOrDefault(s.charAt(i),0)+1);
        }
        
        int count = 0;
        boolean oddCount = false;
        for(char key:freqMap.keySet()){
            int val = freqMap.get(key);
            
            if(val%2==0){
                count += val;
            }else if((val-1)!=0){//when freq is not even and greater than 0
                count += val-1;
                oddCount = true;
            }else if(!oddCount){
                oddCount = true;
            }
        }
        
        return oddCount==false ? count:count+1;*/
    }
}