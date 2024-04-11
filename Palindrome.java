// Time Complexity : O(n)
// Space Complexity : O(1) As the max number of character that would be added to the hashmap is 26
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int longestPalindrome(String s) {
        int count = 0; //Counter to calc the max length of the palindrome
        boolean flag = false; //Flag to indicate if there are any odd number of characters in the string
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            if(map.containsKey(c)){ //If the character is present in the map
                map.put(c, map.get(c) + 1); //Add one to it's value
            } else{
                map.put(c, 1); //Otherwise add the key-value pair
            }
        }
        for (char ch: map.keySet()){
            if(map.get(ch) % 2 != 0){ //Checks if the value is odd
                count += (map.get(ch) - 1); //Adds the value - 1 to the counter
                flag = true; //Sets flag to true as it is odd
            } else{
                count += map.get(ch); //Otherwise adds the value directly to the counter
            }
        }
        if (flag == true){
            count++; //If the flag is true, then counter will be incremented by 1 as 1 odd character is allowed in a palindrome
        }
        return count;
    }
}