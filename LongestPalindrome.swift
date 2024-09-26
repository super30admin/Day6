//After Class

// Time Complexity : (O)n
// Space Complexity : (O)1 since we have only 26 alphabets
// Did this code successfully run on Leetcode : yes


//Method 1 - Hashing - use Set. remove the repeated value
class Solution {
    func longestPalindrome(_ s: String) -> Int {
        guard s.length > 0 else {return 0}
        var set = Set<Character>()
        var count = 0
        
        for c in s {
            if set.contains(c) {
              count += 2
              set.remove(c)  
            } else {
                set.insert(c)
            }
        }
        
        return count + (set.isEmpty == true ? 0 : 1)
        
    }
}

//Method 2 -

class Solution {
    func longestPalindrome(_ s: String) -> Int {
        guard s.length > 0 else {return 0}
        var count = [Character:Int]()

        for val in s {
            count[val] = (count[val] == nil ? 1 : count[val]!+1)
        }
        
        var result = 0
        for val in count.values {
            result += ((val/2) * 2)
            if result%2 == 0 && val % 2 == 1 {
                result += 1
            }
        }
        
        return result
        
    }
}





// Time Complexity : (O)n
// Space Complexity : (O)1
// Did this code successfully run on Leetcode : No. Wrong answer 

// Use hasmap to store the number of character count
//find even number count
//find highest prime number count
//return addition of even and highest prime number count

class Solution {
    func longestPalindrome(_ s: String) -> Int {
        guard s.length > 0 else {return 0}
        var dict = [Character: Int]()
        for c in s {
            if dict[c] != nil {
                dict[c] = dict[c]! + 1
            } else {
                dict[c] = 1
            }
        }
        //get minimum odd number count and even number total
        var evenNumberCount = 0
        var maxHighestOddNumber = 0
        for value in  dict.values {
            if value%2 == 0 {
                evenNumberCount = evenNumberCount + value
            } else {
                maxHighestOddNumber = max(maxHighestOddNumber, value)
            }
        }
        
        return evenNumberCount + maxHighestOddNumber
    }
}