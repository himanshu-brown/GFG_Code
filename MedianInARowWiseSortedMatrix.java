class MedianInARowWiseSortedMatrix{
    int median(int matrix[][], int r, int c) {
        
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                list.add(matrix[i][j]);
            }
        }
        
        Collections.sort(list);
        
        return list.get((r*c)/2);
              
    }
}