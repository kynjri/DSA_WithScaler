package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorBased {
	 public int[] fSort(int[] A) {
		 Integer[] a=new Integer[A.length];
		 for(int i=0;i<A.length;i++) {
			 a[i]=A[i];
		 }
		 
		 Comparator<Integer> com=new Comparator<Integer>(){          
             @Override public int compare(Integer o1,Integer o2){
                int c1=fact(o1),c2=fact(o2);
                if(c1>c2){
                    return 1;
                }
                else if(c1==c2){
                    if(o1>o2)
                    return 1;
                    else
                    return -1;
                }
                else
                return -1;
            }
        };
	       Arrays.sort(a,com);
	        
	       for(int i=0;i<A.length;i++) {
				 A[i]=a[i];
				 }
			return A;
	    }
	  
	     public int fact(int A) {
	        int count=0;
	        for(int i=1;i*i<=A;i++){
	            if(A%i==0){
	                if(i*i==A)
	                count+=1;
	                else
	            count+=2;
	            }
	        }
	        return count;
	    }
	   public int[]  tensPlaceSort(int[] A){
		   String [] B=new String[A.length];
		    int c=0;
		    for(int i:A){
		        B[c]=Integer.toString(i);c+=1;
		    }
		    Comparator<String> cs= new Comparator<String>(){
		        
		        @Override public int compare(String X, String Y){
		        	
		             int l1=X.length()-2,l2=Y.length()-2;
	                 //System.out.println(X+" "+l1+" "+Y+" "+l2);
	                 int val1=0,val2=0;
	                 
	                 if(l1<0)
	                 val1=0;
	                 else
	                 val1=Character.getNumericValue(X.charAt(l1));
	                 if(l2<0)
	                 val2=0;
	                 else
	                 val2=Character.getNumericValue(Y.charAt(l2));
	                 //System.out.println(X+" "+val1+" "+Y+" "+val2);

	                 if(val1>val2) {
	                	 //System.out.println(val1+" "+val2);
	                 return 1;
	                 }
	                 else if(val1==val2){
	                     if(Integer.parseInt(X)<Integer.parseInt(Y)) {
	                     return 1;
	                     }
	                     else
	                     return -1;
	                 }
	                 else
	                 return -1;

		        }
		    };
		    
		    Arrays.sort(B,cs);	      
		       c=0;
		       for(String i:B){
	               A[c]=Integer.parseInt(i);	             
	               c++;
	           } 
		   
		    return A ;
	    	 
	     }
}
