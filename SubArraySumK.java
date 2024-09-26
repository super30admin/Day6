//Time Complexity=O(n)
//Space Complexity=O(1)
public class SubArraySumK {

    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int rsum=0,result=0;
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            rsum+=nums[i];

            if(map.containsKey(rsum-k)){
                result+=map.get(rsum-k);
            }if(map.containsKey(rsum)){
                map.put(rsum,map.get(rsum)+1);
            }else{
                map.put(rsum,1);
            }
        }
        return result;
    }
}
