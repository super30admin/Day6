/*
Use an unordered map (myMap) to store the cumulative sum (rSum) encountered along with its corresponding index.
Traverse the array and update the cumulative sum by incrementing for '1' and decrementing for '0'.
Check if the current cumulative sum has been encountered before. If yes, update the maximum length based on the current index and the stored index in the map.
If not encountered, insert the cumulative sum along with the current index into the map.
Return the maximum length.

Time Complexity: O(N)
Space Complexity: O(N)*/
#include<bits/stdc++.h>
using namespace std;
class Solution {
public:
    int findMaxLength(vector<int>& nums) {
        int maxi=0;
        int rSum=0;
        unordered_map<int,int>myMap;
         myMap.insert({0,-1});
        for(int i=0;i<nums.size();i++){
            if(nums[i]==0)rSum--;
            else rSum++;
            if(myMap.count(rSum)!=0){
                auto it = myMap.find(rSum);
                maxi=max(maxi,i-(it->second));
            }else{
                myMap.insert({rSum,i});
            }
        }
        return maxi;
    }
};