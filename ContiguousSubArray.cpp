// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes

// Three line explanation of solution in plain english.
/* Maintain one variable count, if array value is 0 then decrement the count else increment the count.
 * Maintain one hash map to store a count and its initial occurence index.
 * Iterate over array while updating count and corresponding index; check if the current count value is present in the map
 *     If present then if the difference between current index and initial index is greater than current max then update the max with this new difference.
 * Return max.   
 */

class Solution {
public:
    int findMaxLength(vector<int>& nums) {
        
        //count, index
        map<int, int> m;
        if (nums.size() <= 1)
            return 0;
        
        //initialization
        int count = 0;
        int max = 0;
        m.insert({0, -1});
        
        for (int i = 0; i < nums.size(); i++)
        {
            if (nums[i] == 0)
                count--;
            else
                count++;
            
            auto element = m.find(count);
            if (element == m.end())
            {
                m.insert({count, i});
            }
            else
            {
                max = std::max(max, i - element->second);
            }
            
        }
        
        return max;
    }
};

