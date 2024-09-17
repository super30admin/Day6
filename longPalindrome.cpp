// Time Complexity :O(n) 
// Space Complexity : O(1)  
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Count the number of occerences for characters using an hashmap, all the even count can be considered for the palindrome and any single odd instance can be considered if it exists(middle of the palindrome.) 

class Solution {
public:
    int longestPalindrome(string s) {
        vector<int> hSet(52,0);
        bool isOdd = false;
        int count = 0;
        for(int i = 0; i<s.size();i++){
            if(s[i] <= 'Z')
                hSet[s[i] - 'A']++;
            else
                hSet[s[i] - 'a' + 26]++;
        }
        for(int i=0; i< hSet.size();i++){
            count+=hSet[i]/2;
            if(hSet[i]%2==1)
                isOdd = true;
        }
        return isOdd?((2*count)+1):(2*count);
    }
};