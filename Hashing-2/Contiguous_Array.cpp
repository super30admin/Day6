/*
Time Complexity: O(n)
Space Complexity: O(n)
Did this code successfully run on Leetcode :yes
Any problem you faced while coding this : no
*/
class Solution {
public:
    int findMaxLength(vector<int>& nums) {
        int ans=0;
        unordered_map<int, int> m;
        m[0]=-1;
        int prefixSum = 0;
        for(int i = 0; i<nums.size();i++){
            if(nums[i] == 0){prefixSum+=-1;}
            else {prefixSum+=1;}
            
            if(m.find(prefixSum)!=m.end()){
                int len = i - m[prefixSum];
                ans=max(ans,len);
            } else{
                m[prefixSum]=i;
            }
        }
        return ans;
    }
};