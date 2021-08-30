class MissingNumberInArray {
    int MissingNumber(int array[], int n) {
        // Your Code Here
        int missing = 1;
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int i=0; i<n-1; i++){
            set.add(array[i]);
        }
        
        for(int i=0; i<n; i++){
            if(!set.contains(missing)) break;
            missing++;
        }
        return missing;
    }
}
