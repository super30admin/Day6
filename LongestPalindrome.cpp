#include <iostream>
#include <set>

using namespace std;

//Time complexity : O(n)
//Space Complexity : O(1)
//Leetcode : Yes

//Approach:
//          1. Every pallindrome will have even number of characters and at max 1 odd character
//          2. We will keep track of every element and as soon as it occurs twice, we can safely say that it is part of the palindrome
//          3. Also keep track of all the odd number of character occurences and pick any one of them in the final answer.
//          4. Hashset is the best suited data structure for this
class Solution {
public:
    int longestPalindrome(string s) {
        set<char> lpallindrome;
        int totalLength = 0;
        for(char c : s)
        {
            //Check for the current character in the set
            if(lpallindrome.find(c) != lpallindrome.end())
            {
                //If it already exists then increment length by 2 and remove the character from the set
                totalLength += 2;
                lpallindrome.erase(c);
            }
            else
            {
                //Else just insert the character
                lpallindrome.insert(c);
            }
        }
        
        //Check whether set is empty or not
        //If it is empty it means there are no odd occurences of any character
        if(!lpallindrome.empty())
        {
            //If it is not then consider any of the character
            totalLength+=1;
        }
        
        return totalLength;
    }
};