import java.util.HashMap;

public class ContiguousArray {
    public int findMaxLength(int[] nums) {
        int result=0;
        int sum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                sum=sum-1;
            } else if(nums[i]==1){
                sum=sum+1;
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }else{
                result=Math.max(result,i-map.get(sum));
            }
        }
        return result;
    }
}
