/*
Time Complexity: O(n)

Space Complexity: O(n) 
*/

#include<iostream>
#include<string>
#include<unordered_set>

class Solution {
public:
    int longestPalindrome(std::string s) {
        std::unordered_set <char> hashSet;
        int lenthOfLongestPalindrome = 0;
        for (int i = 0; i<s.length(); i++){
            if (hashSet.contains(s[i])) {
                lenthOfLongestPalindrome += 2;
                hashSet.erase(s[i]);
            }
            else hashSet.insert(s[i]);
        }
        if (!hashSet.empty()) lenthOfLongestPalindrome += 1;
        return lenthOfLongestPalindrome;
    }
};

int main(){
    Solution sol = Solution();
    std::string s ="abccccdd";
    int exp_res = 7;
    int res = sol.longestPalindrome(s);
    if (res == exp_res){
        std::cout << "Answer matches: " << res << ", Expected res: " << exp_res << std::endl;
    } else {
        std::cout << "Answer do not match: " << res << ", Expected res: " << exp_res << std::endl;
    }

    s ="a";
    exp_res = 1;
    res = sol.longestPalindrome(s);
    if (res == exp_res){
        std::cout << "Answer matches: " << res << ", Expected res: " << exp_res << std::endl;
    } else {
        std::cout << "Answer do not match: " << res << ", Expected res: " << exp_res << std::endl;
    }
}
