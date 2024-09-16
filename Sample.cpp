// Time Complexity : o(n)
// Space Complexity : o(n).
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this : taking hashmap to store the count and index.


// Your code here along with comments explaining your approach


class Solution {
public:
    int findMaxLength(vector<int>& nums) {
        
        
        unordered_map<int,int> map;
        map[0] = -1;
        
        int maxx = 0;
        int n  = nums.size();
        int count = 0;
        for(int i = 0;i<n;i++) {
            
            if(nums[i] == 1) {
                count++;
            } else {
                count--;
            }
            
          if(map.find(count) == map.end()) {
              map[count] = i;
          } else {
              maxx = max(maxx,i - map[count]);
          }  
        }
        
        return maxx;
    }
};