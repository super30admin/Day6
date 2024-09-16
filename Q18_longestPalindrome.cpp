//## Problem3 (https://leetcode.com/problems/longest-palindrome)

// Time complexity: O(n) where n is length of string
// Space complexity: O(1) as we need to store max 26/52 chars in hashset
// Idea- if char is not in hashset , add it. If its already ther, remove it and add 2 to the count.
//If left with any elements at end, add 1 . ( odd char can be added once to the palindrome)

//2 ways -> hashmap (2 pass solution) and hashset( 1 pass solution)

//1 pass approach

class Solution {
public:
    int longestPalindrome(string s) {
        unordered_set<char> set1;
        
        int count= 0;
        
        for(int i=0 ; i< s.size() ; i++){
            
            if(set1.find(s[i]) != set1.end() ){
                count += 2;
                set1.erase(set1.find(s[i]));
            }
            else{
                set1.insert(s[i]);
            }
        }
        
        if( set1.size() > 0){
            count += 1;
        }
        
        return count;
    }
};