Time Complexity-O(n)
Space Complexity-O(n)
Did the code run on Leetcode? Yes

#include <iostream>
#include<unordered_map>
#include<vector>
using namespace std;
class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        int sum=0,result=0,i;
        unordered_map<int,int>m;
        m[0]=1;
        for(i=0;i<nums.size();i++)
        {
            sum+=nums[i];
            if(m.find(sum-k)!=m.end())
            {
                result+=m[sum-k];
            }
            m[sum]++;
        }
        return result;
    }
};

int main() {
    vector<int>num={1,1,1};
    int target=2;
    Solution soln;
    int y=soln.subarraySum(num,target);
    cout<<y;
	return 0;
}