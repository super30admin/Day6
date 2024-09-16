//Time Complexity= O(n)
//Space Complexity= O(n)
class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        
       unordered_map<int, int> mp;
        int sum=0;
        mp[sum]++;
        int ans=0;
        for(int i=0;i<nums.size();i++){
            sum+=nums[i];
            if(mp.count(sum-k))ans+=mp[sum-k];
            mp[sum]++;
        }
        return ans;
    }
};