package hashing;

public class Test {

	public static void main(String[] args) {
		int[] arr= {2, 7, 7, 81, 81};
		Hashing hashing=new Hashing();
		/*
		hashing.colorful(0)
		hashing.dNums(arr, 1);
		hashing.subArrayWithGivenSum(arr, 0)
		hashing.solve(null, null)
		*/

		int[] ar=hashing.dNums(arr, 1);
		for(int a:ar)
		System.out.print(a+" ");

	}

}
