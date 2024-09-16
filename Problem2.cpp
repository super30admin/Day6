//Time Complexity O(n)
//Space Complexity O(n)

class Solution {
public:
    int findMaxLength(vector<int>& nums) {
        
    int result = 0;
	int sum = 0;
	unordered_map<int,int> m;
	m[0] = -1; // will mark it as base case

	for(int i =0;i<nums.size();i++){
		if(nums[i] == 0){
			sum += -1;
		}else{
			sum += 1;
		}

		if(m.count(sum)){
			int len = i - m[sum];
			if(len > result){
				result = len;
			}
		}else{
			m[sum] = i;
		}

		}

		return result;
	}
};