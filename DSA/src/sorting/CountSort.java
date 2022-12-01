package sorting;

public class CountSort {
	 public int[] countSort(int[] A) { //6, 3, 3, 6, 7, 8, 7, 3, 7
	        int N=0;
	        for(int i=0;i<A.length;i++){
	            if(A[i]>N){N=A[i];
	            }           
	        }
	        int[] count=new int[N+1];

	        for(int i=0;i<A.length;i++){
	            count[A[i]]+=1;
	        }
	         for(int i=1;i<count.length;i++){
	            count[i]=count[i]+count[i-1];
	        }
	         int[] res=new int[A.length];

	        for(int i=A.length-1;i>=0;i--){
	            res[count[A[i]]-1]=A[i];
	            count[A[i]]--;
	        }
	        return res;
	    }
}
