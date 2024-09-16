import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// Time Complexity : O(nk) where n is the number of words each of length k
// Space Complexity : O(n) if all the words are unique.
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        HashMap<Double, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
            double primeproduct = calcprimeprod(str);
            if (!map.containsKey(primeproduct)) {
                map.put(primeproduct, new ArrayList<>());
            }
            map.get(primeproduct).add(str);
        }
        return new ArrayList<>(map.values());
    }

    private double calcprimeprod(String s) {
        int[] primes = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 71, 73, 79, 83, 89, 97,
                101, 103 };
        double product = 1;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            product = product * primes[c - 'a'];
        }
        return product;

    }

}