class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        map<int, int> Map;
        Map[0] = 1;
        int sum = 0, result = 0;
        for(int i = 0; i < nums.size(); ++ i){
            sum += nums[i];
            int compliment = sum - k;
            if(Map.count(compliment))
                result += Map[compliment];
            if(Map.find(sum) == Map.end())
                Map[sum] = 1;
            else
                Map[sum] ++;
        }
        return result;
    }
};