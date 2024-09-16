// Problem3 (https://leetcode.com/problems/longest-palindrome)
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
public:
    int longestPalindrome(string s) {
        if(s.length() == 0){
            return 0;
        }
        unordered_map<char, int> hmap;
        int count = 0;
        int flag = 0;
        //get the frequency
        for(int i=0;i<s.length();i++){
            hmap[s[i]]++;
        }
        for(auto it=hmap.begin();it!=hmap.end();it++){
            if(it->second % 2 ==0){
                count += it->second;
            }else{
                count += it->second - 1;
                flag = 1;
            }
            
        }
        if(flag == 1){
            count+=1;
        }
        
        return count;
    }
};