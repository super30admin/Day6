// Time Complexity : 0(n)
// Space Complexity : 0(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
    func subarraySum(_ nums: [Int], _ k: Int) -> Int {
        var output = 0
        var frequencyMap = [Int:Int]()
        frequencyMap[0] = 1 
        var sum = 0
        for i in 0..<nums.count {
            sum = sum + nums[i]
             if let frequency = frequencyMap[sum-k] {
                output += frequency
            } 
             if let freq = frequencyMap[sum] {
                frequencyMap[sum] = freq + 1
            }
            else {
                frequencyMap[sum] = 1
                }
           
            
        }
       return output 
    }