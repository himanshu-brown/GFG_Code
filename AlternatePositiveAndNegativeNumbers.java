class AlternatePositiveAndNegativeNumbers{
    void rearrange(int arr[], int n) {
        
        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();
        int i=0, j=0, flag=1,index=-1;
        
        for(i=0; i<n; i++){
            if(arr[i] >= 0) positive.add(arr[i]);
            else negative.add(arr[i]);
        }
        
        i=0;j=0;
        
        while(i<positive.size() && j<negative.size()){
            
            if(flag == 1){
                arr[++index] = positive.get(i++);
                flag = 0;
            }else{
                arr[++index] = negative.get(j++);
                flag = 1;
            }
            
        }
        
        while(i < positive.size()) arr[++index] = positive.get(i++);
        while(j < negative.size()) arr[++index] = negative.get(j++);
        
        
    }
}