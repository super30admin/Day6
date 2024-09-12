//Time complexity is O(n) as we are iterating through the whole string.
// The space complexity is O(1)

/******************************************************************************/
//Approach : If the occurrence of the character is even in the string 
// like cccc, we can use it as cc|cc to make a palindrome. So the count of character
// can be directly added to the result. But if the count is odd like 'b' or 'bbb', then
// we can have two cases i> 'ccbcc' ii> 'bccbccb'. Now if we remove the character at the centre
// it still makes the palindrome and the new count can be added to the result. We can set a flag
// to check if there is any odd count, if the flag is set then we add 1 to the result later to get
// longest palindrome. In both the cases where count is 1 or any odd number, adding 1 for
// the center element works.

/******************************************************************************/
// The code ran properly at leetcode. 

class Solution {
public:
    int longestPalindrome(string s) {
        //counting the number of occurrences of each character
        unordered_map<char, int> temp;
        for(int i =0 ; i<s.size(); i++){
            temp[s[i]]++;
        }
        bool flag = false;
        int result = 0;
        //checking if the frequency of character is odd or even
        //and the adding the frequency to the result as explained above
        for(auto &check : temp){
            if(check.second%2 == 0) result += check.second;
            else{
                flag = true;
                result += check.second - 1;
            }
        }
        if(flag) result += 1;
        return result;
    }
};