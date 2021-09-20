class CommonElements
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        // code here 
        ArrayList<Integer> list = new ArrayList<>();
        int x=0, y=0, z=0;
        while(x<A.length && y<B.length && z<C.length){
            if(A[x] == B[y] && A[x] == C[z]  && !list.contains(A[x])) {
                list.add(A[x]);
                x++;
                y++;
                z++;
            }
            else if(A[x] <= B[y] && A[x] <= C[z]) x++;
            else if(B[y] <= A[x] && B[y] <= C[z]) y++;
            else z++;
        }

        
        
        return list;
    }
}