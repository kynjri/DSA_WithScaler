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
            if(A[i]>='A' && A[i]<='Z'){
                ans[i]=(char)(Character.getNumericValue(A[i])+32);
            }
            else
            ans[i]=A[i];
        }
        return ans;
    }

}
