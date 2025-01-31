// Time complexity: O(n)
// Space complexity: O(n)
// Did this code run successfully on leetcode: Yes

//Approach:
// 1. Create a hashmap to store the occurance of each character in the string.
// 2. If value of key is divisible by 2, add it to the result.
// 3. If value of key is not divisible by 2, add value pair.second / 2 * 2 to the result.
// 4. If there is any character with odd occurance, add 1 to the result.

class Solution {
public:
    int longestPalindrome(string s) {
        unordered_map<char, int> freq;

        for(char c : s){
            freq[c]++;
        }
        int longest = 0;
        bool odd = false;
        for(const auto& pair : freq){
            if(pair.second % 2 == 0){
                longest += pair.second;
            }
            else{
                longest += (pair.second / 2) * 2;
                odd = true;
            }
        }
        if(odd){return longest+ 1;}
        return longest;
    }
};