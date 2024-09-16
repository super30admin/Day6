// Time Complexity : 0(n)
// Space Complexity : 0(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
     func longestPalindrome(_ s: String) -> Int {
        var characterCount = [Character:Int]()
        var count = 0
        for char in s {
            if let counter = characterCount[char] {
                characterCount[char] = counter + 1
            } else {
                characterCount[char] = 1
            }
        }
        for value in characterCount.values {
            if value % 2 == 0 {
                count += value
            } else {
                count += value - 1
            }
        }
        return count < s.count ? count + 1 : count
    }