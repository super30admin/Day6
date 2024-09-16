class Solution {// time complexity of O(n) space of O(n) worst to store every element in HashSet
    public int longestPalindrome(String s) {
        if(s == null || s.length() == 0) return 0;
        
        HashSet<Character> hset = new HashSet<>() ; 
        //Note can use any odd char in palindrome 
        // but any one will be counted
        int count=0;
        for(int i = 0; i< s.length() ; i++){
            char c = s.charAt(i);
            if(hset.contains(c)){
                //removing and counting elements which are even
                hset.remove(c);
                count += 2;
            }else{
                //adding 2nd occurance or odd characters 
                hset.add(c);
            }
            
        }
        count = hset.isEmpty()? count: count+1;
        return count;
    }
}