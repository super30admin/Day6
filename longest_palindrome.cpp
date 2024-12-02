// Time complexity-O(n)
// space complexity O(n);
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : no

// using a hash set to each character as we iterate
// iterate over each character in the string
// if the character is present in the hash set increment count by 2
// else append the character to the hashset
// after iterating if there is still any character in hash set increment counter by 1

#include <iostream>
#include <vector>
#include<unordered_set>
using namespace std;

class Solution {
    public:
        int longestPalindrome(string s) {
            
            int count =0;
            unordered_set<int> hash_set;
            for(auto c : s){
                
                auto search = hash_set.find(c);
                if(search!= hash_set.end()){
                    count+=2;
                    hash_set.erase(c);
                }
                else{
                    hash_set.insert(c);
                }
            }
            if(!hash_set.empty()){
                count+=1;
            }
            return count;
        }
};