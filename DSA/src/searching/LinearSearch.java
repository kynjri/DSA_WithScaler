package searching;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,60,60};
		int num=40;
		int res=search(arr,num);
		System.out.println(res);

	}
	//binary search iterative
	static int bSearch(int arr[], int num)
	{
		int low=0,high=arr.length;
		int mid=-1;
		
		while(low<=high) {
			mid=(low+high)/2;
			if(arr[mid]==num)
				return mid;
			else if(num>arr[mid]) low=mid+1;
			else high=mid-1;
		}
		return -1;
	}
	//binary search recursive
	static int binarySearch(int[] arr,int low,int high,int num) {
		
		int mid=(low+high)/2;
		
		if(arr[mid]==num) {
			return mid;
		}
		else if(low==high)
		return -1;
		else if(num>arr[mid]) {
			 return binarySearch(arr, mid+1, high, num);
		}
		else return binarySearch(arr, low, mid-1, num);
		
		
	}
	//index of first occurence in sorted
static int firstOccurence(int[] arr,int num) {
		int low=0,high=arr.length-1,mid;

		  while (low<=high) {
		    	mid=(low+high)/2;
		    	
		    	 if(num>arr[mid]){
		    		low=mid+1;
		    	}
		    	 else if(num<arr[mid]) high=mid-1;
		    	 
		    	 else{
		    		 if((mid==0||arr[mid]!=arr[mid-1])) 	return mid;
		    		 
		    		 else high=mid-1;
		    	
		    	 }		    	
		    		
		    }
		return -1;
	}
//index of last occurence in sorted
static int lastOccurence(int[] arr,int num) {
	int low=0,high=arr.length-1,mid;

	  while (low<=high) {
	    	mid=(low+high)/2;
	    	
	    	 if(num>arr[mid]){
	    		low=mid+1;
	    	}
	    	 else if(num<arr[mid]) high=mid-1;
	    	 
	    	 else{
	    		 if((mid==arr.length-1||arr[mid]!=arr[mid+1])) 	return mid;
	    		 
	    		 else low=mid+1;
	    	
	    	 }		    	
	    		
	    }
	return -1;
}
static int countOcc(int arr[], int n){
	int first = firstOccurence(arr, n);

	if(first == -1)
		return 0;
	else 
		return lastOccurence(arr, n) - first + 1;
}
 // search elements in an infinite array.
static int search(int arr[], int num)
{
	if(arr[0] == num) return 0;

	int i = 1;

	while(arr[i] < num)
		i = i * 2;

	if(arr[i] == num) return i;


	return binarySearch(arr, i / 2 + 1, i - 1, num);
}


}
