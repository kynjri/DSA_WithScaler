package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LexicalSorting {
	 public String largestNumber(final List<Integer> A) {
	        ArrayList<String> B=new ArrayList<>();
	        for(int i:A){
	            B.add(String.valueOf(i));
	        }
	        Collections.sort(B);
	        
	        for(String i:B) {
	        	System.out.print(i+" ");
	        }
	        String ans="";
	        for(String i:B){
	            ans+=i;
	        }
	        return "-1";
	    }
	 public String largestNumber2(final int[] A) {
	        String [] B=new String[A.length];
	        int c=0;
	        for(int i:A){
	            B[c]=Integer.toString(i);c+=1;
	        }
	        Comparator<String> cs= new Comparator<String>(){
	        
	            @Override public int compare(String X, String Y){
	                String XY = X + Y;
	                String YX = Y + X;
	                return XY.compareTo(YX) > 0 ? -1 : 1;
	            }
	        };
	        Arrays.sort(B,cs);
	        
	         String ans="";
	        for(String i:B){
	            ans+=i;
	        }
	        return ans;
	    }
}
