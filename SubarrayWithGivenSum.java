class SubarrayWithGivenSum
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        ArrayList<Integer> list = new ArrayList<>();
        
        int start=0,end=0,sum=0;
        
        while(start != n){
            if(sum == s){
                list.add(start+1);
                list.add(end);
                return list;
            }else if(sum<s && end!=n) sum += arr[end++];
            else{
                sum -= arr[start];
                start++;
            }
        }
        
        list.add(-1);
        
        return list;
        
        
        
    }
}
