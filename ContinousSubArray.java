import java.util.*;

class ContinousSubArray {
    public static int count(int[] arr, int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        int count=0;
        int runningSum=0;
        map.put(0,1);
        for(int i=0;i<arr.length;i++){
            runningSum+=arr[i];
            if(map.containsKey(runningSum - target)){
                count+=map.get(runningSum-target);
            }
            if(map.containsKey(runningSum)){
                map.put(runningSum,map.get(runningSum)+1);
            }else{
                map.put(runningSum,1);
            }
        }
        
        return count;
    }
  
	public static void main (String[] args) {
		int nums[]={1,1,1};
		int target=2;
		System.out.println(count(nums,target));
		
	}
}