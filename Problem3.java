/* Problem 3: Longest Palindrome
*/

// Time Complexity : O(n) single pass solution
// Space Complexity : O(1) constant space since we will maintain 26 characters
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//Palindrome is a string which is same if we do reversal
//Here we are making a palindrome string out of these characters in input string
//There are 4 techniques: HashMap, HashSet, Array, LinkedList
//Since, we are maintaing a frequency map of each character and see if its even or not
//We can approach HashMap since we will be able to maintain counter and search operation will be O(1). This will give two pass solution.
//Approach1: HashMap: O(t) = O(n) for creating frequency map + O(n) to check in the mpa if its even or odd and O(s) = O(n) constant time since we will have 26 characters equal to O(1)
//Follow up question by interviewer: Can we do this in single pass O(n)? Yes, use HashSet
//Approach 2: HashSet O(t) = O(n) and O(s) = O(1)
//In hashset, we will iterate over the string and check if the char exist in hashset,
//1. If it exist, update the counter to 2 and remove that character
//2. else, keep iterating
//in the end, check if hashset is empty or not,
//1. if its not empty, so we have odd frequency char and increment the counter to 1

class Solution {
    public int longestPalindrome(String s) {
        //initialising hashset
        HashSet<Character> set = new HashSet<>();
        //initialise counter result
        int result = 0;
        //iterating over the string
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            //check if char exist in hashset
            if(set.contains(c)){
                //increment the counter
                result += 2;
                //then remove the char from hashset
                set.remove(c);
            } else {
                //if char doesn't exist in hashset
                set.add(c);
            }
        }
        //check if hashset is empty or not
        //itf its not empty then increment counter by 1 since we will have odd frequency char that we can use in the center
        if(!set.isEmpty()) result++;
        return result;
    }
}