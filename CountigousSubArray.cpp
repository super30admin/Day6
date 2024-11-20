class Solution {
public:
    int findMaxLength(vector<int>& nums) {
        unordered_map<int, int> hmap;
        int sum = 0;
        int maxLen = 0;

        for(int i=0; i<nums.size(); ++i)
        {
            if(nums[i] == 1)
            {
                ++sum;
            }
            else
            {
                --sum;
            }

            if(sum == 0)
            {
                maxLen = max(maxLen, i+1);
            }
            else
            {
                if(hmap.find(sum) != hmap.end())
                {
                    maxLen = max(maxLen, i - hmap[sum]);
                }
                else
                {
                    hmap[sum] = i;
                }
            }
        }

        return maxLen;
    }
};