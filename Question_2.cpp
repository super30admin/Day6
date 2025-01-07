#include <bits/stdc++.h>
using namespace std;
#include <iostream>
#include <vector>
#include <unordered_map>
int findMaxLength(vector<int>& nums) {
    int runningDiff = 0, n = nums.size(),ans = 0;
    unordered_map<int,int>leftMostDiffIndex;
    leftMostDiffIndex[0]=-1;
    for(int i=0;i<=n-1;i++){
        runningDiff = runningDiff + ((nums[i])?1:-1);
        //cout<<runningDiff<<endl;
        if(leftMostDiffIndex.find(runningDiff)!=leftMostDiffIndex.end()) ans = max(ans,i-leftMostDiffIndex[runningDiff]);
        else leftMostDiffIndex[runningDiff] = i;
    }
    return ans;
}
int main(){
    vector<int> nums = {0,1,0};
    cout<<findMaxLength(nums);
    return 0;
}