//time complexity: O(n)
//space complexity:O(n)
//approach: using hashmap
//solved on leetcode? yes
//problem faced? yes, I could not think of this approach.
class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        int sum=0;
        int count=0;
        unordered_map<int,int>map{{0,1}};
        for(int i:nums)
        {
            sum+=i;
            count+=map[sum-k];
            map[sum]++;
        }
        return count;
    }
};