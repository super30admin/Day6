//Let there be n words with k length each.
//Time Complexity : O(nk)
//Space Complexity : O(n)
//Code run successfully on LeetCode.


import java.util.HashMap;
import java.util.List;

public class Anagrams_2 {
	 public List<List<String>> groupAnagrams(String[] strs) {
		 
		 if(strs == null|| strs.length == 0)
			 return new ArrayList<>();
	    
	 
	    double product;
	 	HashMap<Double, List<String>> map = new HashMap<>();
	 	
	 	for(int i =0; i < strs.length; i++) {
	 		char[] ch = strs[i].toCharArray();
	 		product = 1;
	 		product = calProduct(ch);
	 		
	 		if(!map.containsKey(product))
	 			map.put(product, new ArrayList<String>());
	 		
	 		map.get(product).add(strs[i]);
	 	}
        return new ArrayList<>(map.values());
    }
	 
	public double calProduct(char[] ch) {
		
		double product =1;
		int[] prime = new int[] {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53,
				     			59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113,
				     			127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 
				     			191, 193, 197, 199};
		
		for(int i =0; i < ch.length; i++)
		{
			char c = ch[i];
			product = product * prime[c - 'a'];
		}
		
		return product;
	}
}
