// Author: Subhed Chavan
// Batch: December 24
// Problem Statement: 409. Longest Palindrome
// Approach: Using hash set and occurrence
// Time Complexity: O(n)

class Solution
{
public:
    int longestPalindrome(string s)
    {
        unordered_set<char> set;
        int res = 0;

        // Iterate over the string
        for (int i = 0; i < s.length(); i++)
        {

            // If element is already present in the hash set then add 2 to the count as palindrome can be formed using 2 occurances
            // Also remove the element from hash set
            if (set.find(s[i]) != set.end())
            {
                set.erase(s[i]);
                res = res + 2;
            }

            // Insert into the hash set
            else
            {
                set.insert(s[i]);
            }
        }

        // Check for hash set if any element is present, if present it can be used to create palindrome of odd side
        // So if exisits add 1 to the count
        if (set.size() != 0)
        {
            res = res + 1;
        }

        return res;
    }
};