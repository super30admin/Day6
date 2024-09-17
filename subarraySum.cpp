class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        unordered_map<int,int> um;
        int count=0,sum=0;
        um[0]++;
        for (int i=0;i<nums.size();i++) {
            sum+=nums[i];
            if (um.find(sum-k)!=um.end())  // if the difference is present in the hash map we add it to the final string 
                count+=um[sum-k];    
            um[sum]++;
        }
        return count;
    }
};