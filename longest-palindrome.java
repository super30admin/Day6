//time O(n)
//space O(n)

class Solution {
    public int longestPalindrome(String s) {
        int count = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            char c  = s.charAt(i);
            if(!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }
        boolean oddFound = false;
        map.forEach((k, v) -> System.out.printf("%-15s : %s%n", k, v));
        for(Map.Entry<Character, Integer> entry: map.entrySet()) {
            if(map.size() == 1) return entry.getValue();

            if(entry.getValue() % 2 == 0) {
                count += entry.getValue();
            } else {
                count = count + entry.getValue() -1;
                oddFound = true;
            }
        }
        if(oddFound) count++;
        return count;
    }
}
