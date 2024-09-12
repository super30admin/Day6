class Solution {
    
    public int longestPalindrome(String s) {
        int max_length=0;
        HashMap<Character,Integer> h= new HashMap<Character,Integer>();
        int n=s.length();
        boolean hasodd=false;
        
        for(int i=0;i<n;i++){
            h.put(s.charAt(i),h.getOrDefault(s.charAt(i),0)+1);
            
            
        }
        for(int count : h.values()){
            if(count%2==0){
                max_length=max_length+count;
            }
            else{
            hasodd=true;
                max_length=max_length+count-1;
        
        
    }}
            if(hasodd){
                max_length=max_length+1;
            }
        return max_length;
}
}
