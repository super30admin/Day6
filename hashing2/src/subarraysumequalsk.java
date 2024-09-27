import java.util.HashMap;

class subarraysumequalsk {
    public int subarraySum(int[] nums, int k) {
        //initializing hashmap,count,cuurentsum.
        HashMap<Integer,Integer> hashmap = new HashMap<>();
        int count=0;
        int currentsum=0;
        hashmap.put(0,1);


        for(int x: nums){
            currentsum+=x;
            int compliment=currentsum-k;
            //checking compliment in hashmap
            if(hashmap.containsKey(compliment)){
                count+=hashmap.get(compliment);
            }
            //checking currentsum in hashmap
            if(hashmap.containsKey(currentsum)){
                hashmap.put(currentsum,hashmap.get(currentsum)+1);
            }
            //adding current sum to hashmap
            else{
                hashmap.put(currentsum,1);
            }

        }
        return count;
    }
}

//time complexity=o(n)
//space complexity=o(n)