package recursion;

public class Recurse {
	public  int Palindrome(String A) {
        return palinD(A,0,A.length()-1);
    }
    private int palinD(String A,int s,int e) {
    	  if(s>e)
    		  return 1;
          if(A.charAt(s)!=A.charAt(e)){
        	  //System.out.println(A.charAt(s)+" "+A.charAt(e));
              return 0;
          }
          return  palinD(A,s+1,e-1);	          	      	           	         
      }


}
