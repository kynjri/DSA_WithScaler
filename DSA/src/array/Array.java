package array;

public class Array {
	 public int singleNumber(final int[] A) {
	        int count=0;
	        for(int i=0;i<A.length;i++){
	            count=0;
	         for(int j=i;j<A.length;j++){
	               if(A[i]==A[j]) {
	                   count+=1;
	                   break;
	                   }
	               
	            }
	         for(int j=0;j<i;j++){
	               if(A[i]==A[j]) {
	                   count+=1; 
	                   break;
	                   }
	               
	            }
	            if(count==1)
	            return A[i];
	        }
	        return -1;
	    }
}
