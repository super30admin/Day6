// Contiguos Subarray

// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes, it successfully ran on leetcode.
// Any problem you faced while coding this : Minor, did have to check logic again.


// Your code here along with comments explaining your approach

#include<bits/stdc++.h>
using namespace std;

class Solution {
public:
    int findMaxLength(vector<int>& nums) {
        int maxi = 0;
        int count = 0; // initializing maximum and count
        unordered_map<int, int> m;
        m[0] = -1;  // adding 0:-1 to get the initial contiguos array as well
        for(int i =0; i<nums.size(); ++i)
        {
            if(nums[i] == 0){
                count--;   // decreasing count if 0 found
            }
            else{
                count++;   // incrementing count if 1 found
            }
            
            if(m.find(count) != m.end())
            {
                maxi = max(maxi,i- m[count]); // getting the size of the contiguous array
            }
            else{
                m[count] = i;  // putting the index of array in map
            }
                
        }
        return maxi;
    }
};

// int main(){
    
//     return 0;
// }