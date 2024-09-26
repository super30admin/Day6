// Time Complexity : O(n)
// Space Complexity :  O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this - 

class Solution {
public:
    int longestPalindrome(string s) {
        
        int total_count = 0;
        int i = 0;
        unordered_set <char> char_set;

        //Traverse the whole string        
        while(s[i] != '\0')
        {

            // New Character condition   
            if(char_set.find(s[i]) == char_set.end())
            {
                char_set.insert(s[i]);
            }
            // Character repeated condition
            else
            {
                //Remove from Set, Increment total by 2
                char_set.erase(s[i]);
                total_count += 2;
            }
            
            i++;
        }

        // If single element present, increment total count      
        if(!char_set.empty())
        {
            total_count++;
        }
        
        return total_count;
    }
};