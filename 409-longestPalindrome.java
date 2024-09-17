//Approach 1: Using a HashMap (2 Pass Process)
//Overall Time Complexity: O(N)
//Overall Space Complexity: O(1) -> Limited lower letter characters
class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> sMap = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++){
            if(!sMap.containsKey(s.charAt(i))){
                sMap.put(s.charAt(i), 0);
            }
            sMap.put(s.charAt(i), sMap.get(s.charAt(i)) + 1);
        }
        int count = 0;
        Iterator<Character> i = sMap.keySet().iterator();
        while(i.hasNext()){
            Character ch = i.next();
            if(sMap.get(ch)  % 2 == 0){
                count += (sMap.get(ch) / 2) * 2;
                i.remove();
            }else{
                count += (sMap.get(ch) / 2) * 2;
                System.out.println(ch);
                sMap.put(ch, 1);
            }
        }
        if(sMap.isEmpty()) return count;
        else return count + 1;
        
        
    }
}


//Approach 1: Using a HashSet (1 Pass Process)
//Overall Time Complexity: O(N)
//Overall Space Complexity: O(1) -> Limited lower letter characters
class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> st = new HashSet<>();
        int count = 0;
        
        for(int i = 0; i < s.length(); i++){
            if(st.contains(s.charAt(i))){
                count += 2;
                st.remove(s.charAt(i));
            }else{
                st.add(s.charAt(i));
            }
        }
        
        if(!st.isEmpty()) return count + 1;
        else return count;
        
    }
}