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
	 
}
