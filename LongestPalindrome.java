class Solution {
    public int longestPalindrome(String s) {
        int count=0;
        Map<Character, Integer> map = new HashMap<>();
        boolean flag=true;
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            
            if(entry.getValue() %2 == 0){
                count=count + entry.getValue();
                 map.put(entry.getKey(), 0);
            }else {
                count=count+(entry.getValue()-1);
                map.put(entry.getKey(),1);
            }
            
            if(flag && entry.getValue() == 1){
                count++;
                flag=false;
            }
           
            
        }
        return count;
    }
}
