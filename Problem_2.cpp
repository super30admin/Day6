/*
Time Complexity: O(n)

Space Complexity: O(n) 
*/
#include<iostream>
#include<vector>
#include<unordered_map>

class Solution {
public:
    int findMaxLength(std::vector<int>& nums) {
        std::unordered_map <int, int> hashMap;
        hashMap[0] = -1;
        int rSum = 0;
        int longestArray = 0;
        for(int i=0; i<nums.size(); i++){
            if(nums[i] == 0){
                rSum--;
            }else{
                rSum++;
            }
            if(hashMap.contains(rSum)){
                int difference = i - hashMap.at(rSum);
                if (difference > longestArray) longestArray = difference;
            }else{
                hashMap[rSum] = i;
            }
        }
        return longestArray;
    }
};

int main(){
    Solution sol = Solution();
    std::vector<int> arr {0,1,0};
    int exp_res = 2;
    int res = sol.findMaxLength(arr);
    if (res == exp_res){
        std::cout << "Answer matches: " << res << ", Expected res: " << exp_res << std::endl;
    } else {
        std::cout << "Answer do not match: " << res << ", Expected res: " << exp_res << std::endl;
    }

    arr = {0, 1};
    exp_res = 2;
    res = sol.findMaxLength(arr);
    if (res == exp_res){
        std::cout << "Answer matches: " << res << ", Expected res: " << exp_res << std::endl;
    } else {
        std::cout << "Answer do not match: " << res << ", Expected res: " << exp_res << std::endl;
    }
}