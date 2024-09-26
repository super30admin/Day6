// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Solution {
public:
    int longestPalindrome(string s) {
        set<char> m;
        int count =0;
        for(int i=0; i<s.size(); i++){
            if(m.find(s[i])==m.end())
                m.insert(s[i]);
            else{
                count+=2;
                m.erase(s[i]);
            } 
        }
        
        if(m.empty()==false){
            count=count+1;
        }
        
        return count;
    }
};
