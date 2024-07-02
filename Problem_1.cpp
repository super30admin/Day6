/*
Time Complexity: O(n)

Space Complexity: O(n) 
*/

#include<iostream>
#include<vector>
#include<unordered_map>

class Solution {
public:
    int subarraySum(std::vector<int>& nums, int k) {
        std::unordered_map <int, long> hashMap;
        hashMap[0] = 1;
        long rSum = 0;
        int countOfSubArray = 0;
        for(int i=0; i<nums.size(); i++){
            rSum = rSum + nums[i];
            long y = rSum - k; 
            if(hashMap.contains(y)){
                countOfSubArray += hashMap.at(y);
            }    
            hashMap[rSum] += 1;
        }
        return countOfSubArray;
    }
};

int main(){
    Solution sol = Solution();
    std::vector<int> arr {1,1,1};
    int k = 2;
    int exp_res = 2;
    int res = sol.subarraySum(arr, k);
    if (res == exp_res){
        std::cout << "Answer matches: " << res << ", Expected res: " << exp_res << std::endl;
    } else {
        std::cout << "Answer do not match: " << res << ", Expected res: " << exp_res << std::endl;
    }

    arr = {1,2,3};
    k = 3;
    exp_res = 2;
    res = sol.subarraySum(arr, k);
    if (res == exp_res){
        std::cout << "Answer matches: " << res << ", Expected res: " << exp_res << std::endl;
    } else {
        std::cout << "Answer do not match: " << res << ", Expected res: " << exp_res << std::endl;
    }
}