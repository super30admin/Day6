//Time complexity : O(n)
//Space complexity : O(n)
//Leetcode: Yes

//Approach:
//          1. Keep track of running sum.
//          2. Keep mapping of running sum to every index
//          3. Increment sum when encountered with 1 and decrement it when encountered with 0
//          4. At every step, check whether sum previously exists in the map. If it does then calculate index - sum and take max of currentMaxLength or index-sum


class Solution {
public:
    int findMaxLength(vector<int>& nums) {
        if(nums.size() == 0)
            return -1;
        
        int count = 0;
        int maxLength = 0;
        
        map<int,int> ctoi;
        ctoi[0] = -1;
        
        for(int i = 0 ; i < nums.size() ; i++)
        {
            //Keep track of running sum
            if(nums[i] == 0)
            {
                count--;
            }
            else
            {
                count++;
            }


            //Find in the map
            if(ctoi.find(count) != ctoi.end())
            {
                //If it exists then calculate maximum
                maxLength = max(maxLength , (i - ctoi[count]));
            }
            else
            {
                //Else add to map with current index mapping
                ctoi[count] = i;
            }
        }
        
        return maxLength;
    }
};