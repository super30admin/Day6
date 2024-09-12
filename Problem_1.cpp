// Time complexity is O(n) as we are iterating through the entire array
// The space complexity is also O(n)
/******************************************************************************/
//Approach: First Brute force was tried but the time 
//complexity in that case was O(n2). However the space complexity
// was O(1)
//To improve the time complexity map was used. But the space complexity
//got increased to O(n)
// We are using the running sum. If the difference between the 
//running sum upto kth index and running sum upto mth index is target,
//it means if we take sum of the elements between k and m index it will\
// be target.
//We use a hashtable to keep the record of the frequency of the difference.
//If this difference is seen in the table, then it's frequency is added to the
//count as it gives the number of subarrays that have 
//produced the target number.
//Running sum is also incremented if it is seen again.

/******************************************************************************/
//The code worked perfectly.



class Solution{
    public:
    int subarraySum(vector<int>& nums, int k) {
        int runSum = 0;
        int count = 0;
        unordered_map <int, int> store;
        store[0] = 1;
        for(int i =0; i<nums.size(); i++){
            runSum += nums[i];
            if(store.find(runSum - k) != store.end()) count += store[runSum -k];
            store[runSum]++;
        }
        return count;
    }
};