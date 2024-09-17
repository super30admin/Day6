// Time Complexity : O(n) - n is the length of string. Unordered set is O(1) for lookup and insertion and worst case O(n). So O(n)+O(n) == O(n)
// Space Complexity : O(1) - We use a map that can at maximum just store 52 elements.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None
class Solution {
public:
    int longestPalindrome(string s) {
        unordered_set<char> tracker;
        int count = 0;
        for(auto iter = s.begin(); iter!=s.end(); ++iter){
            if(tracker.find(*iter)!=tracker.end()){
                count+=2;
                tracker.erase(*iter);
            }
            else{
                tracker.insert(*iter);
            }
        }
        if(!tracker.empty()){
            count+=1;
        }
        return count;    
    }
};