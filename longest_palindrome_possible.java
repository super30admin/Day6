
// BRUTE FORCE 
// TC: O(n) checking through the entire hashmap [O(1) -search] for each character in the string and updating the values ,
//          and 2 more iterations through hashmap for getting the even numbers and the checking for atleast one left over character or not
// SC: O(n) for hashmap
// Leetcode successful

//DOUBTS:
//1---> For iteration through Hashmpap, I used the entry set, do that take any space/memory?
//2---> Is coming up with this kind of brute force approach good when I don't know the optimized soln?  [Any tips on how to improve better]
import java.util.*;
class Solution_1 {
    public int longestPalindrome(String s) {
        int count = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            // Print current character
            if(!map.containsKey(s.charAt(i))){
             map.put(s.charAt(i),1);   
            }
            else map.put(s.charAt(i),map.get(s.charAt(i)) + 1);
        }
        
        for (HashMap.Entry<Character, Integer> set : map.entrySet()) {
            // Printing all elements of a Map
            System.out.println(set.getKey() + " = " + set.getValue());
            if(set.getValue()%2==0){
                count = count+ set.getValue();
            }
            else 
                count = count + set.getValue()-1;
        }
        for (HashMap.Entry<Character, Integer> set_2 : map.entrySet()) {
            if(set_2.getValue()%2!=0){
             return count+1;
            }
        }
        return count;
    }
}


//OPTIMIZED CODE

//TC: O(n) length of the string
//SC: O(n)  utmost 52 characters for HashSet
//Leetcode successful


class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<>();
        int count =0;
        for(int i=0; i< s.length();i++){
            char c = s.charAt(i);
            if(set.contains(c))
            {count = count+2;
             set.remove(c);
            }
            else set.add(c);
        }
        if(!set.isEmpty())
            count++;
        
        return count;
    }
}