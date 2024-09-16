//Time Complexity = O(N)
//Space Complexity = O(N)
//where N is the number of elements in the array.

class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        map<int, int> m;
        m.insert({0,1});
        int rsum=0, count=0;
        for(int i=0;i<nums.size();i++)
        {
            rsum+=nums[i];
            if(m.find(rsum-k)!=m.end())
                count += m[rsum-k];
            m[rsum]++;
        }
        return count;
    }
};
