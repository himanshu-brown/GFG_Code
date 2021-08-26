	public int findPeak(int[] arr, int low, int high, int n){
	    
	    int mid = low+(high-low)/2;
	    
	    if((mid==0 || arr[mid-1]<=arr[mid]) && (mid==n-1 || arr[mid+1]<=arr[mid]))
	        return mid;
	    else if(mid>0 && arr[mid-1]>arr[mid]) return findPeak(arr,low,mid-1,n);
	    else return findPeak(arr,mid+1,high,n);
	    
	}
	
	public int peakElement(int[] arr,int n)
    {
       //add code here.
       return findPeak(arr,0,n-1,n);
       
    }
