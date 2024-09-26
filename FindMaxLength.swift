//After Class

// Time Complexity : (O)n
// Space Complexity : (O)n 
// Did this code successfully run on Leetcode : yes


class Solution {
    func findMaxLength(_ nums: [Int]) -> Int {
        var map = [Int:Int]()
        var count = 0
        var maxLength = 0
        map[0] = -1//edge case , 0,1 input
        for (index, num) in nums.enumerated() {
            count += num == 0 ? -1 : 1
            if map[count] != nil {
                maxLength = max(maxLength, index - map[count]!)
            } else {
              map[count] = index
            }
        }
        return maxLength
    }
}