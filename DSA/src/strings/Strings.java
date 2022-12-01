package strings;

public class Strings {
	public boolean subSequence(String str1,String str2) {
		int s1=str1.length(), s2=str2.length();
		int j=0;
		for(int i=0;i<s1 &&j<s2;i++) {
			if(str1.charAt(i)==str2.charAt(j))
				j++;
		}
		if(j==s2)
			return true;
		return false;
	}
	
	/* to lower case*/
	public char[] to_lower(char[] A) {
        char[] ans=new char[A.length];
        for(int i=0;i<A.length;i++){
        	 if(A[i]>=65 && A[i]<=90){
                 int c=(int)A[i];
  	           ans[i]=(char)(c+32);
              }
            else
            ans[i]=A[i];
        }
        return ans;
    }
	/* to upper case*/
	 public char[] to_upper(char[] A) {
         char[] ans=new char[A.length];
        for(int i=0;i<A.length;i++){
            if(A[i]>=97 && A[i]<=122){
               int c=(int)A[i];
	           ans[i]=(char)(c-32);
            }
            else
            ans[i]=A[i];
        }
        return ans;
    }
	 /* reverse a given string*/
	 public String reverse(String A) {
	        StringBuilder ans=new StringBuilder();
	        int n=A.length();
	      
	        for(int i=n-1;i>=0;i--){
	            
	            ans.append(A.charAt(i));
	        }
	       
	        return ans.toString();
	    }
//	 /*longest pallindrome naive approach*/
//	 public String longestPalindrome(String A) {
//	      String res="";
//
//	      String ans="";
//			  boolean bol=false;
//		       for(int l=0;l<A.length();l++) {
//		    	   for(int r=l;r<A.length();r++) {
//		    		   bol=palindrome(A,l,r);
//		    			  
//		   	        if(bol) {
//		   	        	ans=A.substring(l, r+1);
//
//		   	        	if(res.length()<=ans.length())
//		   	        		res=ans;
//		   	        }
//		    	   }
//		       }
//		        return res;
//	    }
//	    private boolean palindrome(String A,int l,int r){
//	        while(l<=r){
//		               if(A.charAt(l)!=A.charAt(r)) {
//		            	  return false;
//		            	   }
//		               r--;l++;
//	        }
//		     return true;      
//	    }
	 /*longest pallindrome optimised approach*/
	 public String longestPalindrome(String A) {
	      String res="";

	      String ans="";
			 
		       for(int i=0;i<A.length();i++) {
		    	  ans=palindrome(A, i, i);
		    	  System.out.println(ans);
		    	  if(ans.length()>res.length()) {
		    		  res=ans;
		    	  }
		    	  ans=palindrome(ans, i, i+1);
		    	  System.out.println(ans);
		    	  if(ans.length()>res.length()) {
		    		  res=ans;
		    	  }
		       }
		        return res;
	    }
	    private String palindrome(String A,int l,int r){
	    	String ans="";
	        while(l>=0 && r<A.length()){
		               if(A.charAt(l)==A.charAt(r)) {
		            	   //System.out.print(A.charAt(l)+" "+A.charAt(r));
		            	   r++;l--;
		            	   }
		               else {
		            	   //System.out.println(A.charAt(l)+" "+A.charAt(r));
		            	   ans=A.substring(l, r+1);
		            	   break;
		            	   }
	        }	        
		     return ans;      
	    }
	    /*longest common prefix*/
	    public String longestCommonPrefix(String[] A) {
	    	String ans="";
	    	String shortest=A[0];
	    	for(int i=1;i<A.length;i++){	
	    	    int s=shortest.length(),a=A[i].length();
	    	    if(s>a) {
	    	        shortest=A[i];	              
	    	    }
	    	}        
	    	for(int i=0;i<shortest.length();i++){
	    	    boolean flag=true;
	    	    for(int j=0;j<A.length;j++){
	    	        if(A[j].charAt(i)!=shortest.charAt(i)) {
	    	            flag=false; 
	                }
	    	    }
	    	    if(flag) {
	    	        ans=ans+Character.toString(shortest.charAt(i));
	    	        }
	    	    }
	    	return ans;
	     }
}
