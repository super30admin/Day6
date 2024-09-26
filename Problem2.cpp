// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Solution {
public:
    int findMaxLength(vector<int>& nums) {
        map<int, int> m;
        m[0] = -1;
        int sum =0;
        int max =0;
        for(int i=0; i<nums.size(); i++){
           if(nums[i]==0) sum--;
           else if(nums[i]==1) sum++;
            
            if(m.find(sum)!=m.end()){
                int len = i-m[sum];
                if(len>max) max = len;
            }
            else{
                m[sum]=i;
            }
        }
        
        return max;
    }
};
