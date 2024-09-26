/*
Time complexity - O(N), N is the length of the string
Space complexity - O(1), we only need an array of 128 length
*/
class Solution {
public:
    int longestPalindrome(string s) {
        if (s.length() == 0) return 0;
        vector<int> arr(128, 0);
        int res = 0, flag = 0;
        for (char c : s){
            ++arr[c];            
        }
        for (int i : arr){
            res += (i / 2 * 2);
            if (i % 2 == 1) flag = 1;
        }
        return res + flag;
    }
};