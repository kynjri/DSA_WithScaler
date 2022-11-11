package array;

public class ArrayRotation {
	
	public int[][] solve(int[] A, int[] B) {
		int[][] ans=new int[B.length][A.length];
		//int[] temp=A;
		
		for(int i=0;i<B.length;i++) {
			ans[i]=arrayRotation(A,B[i]);
		}
		return ans;
        
    }
	 public int[] arrayRotation(int[] A, int B) {
		 int[] tem_A=new int[A.length];
	        int N=A.length;
	        B=B%N;
	        if(B==0)
	        return A;
	        B=N-B;
	        //System.out.println(B);
	        int start=0,end=A.length-1;
	        int temp=0;
	       for(int i=0,j=N-1;i<N;i++,j--){
	    	   tem_A[i]=A[j];

	        }
	         start=0;end=B-1;
	        
	         while(start<end){
	            temp=tem_A[start];
	            tem_A[start]=tem_A[end];
	            tem_A[end]=temp;

	            start+=1;
	            end-=1;
	        }
	        start=B;
	        end=A.length-1;
	        while(start<end){
	            temp=tem_A[start];
	            tem_A[start]=tem_A[end];
	            tem_A[end]=temp;

	            start+=1;
	            end-=1;

	        }
	        return tem_A;

	    }
	 public int MinChristmas(int[] A, int[] B) {
	        int ans=Integer.MAX_VALUE;

	        for(int m=0;m<A.length;m++){  // a={100,101,100},b= {2,4,5};
	        	
                int cost=B[m];
                //System.out.println("cost "+cost);
	        	//left
                int leftCost =Integer.MAX_VALUE/2;
                for(int l=m-1;l>=0;l--){
                	
                	//System.out.println("l "+l);
                	if(A[m]>A[l] && B[l]<leftCost) {
                		leftCost=B[l];
                		//System.out.println("leftCost "+leftCost);
                		
                	}
                }
                if(leftCost==Integer.MAX_VALUE/2) {
            		leftCost=0;
            		//System.out.println("leftcost"+leftCost);
            	}
              
                //right
                int rightCost=Integer.MAX_VALUE/2;
                for(int r=m+1;r<A.length;r++){
                	//System.out.println("r "+r);
                	if(A[m]<A[r] && B[r]<rightCost) {
                		rightCost=B[r];
                		//System.out.println("rightCost "+rightCost);
                		
                	}
                  
                }
                if(rightCost==Integer.MAX_VALUE/2)
                	rightCost=0;
                if(leftCost==0 || rightCost==0)
                	cost=Integer.MAX_VALUE;
                else
                cost+=leftCost+rightCost;
                
               //System.out.println("l+r "+cost);
               
                if(cost<ans)
                ans=cost;
                
            }
	        if(ans==Integer.MAX_VALUE)
	        return -1;
	        return ans;
	    }

}
