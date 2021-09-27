class SubarraysWithEqual1sand0s
{
    //Function to count subarrays with 1s and 0s.
    static int countSubarrWithEqualZeroAndOne(int arr[], int n)
    {
       
       HashMap<Integer,Integer> map = new HashMap<>();
       map.put(0,1);
       int sum=0,ans=0;
       
       for(int i=0; i<n; i++){
           
           if(arr[i] == 0) sum-=1;
           else sum+=1;
           
           if(map.containsKey(sum)){
               ans += map.get(sum);
               map.put(sum,map.get(sum)+1);
           }
           else map.put(sum,1);
           
       }
       
       return ans;
        
    }
}
