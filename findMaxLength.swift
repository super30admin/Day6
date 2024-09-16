// Time Complexity : 0(n)
// Space Complexity : 0(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
    func findMaxLength(_ nums: [Int]) -> Int {
        var maxLength = 0
        var dict = [Int:Int]()
        dict[0] = -1
        var sum = 0
        for i in 0..<nums.count {
         if nums[i] == 0 {
             sum -= 1
         } else {
             sum += 1
         }
        if let startIndex = dict[sum] {
            maxLength = max(maxLength,i - startIndex)
          } else {
                dict[sum] = i
            }
        }
        return maxLength
    }