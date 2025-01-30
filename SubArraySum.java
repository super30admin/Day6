import java.util.HashMap;

public class SubArraySum {
    public int subarraySum(int[] nums, int k) {
        int runSum=0;
        int result=0;
        HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
        map.put(0,1);
        for(int n:nums){
            runSum=runSum+n;
            if(!map.containsKey(runSum-n)) {
               map.put(runSum-n,1);
            }else{
               result=result+map.get(runSum-n);
            }

        }

        return 0;
    }
}
