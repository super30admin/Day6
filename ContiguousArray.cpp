class Solution {
public:
    int findMaxLength(vector<int>& nums) {
        
        int rSum;
        unordered_map<int,int> map;
        map.insert(0,-1);
        for(auto i =0; i<nums.size();i++)
        {
            if(nums[i] == 0)
            {
                rSum ++;
            }
            else
            {
                rSum--;
            }

            if(map.contains(rSum)){
                i =  map.extract(rSum);
               max = max(max,i )
            }
            else
            {
                map.insert(rSum,i)
            }
        }
        return max;
    }
};