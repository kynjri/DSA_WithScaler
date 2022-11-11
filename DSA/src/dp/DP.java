package dp;

import java.util.HashMap;

public class DP {
	static HashMap<Integer,Integer> hm=new HashMap<>();
	public static void main(String[] args) {
		System.out.println(fib(10));

	}


	static int fib(int x) {
		if(x==0||x==1)
			return 1;
		
		if(hm.containsKey(x))
			return hm.get(x);
		return fib(x-1)+fib(x-2);
		
	}
}
