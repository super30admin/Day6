Time Complexity : O(n)
Space Complexity : O(n)

Runs on LeetCode : Yes.

#include<iostream>
#include<string>

#include<vector>
#include <unordered_map>
using namespace std;

class LongestPalindrome
{
public:
    int longestPalindrome(string s) {
        unordered_map<char,int> map;        // Create  a new map.
        int count=0,sum=0;
        for(auto i:s) map[i]++;     // insert character of string in map with it's count. Key is String. Value is Count.
        for(auto i:map) 
        {
            if(i.second%2)count++;  //if character repeated even times, count does not increment.
            sum+=i.second;      // add the value to the sum.
        }   

        cout<<sum+1-count;      // Print the answer.
       return sum+1-count;
    }
};

int main()
{
    LongestPalindrome lp;
    lp.longestPalindrome("abccccdd");

    return 0;
}