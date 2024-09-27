// Time Complexity : O(n2)
// Space Complexity : O(1)
// Any problem you faced while coding this :
// Your code here along with comments explaining your approach
//1. Go though the array for each element 
//2. Compare number of 1's and zeroes
//3. find whether the length is greater or not.

class Solution {
public:
    int findMaxLength(vector<int>& nums) {
        //edge
        if(nums.size()==0){
            return 0;
        }
        //logic
        unordered_map<int, int> my_map;
        int size = nums.size();
        int length=INT_MIN;
        for(int i=0; i<size; i++){
            my_map[0] = 0;
            my_map[1] = 0;
            for(int j=i;j<size;j++){
                int count = my_map[nums[j]];
                count++;
                my_map[nums[j]] = count;
                if(my_map[0] == my_map[1]){
                    length = max(length, j-i+1);
                }
            }
        }
        
        return length == INT_MIN? 0:length;
    }
};
// Time Complexity : O(n)
// Space Complexity : O(1)
// Any problem you faced while coding this :
// Your code here along with comments explaining your approach
//1. Go though the array for each element by maintaining a running sum.
//2. If the sum already exists then return update the length.
//3. If doesnt add the index

class Solution {
public:
    int findMaxLength(vector<int>& nums) {
        //edge
        if(nums.size()==0){
            return 0;
        }
        //logic     //sum  index
        unordered_map<int, int> my_map;
        int size = nums.size();
        //Add initial sum to zero to start recording length from the begining
        my_map[0] = 0;
        int length=INT_MIN;
        int running_sum=0;
        
        for(int i=0; i<size; i++){
           running_sum = running_sum + (nums[i] ==0? -1:1);
           if(my_map.find(running_sum) != my_map.end()){ // if found update length
               length = max(length, (i+1) - my_map[running_sum]);
           }else{ //if not add the index
               my_map[running_sum] = i+1;
           }
        }
        
        return length == INT_MIN? 0:length;
    }
};
        
