// Time complexity is O(n) and space comlexity is O(1)

class Solution { // using HashSet
    public int longestPalindrome(String s) {

        HashSet<Character> hashSet = new HashSet<>(); // Intialize a hashset
        int counter = 0;
        char[] chars = s.toCharArray(); // strings to array

        for (char eachChar : chars) {

            if (!hashSet.contains(eachChar)) { // if set does not contains any
                hashSet.add(eachChar); // letter add to set
            } else {
                counter += 2; // if letter found which already present
                hashSet.remove(eachChar); // increase tehe count by 2 and delete that letter from set, then add again if
                                          // that letter repeats again
            }
        }
        return hashSet.isEmpty() ? counter : counter + 1;
    }
}