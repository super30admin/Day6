// Time Complexity : O(n) 
// Space Complexity : O(1) - As at max we can enter only 26 alphabets or only 256 ASCI characters
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Here we have a HashSet to stroe the character. If the character is already present int he set, we increment the counter by 2 and also remove that character from the set. If the character is not there, then we add that character in the HashSet. Also at last we check for empty case of the HashSet that if the set is not empty, we increment the counter and return that as an answer
class Solution {
    public int longestPalindrome(String s) {
        // Base Case
        if(s.length() ==0){
            return 0;
        }
        //Initializing Hashset to store character
        HashSet<Character> set = new HashSet<>();
        //Initializing counter for longestPalindrome
        int count = 0;
        
        //Initializnig for loop to loop over each character of string
        
        for(int i = 0; i<s.length(); i++){
            //Getting charcter at each location
            Character ch = s.charAt(i);
            //If the character is present in the Hashet, increment counter by 2 and remove the character from the Hashset
            if(set.contains(ch)){
                count += 2;
                set.remove(ch);
            }
            //Else we add the character in hashset
            else{
                set.add(ch);
            }
        }
        // last check for the odd counts of character, so if the hasset is not empty we add 1 to the counter.
        if(!set.isEmpty()){
            count += 1;
        }
        return count;
        
    }
}