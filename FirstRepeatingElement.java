class FirstRepeatingElement{
    // Function to return the position of the first repeating element.
    public static int firstRepeated(int[] arr, int n) {
        // Your code 
        Set<Integer> set = new HashSet<>();
        
        int index=-1;
        
        for(int i=n-1; i>=0; i--){
            if(set.contains(arr[i])) index = i+1;
            else set.add(arr[i]);
        }
        
        if(index != -1) return index;
        return index;
        
    }
}
