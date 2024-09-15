// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// TC: O(N) explained below
// SC: O(1)
// SC is O(1) because in any case hashmap or hashset will never contain more than 26(uppercase) + 26(lowercase) characters
// SC is not changing alomg with the length of the string. It not variable. It's constant

// Palindrome could be formed in 2 ways
// even palindrome ccddcc
// or odd palindrome as ccdadcc or ccdbdcc
// so we need to record the pairs and extra occurances of any character

// Solution 1: With HashMap but 1st approach

// class Solution {
//     public int longestPalindrome(String s) {
//         // base case
//         if(s.isEmpty() || s.length() == 0) return 0;

//         // we are using HashMap to store the character as key and no of occurences as value of that key(character)
//         Map<Character, Integer> map = new HashMap<>();
//         int len = 0;

//         // TC: O(N)
//         for(int i = 0; i < s.length(); i++) {
//             char c = s.charAt(i);
//             // we are keeping on adding the frequency for each character here to use it later
//             map.put(c, map.getOrDefault(c, 0) + 1);
//         }

//         // TC: O(N + N) = O(N)
//         for(char c: map.keySet()){
//             int occ = map.get(c);

//             if(occ % 2 != 0){
//                 // if character occured odd times then reduce it's occurance by 1 and update the value in map to 1
//                 // eg if occ is 5, here we need even occurances of that character so we will reduce it by 1 and in map we will update it's value as 1.
//                 // that means we still have 1 character extra which does not form a pair, so we don't want to remove it from map at later stage
//                 occ--;
//                 map.put(c, 1);
//             }
//             else {
//                 // if it already occurs just update value if that key to 0
//                 // that means we have recorded even occurances and now we don't have any extra occurance of that character so we can remove it from map
//                 map.put(c, 0);
//             }

//             len = len + occ;
//         }

//         // now we need to remove the keys which has value 0
//         // so record such keys in arraylist and then iterate through arraylist and remove it from map
//         List<Character> keys = new ArrayList<>();
//         // TC: O(N + N + N) = O(N)
//         for(char c: map.keySet()) {
//             if(map.get(c) == 0)
//                 keys.add(c);
//         }

//         // TC: O(N + N + N +N) = O(N)
//         for(Character key: keys) {
//             map.remove(key);
//         }

//         // check if map still has keys. if yes then add one to length
//         if(map.size() > 0)
//             len++;

//         return len;
//     }
// }


// Solution 2: With HashMap but 2nd approach (Improved)

// class Solution {
//     public int longestPalindrome(String s) {
//         // base case
//         if(s.isEmpty() || s.length() == 0) return 0;

//         // we are using HashMap to store the character as key and no of occurences as value of that key(character)
//         Map<Character, Integer> map = new HashMap<>();
//         int len = 0;

//         for(int i = 0; i < s.length(); i++) {
//             char c = s.charAt(i);
//             if(!map.containsKey(c)) {
//                 // if character does not occur then add it to map with value 1
//                 map.put(c, 1);
//             }
//             else {
//                 // if character occurs before that means we found a pair. We can add 2 to length and remove that character from our map
//                 // we are removing it because if same character comes again then it should get added to map to form a new pair
//                 len = len + 2;
//                 map.remove(c);
//             }
//         }

//         // at the end only single occurance characters will be remaining in hashmap
//         // if there are such characters remaining in map then we need to increase the length by 1 so that we can make a max length palindrome
//         if(map.size() != 0) {
//             len++;
//         }

//         return len;
//     }
// }


// Solution 3: Similar as HashMap(2nd approach) but using HashSet

class Solution {
    public int longestPalindrome(String s) {
        // base case
        if(s.isEmpty() || s.length() == 0) return 0;

        // we are using HashSet to store the character
        Set<Character> set = new HashSet<>();
        int len = 0;

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // if character does not occur before then add it to set
            if(!set.contains(c)) {
                set.add(c);
            }
            else {
                // if character occurs before that means we found a pair. We can add 2 to length and remove that character from our set
                // we removing it because if same character comes again then it should get added to set to form a new pair
                len = len + 2;
                set.remove(c);
            }
        }

        // at the end only single occurance characters will be remaining in hashset
        // if there are such characters remaining in set then we need to increase the length by 1 so that we can make a max length palindrome
        if(set.size() != 0) {
            len++;
        }

        return len;
    }
}