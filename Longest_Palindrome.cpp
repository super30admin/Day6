// longestPalindrome.cpp : This file contains the 'main' function. Program execution begins and ends there.
//Time complexity - O(n*l) n being number of unique characters and l being length of string
//Space complexity - o(n) - n being number of unique characters.

#include <iostream>
#include <unordered_map>
#include <string>

using namespace std;

class Solution {
public:
    int longestPalindrome(string s) {
        unordered_map<char, int> count;
        int palindromeLength = 0, singleValue = 0;
        for (int i = 0;i < s.length();i++) {
            count[s[i]] = count[s[i]] + 1;
        }

        for (auto k : count) {
            int value = k.second;
            if (value % 2 == 1 || value == 1)
                singleValue = 1;
            palindromeLength += value - (value % 2);
        }
        palindromeLength += singleValue;
        return palindromeLength;
    }
};

int main()
{
    Solution s;
    string input = "bb";
    cout << s.longestPalindrome(input) << endl;
}

