
// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No
// Your code here along with comments explaining your approach
/*If element is already present in set then it is repetiton and count incremented by 2.
If not, then it is inserted and in the end if set does not get empty then 
for non repeated elements and count will be incremented by 1.*/
class Solution {
public:
    int longestPalindrome(string s) {

        int n = s.length();
        int count =0;
        unordered_set<int> set;
        for(int i=0; i< n ; i++){
            if(set.contains(s[i])){
                count+= 2;
                set.erase(s[i]);
            }
            else{
                set.insert(s[i]);
            }
        }
        if(!(set.empty())){
            count+= 1;
        }
        return count;
    }
};