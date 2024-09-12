// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :  
// Any problem you faced while coding this : 
function longestPalindrome(s: string): number {
    let longest = '';
    if (!s) {
        return 0;
    }
    else {
        for (let i = 0; i < s.length; i++) {
            const odd = getMaxPalindrome(s, i, i);
            const even = getMaxPalindrome(s, i - 1, i);

            if (odd.length > longest.length) {
                longest = odd;
            }

            if (even.length > longest.length) {
                longest = even;
            }
        }
    }
};

function getMaxPalindrome(str: string, left: number, right: number) {
    let i = 0;
    while (str[left - i] && str[left - i] === str[right + i]) {
        i++;
    }
    i--;

    return str.slice(left - 1, right + 1 + 1);
}