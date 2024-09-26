//Space Complexity: O(1)
//Time Complexity: O(n), where n is the length of the string.
//Executed successfully on leetcode.

class Solution {
public:
    int longestPalindrome(string s) {
        unordered_set<char> st;
        int count = 0;
        for(char c: s){
            if(st.find(c)==st.end()){
                st.emplace(c);
            }
            else{
                st.erase(c);
                count += 2;
            }
        }
        if(!st.empty()){
            count += 1;
        }
       return count; 
    }
};