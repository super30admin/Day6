
// o(n) space and o(n)time complexity

// in this initially we put in our map 0->-1 as an edge case .now we iterated through the array and we add 1 to the sum if the element encountered is 1 and we add -1 if element encountered is 0. then we check that the corresponding sum is present in hashmap or not if it does then we find maximum between pevious maximum length and length found currently by subtracting from current index to the value of sum else we put the corresponding value of sum as the index encountered now. at the last we return the maxlength.

class Solution {
public:
    int findMaxLength(vector<int>& nums) {
        unordered_map<int,int> mapp;
        if(nums.size()==0)
        {
            return 0;
        }
        mapp[0]=-1;
        int sum=0;
        int max=0;
        for(int i=0;i<nums.size();i++)
        {
            if(nums[i]==1)
            sum++;
            else
            sum--;
            if(mapp.count(sum)>0)
            {
                int a=i-mapp[sum];
                if(a>max)
                {
                    max=a;
                }
            }
            else
            {
                mapp[sum]=i;
            }

        }
        return max;
    }
};
