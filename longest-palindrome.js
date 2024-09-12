// Longest Palindrome
/**
 * @param {string} s
 * @return {number}
 */
var longestPalindrome = function(s) {
    // Edge case
    if (s == null || s.length == 0) return 0;

    const oddStrings  = {},
          evenStrings = {};

    // evenLen keeps a running sum of all Even numbered letters
    // greatestOdd keeps track of the single most oddly occurring letter
    // maxLen to return (evenLen + greatestOdd)
    let maxLen  = 0,
        evenLen = 0,
        greatestOdd = 0;

    for (const i of [...s]) {
        if (!oddStrings[i] && !evenStrings[i]) {
            // Character not in odd or even hash
            oddStrings[i] = 1;

        } else if (oddStrings[i]) {
            // Character in odd hash, move to even hash
            evenStrings[i] = oddStrings[i] + 1;
            // Delete that character from oddHash
            delete oddStrings[i];
            // Add the value to evenLen
            evenLen += evenStrings[i];

        } else if (evenStrings[i]) {
            // Remove the value from evenLen
            evenLen -= evenStrings[i]
            // Character in even hash, move to odd hash
            oddStrings[i] = evenStrings[i] + 1;
            // Delete that character from evenHash
            delete evenStrings[i];
        }
    }
    console.log(evenStrings);
    console.log(oddStrings)
    for (const key in oddStrings) {
        if (oddStrings[key] > greatestOdd) greatestOdd = oddStrings[key];
    }
    maxLen = evenLen + greatestOdd;
    return maxLen;

};
