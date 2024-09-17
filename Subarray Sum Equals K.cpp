//Time Complexity- O(n)
//Space Complexity- O(n)

class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        
        unordered_map<int,int> mp;
        int sum=0;
        int ans=0;
        mp[0]=1;
        
        for(int num:nums){
            sum+=num;
            
            if(mp.find(sum-k)!=mp.end()){
                ans+=mp[sum-k];
            }
            mp[sum]++;
        }
        return ans;
    }
};