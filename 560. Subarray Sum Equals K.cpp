//TC-O{N}
//SC-O(N)
class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
     int n=nums.size();
     int count=0;
     int prefix_sum=0;
        unordered_map<int,int> h;
        h[0]=1;
        for(int i=0;i<n;i++){
            prefix_sum+=nums[i];
            count+=h[prefix_sum-k];
            h[prefix_sum]++;
        }
        return count;
    }
};