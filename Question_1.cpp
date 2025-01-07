#include <iostream>
#include <vector>
#include <unordered_map>
using namespace std;
int subarraySum(vector<int>& nums, int k) {
    int runningSum = 0, n = nums.size(),count = 0;
    unordered_map<int,int>table;
    table[runningSum]=1;
    for(int i=0;i<=n-1;i++){
        runningSum += nums[i];
        int otherPart = (table.find(runningSum-k)==table.end())?0:table[runningSum-k];
        count += otherPart;
        table[runningSum]++;
    }
    return count;

}
int main(){
    vector<int> nums = {1,1,1};
    int k = 2;
    cout<<subarraySum(nums,k);
    return 0;
}