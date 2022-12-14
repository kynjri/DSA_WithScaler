package gcd;

public class Gcd {
	 public int gcd(int A, int B) {
	        if (A == 0)
	            return B;
	        return gcd(B % A, A);   
	    }

	    public int  deleteOne(int[] A) {
	        int[] pref=new int[A.length];
	        int[] suff=new int[A.length];
	        pref[0]=A[0];
	        for(int i=1;i<A.length;i++){
	            pref[i]=gcd(pref[i-1],A[i]);
	        }
	        
	        suff[A.length-1]=A[A.length-1];
	        for(int i=A.length-2;i>=0;i--){
	            suff[i]=gcd(suff[i+1],A[i]);
	        }

	        int ans=0,g=0;
	        for(int i=0;i<A.length;i++){
	            if(i==0)
	                g=suff[i+1];
	            else if(i==A.length-1)
	            g=pref[i-1];
	            else
	            g=gcd(pref[i-1],suff[i+1]);
	           ans=Math.max(ans,g);
	        }
	        return ans;
	    }

}
