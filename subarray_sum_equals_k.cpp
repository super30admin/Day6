//Time Complexity - O(N)
//Space Complexity - O(N)

class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        int ans=0,curr=0,i,n=nums.size();
        unordered_map<int,int>m;
        for(i=0;i<n;i++){
            curr+=nums[i];
            if(curr==k)
                ans++;
            if(m.find(curr-k)!=m.end()){
                ans+=m[curr-k];
            }
            m[curr]++;
        }
        return ans;
    }
};