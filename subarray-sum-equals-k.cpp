/*Use an unordered map (myMap) to store the cumulative sum (rSum) encountered along with its frequency.
Iterate through the vector, calculate the cumulative sum, and check if there exists a subarray with the desired sum (rSum - k) by checking the count in the map. Increment the count accordingly.
Update the map with the current cumulative sum.

Time Complexity: O(N) 
Space Complexity: O(N)*/
#include<bits/stdc++.h>
using namespace std;
class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        unordered_map<int,int>myMap;
        myMap.insert({0,1});
        int rSum=0;
        int count=0;
        for(int i=0;i<nums.size();i++){
            rSum+=nums[i];
            if(myMap.count(rSum-k)!=0){
                count+= myMap[rSum - k];
            }
            myMap[rSum]++;
        }
        return count;
    }
};