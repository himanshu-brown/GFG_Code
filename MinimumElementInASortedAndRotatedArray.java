class MinimumElementInASortedAndRotatedArray
{
    int findMin(int arr[], int n)
    {
       
       Set<Integer> set = new HashSet<>();
       
       for(int i=0; i<n; i++) set.add(arr[i]);
       
       return (int)Collections.min(set);
        
    }
}