package hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Hashing {
	int[] arr;
	public Hashing(int[] arr) {
		this.arr=arr;
	}
	public Hashing() {}
public boolean subArrayWithGivenSum(int[] arr, int sum) {
	
	HashSet<Integer> hs= new HashSet<>();
	int currSum=0;
	for(int i=0;i<arr.length-1;i++) {
		currSum=currSum+arr[i];
		if(currSum==sum)
			return true;
		if(hs.contains(currSum-sum))
			return true;
		hs.add(currSum);
	}
	return false;
}
public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
    HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();

    for(int i=0;i<A.size();i++){
       if(map.containsKey(A.get(i))){
           map.put(A.get(i),map.get(A.get(i))+1);
       }
       else
       map.put(A.get(i),1);
    }
    ArrayList<Integer> ans= new ArrayList<Integer>();
    for(int i=0;i<B.size();i++){
        if(map.containsKey(B.get(i))){
            ans.add(map.get(B.get(i)));
        }
        else
        ans.add(0);
    }
    return ans;
}
}
