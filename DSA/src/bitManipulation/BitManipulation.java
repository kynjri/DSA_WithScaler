package bitManipulation;

public class BitManipulation {
	public int unsetSet(int A, int B) {
        int b=0;
       if(B==0)
        b=1;
        else
         b=(int)Math.pow(2,B);
       //System.out.println(b);
         int a=A;
         int aa=(A>>B)&1;
         //System.out.println(aa);
         if(aa==1){
        	 System.out.println("hii");
             a=a^b;
         }
         
         return a;

    }

}
