class NonRepeatingElement{
    
    public int firstNonRepeating(int arr[], int n) 
    { 
        // Complete the function
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int nonRep=0;
        
       for(int i=0; i<n; i++){
           if(map.containsKey(arr[i])){
               int count = map.get(arr[i]);
               map.put(arr[i],count+1);
           }else map.put(arr[i],1);
       }
       
       for(int i=0; i<n; i++){
           if(map.get(arr[i]) == 1){
               nonRep = arr[i];
               break;
           }
       }
       
        return nonRep;
    }  
    
}


