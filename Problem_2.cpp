//Time complexity is O(n) because we are traversing the given nums array
//Space complexity is also O(n) because we are taking the worst case for hashmap

/******************************************************************************/
//Approach:
//If we use brute force this solution we will end up with nested solutions and
// we will be doing the same work again and again which will increase the overhead.
// To simplify the process we use the running sum pattern as it eliminates the
// nesting. We assume that if in the given array we encounter 1 we will add 1 
// to the running sum and if we encounter 0 we will add -1 to the running sum.
// Now if we have the array [1,0,1,0] the running sum will be 0 at index 3 and
// we wil say that the array is balanced or has equal number of 1s and 0s.
// We create a hashtable to store the running sum at particular index and we 
// keep on checking if the hash table has this running sum. If it has that 
// running sum it means that till the current index we have a balanced array.
// Because the elemnts between the current index and the index where the
// current running sum was earlier seen produce 0 as sum. So we keep on updating
// our result by using max function to update the result as we need the longest
// contiguous subarray.

/******************************************************************************/
// The code worked perfectly on leetcode.

class Solution {
public:
    int findMaxLength(vector<int>& nums) {
        unordered_map <int,int> temp;
        int runSum = 0;
        int result = 0;
        temp[0] = -1;
        for(int i =0; i <nums.size(); i++){
            runSum += nums[i] == 1 ? 1 : -1;
            if(temp.find(runSum) != temp.end()){
                result = max(result, i-temp[runSum]);
            } else{
                temp[runSum] = i;
            }    
        }
        return result;
    }
};