// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        map<int, int> m;
        int sum=0;
        int count =0;
        m[0]=1;
        for(int i=0; i<nums.size(); i++){
           sum=sum+nums[i];
           if(m.find(sum-k)!=m.end()){
              count+=m[sum-k];
           }
          if(m.find(sum)==m.end())
              m[sum]=1;
          else
              m[sum]++;
        }
        
        return count;
    }
};
