import java.util.HashMap;

public class ContiguousArray {
	
	
    public int findMaxLength(int[] nums) {
        
        if(nums ==null || nums.length==0)
           return 0;
       
       HashMap<Integer,Integer> subArrayMap= new HashMap<>();
       int max=0;
       int runningSum=0;
       subArrayMap.put(0,-1);
       
       for(int i=0;i< nums.length;i++){
           
            runningSum = nums[i]==0 ? runningSum-1 : runningSum+1;
           
           if(subArrayMap.containsKey(runningSum)){
               max= Math.max(max, i- subArrayMap.get(runningSum));
           }else{
               subArrayMap.put(runningSum,i);
           }
       }
       
      return max; 
       
   }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ContiguousArray objIn= new ContiguousArray();
		
		int[] nums= {0,1,0};
		System.out.println(objIn.findMaxLength(nums));

	}

}
