import java.util.HashMap;

class ContiguousArray {
    public int findMaxLength(int[] nums) {
        //initializing hashmap,max,currentsum.
        HashMap<Integer,Integer> hashmap = new HashMap<>();

        int max=0;
        int currentsum=0;
        hashmap.put(0,-1);

        for(int x=0;x<nums.length;x++){
            if(nums[x]==0){
                currentsum+=1;
            }
            else{
                currentsum-=1;
            }
            //checking hasmap contains cuurent sum
            if(hashmap.containsKey(currentsum)){
                int end=x;
                int start=hashmap.get(currentsum);
                max=Math.max(max,end-start);
            }
            //if hashmap doesnot contain current sum
            else{
                hashmap.put(currentsum,x);
            }
        }
        return max;

    }
}

//time complexity =o(n)
//space complexity=o(n)