package hashing;

public class Test {

	public static void main(String[] args) {
		int[] arr= {1, 2, 1, 2};
		Hashing hashing=new Hashing();
		/*
 		hashing.subArrayWithGivenSum(arr, 0)
		hashing.colorful(0)
		hashing.dNums(arr, 1);
		hashing.solve(null, null)
		*/

		int a=hashing.countPairDifference(arr, 1);
		
		System.out.print(a);

	}

}
