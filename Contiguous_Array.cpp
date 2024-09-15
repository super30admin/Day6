// Time Complexity : O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : yes

class Solution {
public:
    int findMaxLength(vector<int>& nums) {
        map<int, int> hash_map;
        hash_map.insert(pair<int, int>(0, -1));
        int rsum = 0, maxi = 0;
        for(int i=0;i<nums.size();i++){
            if(nums[i]==0){
                rsum = rsum - 1;
            }
            else{
                rsum = rsum + 1;
            }
            if(hash_map.find(rsum)!=hash_map.end()){
                maxi = max(maxi, i-hash_map[rsum]);
            }
            else{
                hash_map.insert(pair<int,int>(rsum,i));
            }
            cout<<rsum<<endl;
        }
        return maxi;
    }
};
