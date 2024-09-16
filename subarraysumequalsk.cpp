
//Time complexity : O(n)
//Space complexity : O(n)
//Leetcode : Yes

//Approach :
//          1. Keep a track running sum.
//          2. Add each running sum to hashmap keeping count of its occurences
//          3. For every index, calculate running sum - current element and check if the resultant value exists in the map
//          4. If it exists then take its number of occurences and add to total count.
class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        map<int,int> sumtocount;
        int sum = 0;
        int count = 0;
        
        //Initialize edge case scenario
        sumtocount[count] = 1;
        for(int i = 0; i < nums.size(); i++)
        {
            //Calculate running sum
            sum += nums[i];
            //Get difference
            int key = sum - k;
            //Check for difference in map
            if(sumtocount.find(key) != sumtocount.end())
            {
                //If it exists then get its occurence count and add it to our final count
                count += sumtocount[key];
            }
            
            //Check whether current sum exists in the map or not
            if(sumtocount.find(sum) != sumtocount.end())
            {
                //If it does then simply add by 1
                sumtocount[sum]++;
            }
            else
            {
                //If not then initialize sum in the map to 1
                sumtocount[sum] = 1;
            }
            
        }
        
        return count;
    }
};