class FindDuplicatesInAnArray {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        
       for(int i=0; i<n; i++){
           int index = arr[i]%n;
           arr[index] += n;
       }
       ArrayList<Integer> list = new ArrayList<>();
       
       int count=0;
       
       for(int i=0; i<n; i++){
           if(arr[i]/n >= 2){
               list.add(i);
               count++;
           }
       }
       
       if(count == 0){
           list.add(-1);
           return list;
       }
       
       return list;
        
    }
}

