// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        map<int,int> hash_map;
        hash_map.insert(pair<int,int>(0,1));
        int rsum = 0, c=0;
        for(int i=0;i<nums.size();i++){
            rsum = rsum+nums[i];
            int comp = rsum - k;
            if(hash_map.find(comp)!=hash_map.end()){
                c = c+hash_map[comp];
            }
            if(hash_map.find(rsum)==hash_map.end()){
                hash_map.insert(pair<int,int>(rsum,1));
            }
            else{
                //hash_map.insert(pair<int,int>(rsum, hash_map[rsum]+1));
                hash_map[rsum] = hash_map[rsum]+1;
            }
        }
        return c;
    }
};
