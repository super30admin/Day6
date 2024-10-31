/*
Time Complexity: O(n)
Space Complexity: O(1)
Did this code successfully run on Leetcode :yes
Any problem you faced while coding this : no
*/
class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        int ans=0;
        int prefixSum=0;
        unordered_map<int,int> h;
        h[0]=1;
        for(int i: nums){
            prefixSum += i;
            int excess = prefixSum - k;
            
            if(h.find(excess)!=h.end()){
                ans+=h[excess];
            } 
                h[prefixSum]++;
        }
        return ans;
    }
};