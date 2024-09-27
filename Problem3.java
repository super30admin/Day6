import java.util.HashSet;

public class Problem3 {

	   public static int longestPalindrome(String s) {
		      if(s==null || s.length()==0) return 0;
		        HashSet<Character> set = new HashSet<>();
		        int count=0;
		        for(int i=0;i<s.length();i++){
		            if(!set.contains(s.charAt(i))){
		                set.add(s.charAt(i));
		            }else{
		                set.remove(s.charAt(i));
		                count++;
		            }
		        }
		        if(!set.isEmpty()) return (2*count)+1;
		        return count*2;
		    }
	   
	   public static void main(String[] args) {
			
			String s="abccccdd";
			
			
			int res= longestPalindrome(s);
			System.out.println("res : "+ res);
		}
}
