// Time Complexity : O(N) where N is length of nums vector
// Space Complexity : O(N) where N is length of nums vector
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach


#include<vector>
#include<bits/stdc++.h>
#include<stdlib.h>
#include<cmath>
#include<time.h>
#include<iostream>

using namespace std;       

class Solution {
public:
    int findMaxLength(vector<int>& nums) {
        
        if (nums.empty()) return 0;
        int gmax=0;
        int start =0;
        int end=0;
        
        unordered_map<int,int> map;
        
        map.insert(make_pair(0,-1));
        int rSum=0;
        
        for(int i=0;i<nums.size();i++){
            rSum= nums[i]==0?rSum-1 :rSum+1;
            
            if(map.count(rSum)){
                if(gmax<i-map.at(rSum)){
                    gmax=i-map.at(rSum);
                    end=i;start=map.at(rSum)+1;
                }
            }
            //    gmax= max(gmax,i - map.at(rSum));
            else{
                map.insert(make_pair(rSum,i));
            }
            
        }
        std::cout<<start<<endl<<end<<endl;
        return gmax;      
        
        
        
                 
                   
                  
                   
        
    }
};

int main(){
    Solution a;
    vector<int> nums={0,1,0,0,0,1,1,1,0};
    //int target=2;
    a.findMaxLength(nums);
    // for (int x : b) 
    //     cout << x << " "; 
}