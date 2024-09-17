class LongestPalindrome{
    public int longestPalindrome(String s) {
        int count = 0;
        HashMap<Character, Integer> hp = new HashMap<>();
        
        for(int i=0; i<s.length(); i++){
            hp.put(s.charAt(i), hp.getOrDefault(s.charAt(i),0)+1);
        }
                
        for(Map.Entry<Character, Integer> entry : hp.entrySet()){
            if(entry.getValue() % 2 == 0){
                count += entry.getValue();
            }
            else{
                count += (entry.getValue()-1);
            }
        }
        
        if(count == s.length()){
            return count;   
        }else{
            return count + 1;   
        }
            
    }
}