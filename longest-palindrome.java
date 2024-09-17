// Time - O(n)
// Space - O(1)

// two pass
 public int longestPalindrome(String s) {
        if(s.length()==0 || s == null) {
            return 0;
        }
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int count = 0;
        boolean countWithSingle = false;
        for(Map.Entry<Character,Integer> entry : map.entrySet()) {
            char ch = entry.getKey();
            
            int charCount = map.get(ch);
            if(charCount % 2 == 0) {
                count += charCount;
            }
            else {
                if(charCount > 1) {
                    count += (charCount / 2) * 2;
                }                
                countWithSingle = true;
            } 
        }
        
        
        
        return countWithSingle ? count + 1 : count;
    }
// One pass
class Solution {
    public int longestPalindrome(String s) {
        if(s.length()==0 || s == null) {
            return 0;
        }
        
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        for(int i=0;i<s.length();i++) {
            if(set.contains(s.charAt(i))) {
                count+=2;
                set.remove(s.charAt(i));
            }
            else {
                set.add(s.charAt(i));
            }
        }
        
        if(!set.isEmpty()) {
            count+=1;
        }
        
        return count;
    }
}
