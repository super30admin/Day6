// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
* We know that in a palindrome, we can have as many even characters available to you but we can have no more than 1 odd character. 
I used this to first create a character count hash table and then add up all the even counts to my cum variable. 
Also I check for odd value and add one odd val at the end of the loop of given string length. 
*/ 
/**
 * @param {string} s
 * @return {number}
 */
var longestPalindrome = function(s) {
    let count = {};
    let oddVal = 0;

    for(let i=0; i< s.length; i++){
        if(s[i] in count)
            count[s[i]]+=1;
        else
            count[s[i]]=1;
    }
    let sum = 0;
    for(let i=0; i< s.length; i++){
            if(count[s[i]]%2==1){
                if(count[s[i]] > oddVal && s[i] != oddVal)
                    oddVal = s[i];
                else if(s[i] != oddVal){
                     sum+=count[s[i]] - 1;
                     count[s[i]] = 0;
                }

            }
            else{
                sum+=count[s[i]];
                count[s[i]] = 0
            }
    }
    if(count[oddVal])
        return sum+count[oddVal];
    else
        return sum;
};