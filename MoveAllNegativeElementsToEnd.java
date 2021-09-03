class MoveAllNegativeElementsToEnd {
    
    public void segregateElements(int arr[], int n)
    {
        // Your code goes here
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<n; i++){
            if(arr[i]>0) list.add(arr[i]);
        }
        for(int i=0; i<n; i++){
            if(arr[i]<0) list.add(arr[i]);
        }
        
        for(int i=0; i<n; i++){
            arr[i] = list.get(i);
        }
    }
}
