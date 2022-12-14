package array;

public class Test {
	public static void main(String[] args) {

        Array a=new Array();
        int[][] arr= {{0, 1, 1},
        		      {0, 0, 1},
        		      {0, 1, 1}};
//        System.out.println(a.singleNumber(arr));
       AdvArrays ar=new AdvArrays();
        int res= ar.rowWithMaxNoOfOnes(arr);
        System.out.println(res);
	}
}
