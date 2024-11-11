// Time Complexity : O(n) we loop through the array once
// Space Complexity : O(n) cause we used map
// Did this code successfully run on Leetcode : Yes 
// Any problem you faced while coding this : No
//Approach
// we will use a flag to check if the string is even or odd if it is even we will update the cnt
// if even we can use it at the end and return by adding 1 to cnt
class Solution {
public:
    int longestPalindrome(string s) {
        unordered_map<char,int>mpp;
        bool flag = false;
        int cnt =0;
        for(auto it:s){
            mpp[it]+=1;
        }
        for(auto qt:mpp){
            if(qt.second%2!=0){
                flag = true;
                //aaaaaaa 9/2 = 1
                cnt+=(qt.second)-1;
            }
            else{
                cnt+=(qt.second);
            }
        }
        if(flag){
            return cnt+1;
        }
        return cnt;
    }
};