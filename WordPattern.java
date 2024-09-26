// Time Complexity : O(n) where n is length of the string as we are spliting the string using space.
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :

class Solution {
    public boolean wordPattern(String pattern, String s) {
        if(pattern == null || s == null) return false;
        String[] sArr = s.split(" ");

        if(pattern.length() != sArr.length) return false;

        Map<Character, String> map = new HashMap();
        Set<String> set = new HashSet<>();

        for(int i = 0; i<sArr.length; i++) {
            String str = sArr[i];
            if(map.containsKey(pattern.charAt(i))) {
                if(!map.get(pattern.charAt(i)).equals(str)) {
                    return false;
                }
            } else {
                if(set.contains(str)){
                    return false;
                }
                map.put(pattern.charAt(i), str);
                set.add(str);
            }
        }
        return true;
    }
}