// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :

public class LongestPalindromeLC409 {

    // Using single hashset, best solution as we are not iterating twice unlike map.
    // new element comes in check if it is present in hashset. if yes: add cnt =
    // cnt+2; then remove it from hashset
    // else add it to hashset
    // TC:O(n) SC:O(n)
    public  int longestPalindromeUsingSet(String s) {
        HashSet<Character> set = new HashSet<>();
        int cnt = 0;
        for (char ch : s.toCharArray()) {
            if (set.contains(ch)) {
                cnt += 2;
                set.remove(ch);
            } else {
                set.add(ch);
            }

        }

        return (set.size() > 0) ? cnt + 1 : cnt;

    }

    // Using Char Array
    // consider A and a lettes. so keep charArr as 60.
    public  int longestPalindromeUsingCharArr(String s) {
        int chArr[] = new int[60];
        int cnt = 0;
        boolean isEven = false;
        for (int i = 0; i < s.length(); i++) {
            chArr[s.charAt(i) - 'A']++;// this will print as
            // [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            // 0, 0, 0, 0, 0, 0, 0, 4, 0, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            // 0, 0, 0, 0, 0, 0, 0, 0, 0]
            // always subtract from s.charAt(i) with capital'A'. because Ascii value A =65
            // and a =97.
        }
        for (int val : chArr) {
            if (val % 2 == 0) {
                cnt += val;
            } else {
                cnt += val - 1;
                isEven = true;
            }
        }
       
        return (isEven) ? cnt + 1 : cnt;

    }

    
    public  int longestPalindromeUsingMap(String s) {
        if (s.length() == 0)
            return 0;
        HashMap<Character, Integer> map = new HashMap<>();

        int cnt = 0;
        boolean isEven = false;
        for (Character ch : s.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.getOrDefault(map, map.get(ch)) + 1);
            } else {
                map.put(ch, 1);
            }
        }
     
        for (int i : map.values()) {
            
            if (i % 2 == 0) {
                cnt += i;
            } else {
                cnt += i - 1;
                isEven = true;
            }

        }
      
        return (isEven) ? cnt + 1 : cnt;
    }
}