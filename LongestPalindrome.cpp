// Time Complexity : O(n)
// Space Complexity : O(1) max set size will not exceed 26.
// Did this code successfully run on Leetcode : yes

// Three line explanation of solution in plain english.
/* Valid palindrome string can contain - n "Event length chars" + "Only one odd length char"
 * Maintain hash set, for each array element check if it's present in hash set
 *      If present, then add 2 to result and remove element from set.
 *      Else, add the element in set.
 * After iterating over array, if set is not empty then add 1 in result and return result.
 */

class Solution {
public:
    int longestPalindrome(string s) {
        if (s.empty())
            return 0;
        
        set<char> st;
        int result = 0;
        
        for (char c : s)
        {
            if (st.find(c) != st.end())
            {
                result += 2;
                st.erase(c);
            }
            else
            {
                st.insert(c);
            }
        }
        
        if (!st.empty())
            result++;
        
        return result;
    }
};