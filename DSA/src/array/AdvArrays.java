package array;

public class AdvArrays {
	 public int firstMissingPositive(int[] A) {
	        int N=A.length;
	        for(int i=0;i<N;i++){
	            if(A[i]<=0){
	                A[i]=N+2;
	            }
	        }
	        for(int i=0;i<N;i++){  //1 2 1
	        	int val=Math.abs(A[i]);
	           if(val<=N) {
	        	   A[val-1]=-1*Math.abs(A[val-1]);
	           }
	        }
	        for(int i=0;i<N;i++){
	            if(A[i]>0)
	              return i+1;	            
	        }
	        return N+1;
	    }
	 public int rowWithMaxNoOfOnes(int[][] A) {
	        int result=0,res=0,temp=0;
	        for(int i=0;i<A.length;i++){
	            for(int j=0;j<A[i].length;j++){
	                if(A[i][j]==1){
	                     temp=A[i].length-j;
	                     break;
	                }
	            }

	            if(temp>res) {
	            result=i;
	            res=temp;
	            System.out.println(temp+" "+ res);
	            }
	        }
	        return result;
	    }
}
