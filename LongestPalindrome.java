class Solution {

    public int longestPalindrome(String s) {
        // null check
        if (s == null || s.length() == 0)
            return 0;

        HashSet<Character> set = new HashSet<>();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (set.contains(c)) {
                set.remove(c);
                count += 2;
            } else {
                set.add(c);
            }
        }

        if (!set.isEmpty()) {
            count += 1;
        }
        return count;

    }
}

// class Solution {

// public int longestPalindrome(String s) {

// HashMap<Character,Integer> map = new HashMap<>();

// for(int i=0;i<s.length();i++){

// if(!map.containsKey(s.charAt(i))){
// map.put(s.charAt(i),1);
// }
// else{
// map.getOrDefault(s.charAt(i),s.charAt(i)+1);
// }
// }

// return map.values();

// }
// }