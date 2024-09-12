class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        unordered_map<int,int> map;
        int rSum = 0 ;
        int count = 0;

        map.insert(0,1);
        for(int i =0;i<nums.size();i++)
        {
            rSum = nums[i];
            if(map.contains(rSum - k))
            {
                count = count + (map.extract(rSum - k));
            }
            map.insert(rSum,map.emplace(rSum,0)+1)
        }
        
        return count;
    }
};