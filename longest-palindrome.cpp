/*
Use an unordered set (mySet) to keep track of characters encountered.
Iterate through the characters of the string. If a character is already in the set, it indicates a pair for forming a palindrome. Increment the count by 2 and remove the character from the set. If not, add the character to the set.
If the set is not empty at the end, it means there are characters that cannot form pairs. Increment the count by 1.
Time and Space Complexity:

Time Complexity: O(N)
Space Complexity: O(K)*/
#include<bits/stdc++.h>
using namespace std;
class Solution {
public:
    int longestPalindrome(string s) {
        unordered_set<int> mySet;
        int count=0;
        for(char c:s){
            if(mySet.contains(c)){
                count+=2;
                mySet.erase(c);
            }else{
                mySet.insert(c);
            }
        }
        if(!mySet.empty())count++;
        return count;
    }
};
